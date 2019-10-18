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
public class Curso {
    private String nome, codigo;
    private Professor professor;
    
    //Construtores
    Curso(String nome, String codigo, Professor professor){
        this.nome = nome;
        this.codigo = codigo;
        this.professor = professor;
    }
    
    Curso(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }
    
    Curso(){
        
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
    
    //Professor
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    
    public Professor getProfessor(){
        return this.professor;
    }
}



