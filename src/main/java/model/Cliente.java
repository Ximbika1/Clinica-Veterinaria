/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author pedro
 */
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String cep;
    private String telefone;
    private String email;
    
    private List<Animal> animais;

    public Cliente(int id, String nome, String cpf, String endereco, String cep, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.animais = new ArrayList<Animal>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void addAnimal(Animal animal){
        if(!animal.getNome().isBlank()){
            animais.add(animal);
        }
    }
    
    public List<Animal> getAnimais(){
        List<Animal> reproduz = new ArrayList<Animal>(animais);
        return reproduz;
    }
   
   @Override
   public String toString(){
       String registro = "Cliente<"+" Nome: "+ nome +" cpf: "+ cpf+ " endereco: "+ endereco +" cep: "+ cep +" telefone: "+ telefone +" email: "+ email +">";
       String strAnimais = animais.toString();
       return registro + "\n" + strAnimais; 
   }
}

