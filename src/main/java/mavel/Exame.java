/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavel;

/**
 *
 * @author pedro
 */
public class Exame {
    private int id;
    private String desc_exame;

    public Exame(int id, String desc_exame) {
        this.id = id;
        this.desc_exame = desc_exame;
    }

    public int getId() {
        return id;
    }

    public String getDesc_exame() {
        return desc_exame;
    }

    public void setDesc_exame(String desc_exame) {
        this.desc_exame = desc_exame;
    }
    
}
