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

/**
 *
 * @author Neax
 */
public class ModelProdutoListagem extends AbstractTableModel {

    private List<Produto> produtos = new ArrayList();

    private String[] colunas = new String[]{
        "ID", "Produto", "Tamanho", "Cor", "Valor"};

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
        return 5;
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
                return produto.getTamanhoProduto();
            case 3:
                return produto.getCor();
            case 4:
                return produto.getValor();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
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
