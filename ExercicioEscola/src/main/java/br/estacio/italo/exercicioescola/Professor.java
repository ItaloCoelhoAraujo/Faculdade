/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.italo.exercicioescola;

/**
 *
 * @author Aluno
 */
public class Professor {
    String nome, codigo;
    Curso curso;
    ContaBancaria conta;
    
    //Construtores
    Professor(String nome, String codigo, Curso curso, ContaBancaria conta){
        this.nome = nome;
        this.codigo = codigo;
        this.curso = curso;
        this.conta = conta;
    }
    
    Professor(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }
    
    Professor(){
        
    }
    
    //Setters e Getters
    //Nome
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    //Codigo
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
    //Curso
    public void setCurso(Curso curso){
        this.curso = curso;
    }
    
    public Curso getCurso(){
        return this.curso;
    }
    
    //Conta
    public void setConta(ContaBancaria conta){
        this.conta = conta;
    }
    
    public ContaBancaria getConta(){
        return this.conta;
    }
}



