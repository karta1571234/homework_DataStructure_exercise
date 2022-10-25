/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxypattern;


public class EstateAgentSell implements ISellHouse {

    private ISellHouse iSellHouse;
    
    public EstateAgentSell(ISellHouse iSellHouse){
        this.iSellHouse=iSellHouse;
    }
    @Override
    public void findBuyer() {
        iSellHouse.findBuyer();
        System.out.println("#房仲2號幫我找買家");
    }

    @Override
    public void setPrice() {
        iSellHouse.setPrice();
        System.out.println("#房仲2號幫我開價錢");
    }

    @Override
    public void priceTooLow() {
        iSellHouse.priceTooLow();
        System.out.println("#房仲2號幫我說太便宜");
    }

    @Override
    public void finish() {
        iSellHouse.finish();
        System.out.println("#房仲2號幫我成交");
    }
    
}
