/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lanchonete.db;

import com.lanchonete.classes.Cliente;
import com.lanchonete.classes.Pedido;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Connect {

    private String url;
    private String user;
    private String password;
    public Connection connection;

    public Connect() {
        url = "jdbc:postgresql://localhost:5432/produto";
        user = "postgres";
        password = "admin";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int ultimoPedido() {
        try {
            String sql = "select max(id_pedido) from pedido";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet result = stm.executeQuery();
            result.next();
            int id = result.getInt("max");

            return id + 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int ultimoProduto() {
        try {
            String sql = "select max(id_produto) from produto";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet result = stm.executeQuery();
            result.next();
            int id = result.getInt("max");

            return id + 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 7;
        }
    }

    public String getHoras() {
        String hora = (LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute());
        String data = (LocalDateTime.now().getDayOfMonth() + "/" + LocalDateTime.now().getMonth() + "/" + LocalDateTime.now().getYear());
        return data + " | " + hora;
    }

    public String getHoraMaisQuinze() {
        String hora = (LocalDateTime.now().plusMinutes(15).getHour() + ":" + (LocalDateTime.now().plusMinutes(15).getMinute()));
        String data = (LocalDateTime.now().plusMinutes(15).getDayOfMonth() + "/" + LocalDateTime.now().plusMinutes(15).getMonth() + "/" + LocalDateTime.now().getYear());
        return data + " | " + hora;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
