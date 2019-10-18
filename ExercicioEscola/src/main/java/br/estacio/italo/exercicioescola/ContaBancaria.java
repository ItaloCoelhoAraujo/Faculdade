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
public class ContaBancaria {
    String numero, agencia;
    float caixaCorrente, caixaPoupanca;
    
    //Construtores
    ContaBancaria(String numero, String agencia, float caixaCorrente, float caixaPoupanca){
        this.numero = numero;
        this.agencia = agencia;
        this.caixaCorrente = caixaCorrente;
        this.caixaPoupanca = caixaPoupanca;
    }
    
    ContaBancaria(String numero, String agencia){
        this.numero = numero;
        this.agencia = agencia;
    }
    
    ContaBancaria(){
        
    }
    
    //Setters e Getters
    //Numero
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    //Agencia
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    
    public String getAgencia(){
        return this.agencia;
    }
    
    //Caixa Corrente
    public void setCaixaCorrente(float valor){
        this.caixaCorrente = valor;
    }
    
    public float getCaixaCorrente(){
        return this.caixaCorrente;
    }
    
    //Caixa Poupanca
    public void setCaixaPoupanca(float valor){
        this.caixaPoupanca = valor;
    }
    
    public float getCaixaPoupanca(){
        return this.caixaPoupanca;
    }
}


