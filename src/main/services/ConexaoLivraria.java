/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.indecision_livraria;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Assistência Técnica
 */
public class ConexaoLivraria {
    private static final String host = "mysql-307592ca-raphael.aivencloud.com";
    private static final String port = "13111";
    private static final String user = "avnadmin";
    //maquinas da USJT: senha anima123
    private static final String password = "AVNS_1EHO7Cs67LwNcgF8Bm9";
    private static final String db = "defaultdb";
    
    public static Connection conectar() throws Exception {
        //http://dontpad.com:80/bossini
        //String de conexão
        //String s = "jdbc:mysql://" + host + ":" + port + "/" + db;
        String s = String.format(
            "jdbc:mysql://%s:%s/%s",
            host, port, db
        );
        
        Connection c = DriverManager.getConnection(
                s, 
                user, 
                password
        );
        return c;
    }
}
