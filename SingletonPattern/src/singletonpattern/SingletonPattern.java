/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletonpattern;
import singletonpattern.factory.*;

/**
 *
 * @author karta
 */
public class SingletonPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola cola=(Cola)SingletonFactory.getColaFactory().getProduct();
        Hamburger hamburger=(Hamburger)SingletonFactory.getHamburgerFactory().getProduct();

        System.out.println("可樂:"+cola.getName());
        System.out.println("漢堡:"+hamburger.getName());
    }
    
}
