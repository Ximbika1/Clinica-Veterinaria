/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavel;

import java.util.Date;


/**
 *
 * @author pedro
 */
public class Tratamento {
    private int id;
    private Date dat_ini = new Date();
    private Date dat_fim = new Date();

    public Tratamento(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Date getDat_ini() {
        return dat_ini;
    }

    public void setDat_ini(Date dat_ini) {
        this.dat_ini = dat_ini;
    }

    public Date getDat_fim() {
        return dat_fim;
    }

    public void setDat_fim(Date dat_fim) {
        this.dat_fim = dat_fim;
    }

    
    
    
}
