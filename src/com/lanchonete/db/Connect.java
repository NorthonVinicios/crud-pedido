/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lanchonete.db;

import java.sql.*;

/**
 *
 * @author Neax
 */
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
            System.out.println("Conexão bem sucedida!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int executaSql(String sql) {
        try {
            Statement stm = connection.createStatement();
            int res = stm.executeUpdate(sql);
            connection.close();
            return res;
            
        } catch (Exception e) {
            return 0;
        }
    }

}
