/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxypattern;


public class Customer implements IBuyHouse {
    //RealSubjuct
    
    @Override
    public void findHouse() {
        System.out.println("我要找房子...");
    }

    @Override
    public void priceTooHigh() {
        System.out.println("太貴了吧...");
    }

    @Override
    public void defendPrice() {
        System.out.println("再殺啦!!");
    }

    @Override
    public void finish() {
        System.out.println("沒想到還真的買到了...");
    }
    
}
