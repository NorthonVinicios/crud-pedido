/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lanchonete.dao;

import com.lanchonete.classes.Cliente;
import com.lanchonete.classes.Pedido;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoDao {

    public Connection connection;
    private ClienteDao daoCliente = new ClienteDao();

    public PedidoDao() {
        try {
            String url = "jdbc:postgresql://localhost:5432/produto";
            String user = "postgres";
            String password = "admin";
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Pedido> list() {
        String sql = "SELECT * FROM pedido";
        List<Pedido> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(result.getInt("id_pedido"));

                pedido.setDataEntregaEfetivada(result.getString("data_entrega_efetivada"));
                pedido.setDataEntregaProgramada(result.getString("data_entrega_programada"));
                pedido.setDataPedido(result.getString("data_pedido"));
                pedido.setFormaPagamento(result.getInt("forma_pagamento"));
                pedido.setIdCliente(daoCliente.findById(result.getInt("id_cliente")));

                list.add(pedido);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Pedido findById(Integer id) {
        String sql = "SELECT * FROM pedido WHERE id_pedido=?";
        List<Pedido> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Pedido pedido = new Pedido();
                pedido.setDataEntregaEfetivada(result.getString("data_entrega_efetivada"));
                pedido.setDataEntregaProgramada(result.getString("data_entrega_programada"));
                pedido.setDataPedido(result.getString("data_pedido"));
                pedido.setFormaPagamento(result.getInt("forma_pagamento"));
                pedido.setIdCliente(daoCliente.findById(result.getInt("id_cliente")));
                list.add(pedido);
            }
        } catch (Exception e) {
        }
        return list.get(0);
    }

    public boolean save(Pedido pedido) {
        String sql = "INSERT INTO pedido(data_pedido,data_entrega_programa,data_entrefa_efetiva,forma_pagamento,id_cliente) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pedido.getDataPedido());
            stmt.setString(2, pedido.getDataEntregaProgramada());
            stmt.setString(3, pedido.getDataEntregaEfetivada());
            stmt.setInt(4, pedido.getFormaPagamento());
            stmt.setInt(5, pedido.getIdCliente().getIdCliente());
            stmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(Pedido pedido) {
        String sql = "UPDATE pedido SET data_pedido=?,data_entrega_programa=?,data_entrefa_efetiva=?,forma_pagamento=?,id_cliente=? WHERE id_pedido=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pedido.getDataPedido());
            stmt.setString(2, pedido.getDataEntregaProgramada());
            stmt.setString(3, pedido.getDataEntregaEfetivada());
            stmt.setInt(4, pedido.getFormaPagamento());
            stmt.setInt(5, pedido.getIdCliente().getIdCliente());
            stmt.setInt(6, pedido.getIdPedido());
            stmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(Pedido pedido) {
        String sql = "DELETE FROM pedido WHERE id_pedido=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pedido.getIdPedido());
            stmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean pedidoExists(int id) {
        String sql = "SELECT * FROM pedido WHERE id_pedido=?";
        List<Pedido> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Pedido client = new Pedido();
                client.setIdPedido(result.getInt("id_pedido"));
                list.add(client);
            }
            if (list.isEmpty()) {
                System.out.println("EXISTE");
                return false;
            }
        } catch (Exception e) {
        }

        return true;
    }
}
