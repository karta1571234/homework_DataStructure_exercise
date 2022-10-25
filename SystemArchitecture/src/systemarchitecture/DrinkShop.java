/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemarchitecture;

/**
 *
 * @author karta
 */
public class DrinkShop {
    public Drink order(String drink,Drink.SugarType sugar,Drink.IceType ice){
        drink=drink.toLowerCase();    //轉小寫
        switch(drink){
            case "coffee":
                return new Coffee(sugar,ice);
            case "tea":
                return new Tea(sugar,ice);
            case "juice":
                return new Juice(sugar,ice);
            default :
                return null;
        }
    }
}
