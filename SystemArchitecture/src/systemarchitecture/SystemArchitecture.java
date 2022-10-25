/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package systemarchitecture;

/**
 *
 * @author karta
 */
public class SystemArchitecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("飲料店:");

        DrinkShop DShop=new DrinkShop();
        
        Tea tea=(Tea)DShop.order("tea", Drink.SugarType.REGULAR, Drink.IceType.FREE);
        tea.setTea(Tea.TeaType.MILK);
        System.out.println("你點的飲料是"+tea.getTea()+", 糖度:"+tea.getSugar()+", 冰度:"+tea.getIce());
    
        Coffee cofe=(Coffee)DShop.order("coffee", Drink.SugarType.QUARTER, Drink.IceType.HOT);
        cofe.setCoffeeType(Coffee.CoffeeType.LATTE);
        System.out.println("你點的飲料是"+cofe.getCoffeeType()+", 糖度:"+cofe.getSugar()+", 冰度:"+cofe.getIce());
    
        Juice juice=(Juice)DShop.order("JuIce", Drink.SugarType.LESS, Drink.IceType.REGULAR);
        juice.setJuiceType(Juice.JuiceType.BANANA);
        System.out.println("你點的飲料是"+juice.getJuiceType()+", 糖度:"+juice.getSugar()+", 冰度:"+juice.getIce());
        
        System.out.println("我要更改糖度(無糖)");
        juice.setSugar(Drink.SugarType.FREE);
        System.out.println("你點的飲料是"+juice.getJuiceType()+", 糖度:"+juice.getSugar()+", 冰度:"+juice.getIce());
        
        System.out.println("今天總共:"+Drink.counter+"杯");
    
    }
    
}
