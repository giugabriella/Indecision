/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.indecision_livraria;

/**
 *
 * @author Assistência Técnica
 */
import javax.swing.JOptionPane;
public class Login {
    public static void main(String[] args) throws Exception{
        //1- Cadastrar uma pessoa
        //2- Listar os dados de todas as pessoas
        //3- Atualizar os dados de uma pessoa
        //4- Remover uma pessoa
        //0- Sair
        String menu = "1-Cadastrar\n2-Listar\n3-Atualizar\n4-Remover\n0-Sair";
        int op;
        do{
            op = Integer.parseInt(
                JOptionPane.showInputDialog(menu)
            );
            switch(op){
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome");
                    String fone = JOptionPane.showInputDialog("Digite o fone");
                    String email = JOptionPane.showInputDialog("Digite o email");
                    var pessoa = new Pessoa(nome, fone, email);
                    //mapeamento objeto relacional
                    //explicar como se dá a representação de um objeto pessoa no modelo relacional, ou seja,
                    //usando tabelas (JDBC)
                    var pessoaADU = new PessoaADU();
                    pessoaADU.cadastrar(pessoa);
                    break;
                }
            }
         while(op != 0);
    }
}
