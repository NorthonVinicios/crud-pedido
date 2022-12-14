/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lanchonete.dao;

import com.lanchonete.classes.Produto;
import static com.lanchonete.main.Main.nome;
import static com.lanchonete.main.Main.senha;
import static com.lanchonete.main.Main.url;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {

    public Connection connection;

    public ProdutoDao() {
        try {
            String url = url();
            String user = nome();
            String password = senha();
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Produto> list() {
        String sql = "SELECT * FROM produto";
        List<Produto> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(result.getInt("id_produto"));
                produto.setNomeProduto(result.getString("nome_produto"));
                produto.setCor(result.getInt("cor"));
                produto.setValor(result.getInt("valor"));
                produto.setTamanhoProduto(result.getString("tamanho_produto"));
                list.add(produto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Produto findById(Integer id) {
        String sql = "SELECT * FROM produto WHERE id_produto=?";
        List<Produto> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(result.getInt("id_produto"));
                produto.setNomeProduto(result.getString("nome_produto"));
                produto.setCor(result.getInt("cor"));
                produto.setValor(result.getInt("valor"));
                produto.setTamanhoProduto(result.getString("tamanho_produto"));
                list.add(produto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list.get(0);
    }

    public List<Produto> findByName(String nome) {
        String sql = "SELECT * FROM produto WHERE nome_produto LIKE ?";
        List<Produto> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(result.getInt("id_produto"));
                produto.setNomeProduto(result.getString("nome_produto"));
                produto.setCor(result.getInt("cor"));
                produto.setValor(result.getInt("valor"));
                produto.setTamanhoProduto(result.getString("tamanho_produto"));
                list.add(produto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean save(Produto produto) {
        String sql = "INSERT INTO produto(nome_produto, tamanho_produto, cor, valor) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNomeProduto());
            stmt.setString(2, produto.getTamanhoProduto());
            stmt.setInt(3, produto.getCor());
            stmt.setInt(4, produto.getValor());
            stmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(Produto produto) {
        String sql = "UPDATE produto SET nome_produto=?, tamanho_produto=?, cor=?, valor=? WHERE id_produto=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNomeProduto());
            stmt.setString(2, produto.getTamanhoProduto());
            stmt.setInt(3, produto.getCor());
            stmt.setInt(4, produto.getValor());
            stmt.setInt(5, produto.getIdProduto());
            stmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(Produto produto) {
        String sql = "DELETE FROM produto WHERE id_produto=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, produto.getIdProduto());
            stmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean produtoExists(int id) {
        String sql = "SELECT * FROM produto WHERE id_produto=?";
        List<Produto> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Produto client = new Produto();
                client.setIdProduto(result.getInt("id_produto"));
                list.add(client);
            }
            if (list.isEmpty()) {
                System.out.println("EXISTE");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }



}
