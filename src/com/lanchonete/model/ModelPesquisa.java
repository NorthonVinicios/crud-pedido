/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lanchonete.model;

import com.lanchonete.classes.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class ModelPesquisa extends AbstractTableModel {

    private List<Produto> produtos = new ArrayList();
    
    private String[] colunas = new String[]{
        "selecionar", "ID", "Produto", "valor"};

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = produtos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return produto.getAction();
            case 1:
                return produto.getIdProduto();
            case 2:
                return produto.getNomeProduto();
            case 3:
                return produto.getValor();
            default:
                return "";
        }
    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        Produto doc = produtos.get(rowIndex);
        if (columnIndex == 0) {
            for (Produto f : produtos) {
                if (f.getIdProduto() == doc.getIdProduto()) {
                    f.setAction((Boolean) aValue);
                    fireTableDataChanged();
                }
            }
        }

    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 0;
    }

    public void setData(List<Produto> produtos) {
        if (produtos == null) {
            this.produtos = new ArrayList<Produto>();
        } else {
            this.produtos = produtos;
        }
        try {
            fireTableDataChanged();
            fireTableRowsInserted(produtos.size() - 1, produtos.size() - 1);
        } catch (Exception e) {
        }
    }

    public void setValueFalse() throws Exception {
        for (Produto f : produtos) {
            f.setAction(false);
            fireTableDataChanged();
        }
    }

    public void setValueTrue() throws Exception {
        for (Produto f : produtos) {
            f.setAction(true);
            fireTableDataChanged();
        }

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnIndex == 0 ? Boolean.class
                : String.class;
    }

    public List<Produto> getSelecionados() {
        List<Produto> newprodutos = new ArrayList<>();
        for (Produto it : produtos) {
            if (it.getAction()) {
                newprodutos.add(it);
            }
        }
        return newprodutos;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

}
