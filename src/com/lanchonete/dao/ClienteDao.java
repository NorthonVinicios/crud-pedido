/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lanchonete.dao;

import com.lanchonete.classes.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neax
 */
public class ClienteDao {

    public Connection connection;

    public ClienteDao() {
        try {
            String url = "jdbc:postgresql://localhost:5432/produto";
            String user = "postgres";
            String password = "admin";
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
        }
    }

    public List<Cliente> list() {
        String sql = "SELECT * FROM cliente";
        List<Cliente> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Cliente client = new Cliente();
                client.setIdCliente(result.getInt("id_cliente"));
                client.setNome(result.getString("nome"));
                list.add(client);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Cliente findById(Integer id) {
        String sql = "SELECT * FROM cliente WHERE id_cliente=?";
        List<Cliente> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Cliente client = new Cliente();
                client.setIdCliente(result.getInt("id_cliente"));
                client.setNome(result.getString("nome"));
                list.add(client);
            }
        } catch (Exception e) {
        }
        return list.get(0);
    }

    public List<Cliente> findByName(String nome) {
        String sql = "SELECT * FROM cliente WHERE nome LIKE '%?%'";
        List<Cliente> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Cliente client = new Cliente();
                client.setIdCliente(result.getInt("id_cliente"));
                client.setNome(result.getString("nome"));
                list.add(client);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean save(Cliente client) {
        String sql = "INSERT INTO cliente(nome) VALUES(?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, client.getNome());
            stmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(Cliente client) {
        String sql = "UPDATE cliente SET nome=? WHERE id_cliente=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, client.getNome());
            stmt.setInt(2, client.getIdCliente());
            stmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(Cliente client) {
        String sql = "DELETE FROM cliente WHERE id_cliente=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, client.getIdCliente());
            stmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
