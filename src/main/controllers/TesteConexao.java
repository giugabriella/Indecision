/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.indecision_livraria;

import javax.swing.JOptionPane;

/**
 *
 * @author Assistência Técnica
 */
public class TesteConexao {
     public static void main(String[] args){
        try{
            var factory = new ConexaoLivraria();
            var minhaConexao = factory.conectar();
            System.out.println("Conectou!!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(
                    null, 
                    e.getMessage()
            );
            e.printStackTrace();
        }
    }
}
