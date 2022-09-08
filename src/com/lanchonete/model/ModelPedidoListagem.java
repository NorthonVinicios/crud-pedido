/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lanchonete.model;

import com.lanchonete.classes.Pedido;
import com.lanchonete.db.Connect;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Neax
 */
public class ModelPedidoListagem extends AbstractTableModel {

    Connect banco = new Connect();
    private List<Pedido> pedidos = new ArrayList();

    private String[] colunas = new String[]{
        "ID", "Cliente", "Data Cadastro", "Entrega Programada", "Entrega Efetivada", "Forma de Pagamento", "Produtos", "Total"};

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> produtos) {
        this.pedidos = produtos;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return pedidos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pedido ped = pedidos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ped.getIdPedido();
            case 1:
                return ped.getIdCliente().getNome();
            case 2:
                return ped.getDataPedido().split("-")[0];
            case 3:
                return ped.getDataEntregaProgramada().split("-")[1];
            case 4:
                return ped.getDataEntregaEfetivada().split("-")[1];
            case 5:
                return banco.retornaPagamento(ped.getFormaPagamento());
            case 6:
                return ped.getProdutoList().size();
            case 7:
                return ped.getPreco();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    public void setData(List<Pedido> lista) {
        if (lista == null) {
            this.pedidos = new ArrayList<Pedido>();
        } else {
            this.pedidos = lista;
        }
        try {
            fireTableDataChanged();
            fireTableRowsInserted(lista.size() - 1, lista.size() - 1);
        } catch (Exception e) {
        }
    }

}
