/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pedro
 */
public class Main {
    public static void main(String[] args){
        Cliente p1 = new Cliente(1,"Pedro","12345","rua antonio","5000","3874-1479","pedro123@gmail.com");
        
        Animal a1 = new Animal(1,"steve",3,1);
        Animal a2 = new Animal(2,"trovao",4,1);
        p1.addAnimal(a1);
        p1.addAnimal(a2);
    
        System.out.println(p1);
    }
}
