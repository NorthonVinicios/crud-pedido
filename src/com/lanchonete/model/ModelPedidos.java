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

    private List<Pedido> produtos = new ArrayList();

    public List<Pedido> getPedidos() {
        return produtos;
    }

    public void setPedidos(List<Pedido> produtos) {
        this.produtos = produtos;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pedido pedido = produtos.get(rowIndex);
        switch (columnIndex) {
            case 1:
                return pedido.getIdPedido();
            case 2:
                return pedido.getIdCliente().getNome();
            case 3:
                return pedido.getPreco();
            case 4:
                return pedido.getDataEntregaProgramada();
            default:
                return "";
        }
    }

}
