/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lanchonete.model;

import com.lanchonete.classes.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ModelPesquisa extends AbstractTableModel {

    private List<Produto> produtos = new ArrayList();

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
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = produtos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return produto.getIdProduto();
            case 1:
                return produto.getNomeProduto();
            case 2:
                System.out.println(produto.getValor());
                return produto.getValor();
            case 4:
                return "";
            default:
                return "";
        }
    }

    public void setData(List<Produto> lista) {
        if (lista == null) {
            this.produtos = new ArrayList<Produto>();
        } else {
            this.produtos = lista;
        }
        try {
            fireTableDataChanged();
            fireTableRowsInserted(lista.size() - 1, lista.size() - 1);
        } catch (Exception e) {
        }
    }

}
