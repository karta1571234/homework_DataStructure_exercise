/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proxypattern;

/**
 *
 * @author karta
 */
public class ProxyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("(Proxy)   房仲代理找房子\n");
        
        System.out.println("---------買家出動---------");
        Customer me=new Customer();
        EstateAgentBuy proxy_buy=new EstateAgentBuy(me);
        
        proxy_buy.findHouse();
        proxy_buy.priceTooHigh();
        proxy_buy.defendPrice();
        proxy_buy.finish();
        
        System.out.println("---------賣家出動---------");
        Boss you=new Boss();
        EstateAgentSell proxy_sell=new EstateAgentSell(you);
        
        proxy_sell.findBuyer();
        proxy_sell.setPrice();
        proxy_sell.priceTooLow();
        proxy_sell.finish();
        
    }
    
}
