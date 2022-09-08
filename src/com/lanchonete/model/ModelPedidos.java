/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lanchonete.model;

import com.lanchonete.classes.Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Neax
 */
public class ModelPedidos extends AbstractTableModel {

    private List<Pedido> pedidos = new ArrayList();

    public List<Pedido> getPedidos() {
        return pedidos;
    }

        private String[] colunas = new String[]{
        "ID", "preço", "entrega prevista"};

    
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return pedidos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pedido pedido = pedidos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pedido.getIdPedido();
            case 1:
                return pedido.getPreco();
            case 2:
                return pedido.getDataEntregaProgramada();
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
        System.out.println(pedidos.size());
    }

}
