/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pedro
 */
public class Animal {
    private int id;
    private String nome;
    private int idade;
    private int sexo;

    public int getId() {
        return id;
    }

    public Animal(int id, String nome, int idade, int sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
 
    
    @Override
    public String toString(){
       return "Animal<"+" Nome: "+ nome +" idade: "+ idade+ " sexo: "+ sexo +">"+"\n";
  
   }
}
