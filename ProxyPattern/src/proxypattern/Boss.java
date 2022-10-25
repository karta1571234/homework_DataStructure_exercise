/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxypattern;


public class Boss implements ISellHouse {

    @Override
    public void findBuyer() {
        System.out.println("尋找買家中...");
    }

    @Override
    public void setPrice() {
        System.out.println("開價錢");
    }

    @Override
    public void priceTooLow() {
        System.out.println("太便宜了啦!");
    }

    @Override
    public void finish() {
        System.out.println("賣出...");
    }
    
}
