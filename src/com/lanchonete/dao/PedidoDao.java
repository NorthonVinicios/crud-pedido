/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lanchonete.dao;

import com.lanchonete.classes.Cliente;
import com.lanchonete.classes.Pedido;
import com.lanchonete.classes.Produto;
import com.lanchonete.db.Connect;
import static com.lanchonete.main.Main.nome;
import static com.lanchonete.main.Main.senha;
import static com.lanchonete.main.Main.url;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoDao {

    public Connection connection;
    private ClienteDao daoCliente = new ClienteDao();
    ProdutoDao daoProduto = new ProdutoDao();
     Connect banco = new Connect();

    public PedidoDao() {
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
                pedido.setPreco(result.getInt("preco"));

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
                pedido.setIdPedido(result.getInt("id_pedido"));
                pedido.setDataEntregaEfetivada(result.getString("data_entrega_efetivada"));
                pedido.setDataEntregaProgramada(result.getString("data_entrega_programada"));
                pedido.setDataPedido(result.getString("data_pedido"));
                pedido.setFormaPagamento(result.getInt("forma_pagamento"));
                pedido.setIdCliente(daoCliente.findById(result.getInt("id_cliente")));
                pedido.setPreco(result.getInt("preco"));
                pedido.setProdutoList(listProd(result.getInt("id_pedido")));
                list.add(pedido);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list.get(0);
    }

public List<Pedido> listByIdCliente(int id) {
        String sql = "SELECT * FROM pedido WHERE id_cliente= ?";
        List<Pedido> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(result.getInt("id_pedido"));

                pedido.setDataEntregaEfetivada(result.getString("data_entrega_efetivada"));
                pedido.setDataEntregaProgramada(result.getString("data_entrega_programada"));
                pedido.setDataPedido(result.getString("data_pedido"));
                pedido.setFormaPagamento(result.getInt("forma_pagamento"));
                pedido.setIdCliente(daoCliente.findById(result.getInt("id_cliente")));
                pedido.setPreco(result.getInt("preco"));

                list.add(pedido);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean save(Pedido pedido) {
        String sql = "INSERT INTO pedido(data_pedido,data_entrega_programada,data_entrega_efetivada,forma_pagamento,id_cliente,preco) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pedido.getDataPedido());
            stmt.setString(2, pedido.getDataEntregaProgramada());
            stmt.setString(3, pedido.getDataEntregaEfetivada());
            stmt.setInt(4, pedido.getFormaPagamento());
            stmt.setInt(5, pedido.getIdCliente().getIdCliente());
            stmt.setInt(6, pedido.getPreco());
            stmt.execute();

            saveProdutos(pedido.getProdutoList(), banco.ultimoPedido()-1);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(Pedido pedido) {
        String sql = "UPDATE pedido SET data_pedido=?,data_entrega_programada=?,data_entrega_efetivada=?,forma_pagamento=?,id_cliente=?,preco=? WHERE id_pedido=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pedido.getDataPedido());
            stmt.setString(2, pedido.getDataEntregaProgramada());
            stmt.setString(3, pedido.getDataEntregaEfetivada());
            stmt.setInt(4, pedido.getFormaPagamento());
            stmt.setInt(5, pedido.getIdCliente().getIdCliente());
            stmt.setInt(6, pedido.getPreco());
            stmt.setInt(7, pedido.getIdPedido());
            saveProdutos(pedido.getProdutoList(), pedido.getIdPedido());
            stmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(int id) {
        System.out.println("id: " + id);
        String sql = "DELETE FROM pedido WHERE id_pedido= ?";
        try {

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
     public boolean deleteIt(int id) {
        System.out.println("id: " + id);
        String sql = "DELETE FROM produto_pedido WHERE pedido= ?";
        try {

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            deleteIt(id);
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
                return false;
            }
        } catch (Exception e) {
        }

        return true;
    }

    private boolean saveProdutos(List<Produto> lista, int idPed) {
        String sql = "INSERT INTO produto_pedido(pedido,produto) VALUES(?,?)";
        try {
            for (Produto prod : lista) {
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, idPed);
                stmt.setInt(2, prod.getIdProduto());
                stmt.execute();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Produto> listProd(int id) {
        String sql = "SELECT * FROM produto_pedido WHERE pedido=?";
        List<Produto> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Produto prod = daoProduto.findById(result.getInt("produto"));
                list.add(prod);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
