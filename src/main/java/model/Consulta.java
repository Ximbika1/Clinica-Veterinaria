/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pedro
 */
import java.util.Date;
public class Consulta {
    private int id;
    private String historico;
    private Date dat_con = new Date();
    

    public Consulta(int id, String historico) {
        this.id = id;
        this.historico = historico;
    }

    public int getId() {
        return id;
    }



    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Date getDat_con() {
        return dat_con;
    }

    public void setDat_con(Date dat_con) {
        this.dat_con = dat_con;
    }
    
}
