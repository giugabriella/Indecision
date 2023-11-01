/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author Assistência Técnica
 */
public class Livro {
    private String titulo;
    private int edicao;
    private int data_Lancamento;
    private String isbn;
    private Autor autor;
    private Editora editora;

    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
     public int getEdicao(){
        return edicao;
    }
    
    public void setEdicao(int edicao){
        this.edicao= edicao;
    }
    
       public int getData_Lancamento(){
        return data_Lancamento;
    }
    
    public void setData_Lancamento(int data_Lancamento){
        this.data_Lancamento= data_Lancamento;
    }
    
      public String getISBN(){
        return isbn;
    }
    
    public void setISBN(String isbn){
        this.isbn = isbn;
    }
    
    public Autor getAutor(){
        return autor;
    }
    
    public void setAutor (Autor autor){
        this.autor = autor;
    }
    
     public Editora getEditora(){
        return editora;
    }
    
    public void setEditora (Editora editora){
        this.editora = editora;
    }
}
