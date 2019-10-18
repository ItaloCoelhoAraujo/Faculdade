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
public class Aluno {
    private String nome, matricula;
    private float AV1, AV2, AV3;
    private Curso curso;
    
    //Construtores
    Aluno(String nome, String matricula, Curso curso, float AV1, float AV2, float AV3){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.AV1 = AV1;
        this.AV2 = AV2;
        this.AV3 = AV3;
    }
    
    Aluno(String nome, String matricula, Curso curso, float AV1, float AV2){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.AV1 = AV1;
        this.AV2 = AV2;
    }
    
    Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    
    Aluno(){
        
    }
    
    //Getters e Setters
    //Nome
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    //Matricula
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    //AV1
    public void setAV1(float nota){
        this.AV1 = nota;
    }
    
    public float getAV1(){
        return this.AV1;
    }
    
    //AV2
    public void setAV2(float nota){
        this.AV2 = nota;
    }
    
    public float getAV2(){
        return this.AV2;
    }
    
    //AV3
    public void setAV3(float nota){
        this.AV3 = nota;
    }
    
    public float getAV3(){
        return this.AV3;
    }
    
    //Curso
    public void setCurso(Curso curso){
        this.curso = curso;
    }
    
    public Curso getCurso(){
        return this.curso;
    }
}


