/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lanchonete.main;

import com.lanchonete.view.Frame;



public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
    }
    
    public static String senha(){
        return "admin";
    }
    public static String nome(){
        return "postgres";
    }
    public static String url(){
        return "jdbc:postgresql://localhost:5432/produto";
    }
}
