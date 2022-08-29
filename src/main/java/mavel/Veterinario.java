/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavel;

/**
 *
 * @author pedro
 */
public class Veterinario {
    private int id;
    private String nome_vet;
    private String end_vet;
    private String tel_vet;
    
    public Veterinario(int id, String nome_vet, String end_vet, String tel_vet) {
        this.id = id;
        this.nome_vet = nome_vet;
        this.end_vet = end_vet;
        this.tel_vet = tel_vet;
    }

    public int getId() {
        return id;
    }

    public String getNome_vet() {
        return nome_vet;
    }

    public void setNome_vet(String nome_vet) {
        this.nome_vet = nome_vet;
    }

    public String getEnd_vet() {
        return end_vet;
    }

    public void setEnd_vet(String end_vet) {
        this.end_vet = end_vet;
    }

    public String getTel_vet() {
        return tel_vet;
    }

    public void setTel_vet(String tel_vet) {
        this.tel_vet = tel_vet;
    }


}
