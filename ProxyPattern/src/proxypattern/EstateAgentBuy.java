/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxypattern;


public class EstateAgentBuy implements IBuyHouse {
    //房仲(代理proxy)
    private IBuyHouse iBuyHouse;
    
    public EstateAgentBuy(IBuyHouse iBuyHouse){
        this.iBuyHouse=iBuyHouse;
    }
    
    @Override
    public void findHouse() {
        iBuyHouse.findHouse();
        System.out.println("#房仲幫我找房子");
    }

    @Override
    public void priceTooHigh() {
        iBuyHouse.priceTooHigh();
        System.out.println("#房仲幫我說太貴");
    }

    @Override
    public void defendPrice() {
        iBuyHouse.defendPrice();
        System.out.println("#房仲幫我瘋狂殺價");
    }

    @Override
    public void finish() {
        iBuyHouse.finish();
        System.out.println("#房仲幫我成交");
    }
    
}
