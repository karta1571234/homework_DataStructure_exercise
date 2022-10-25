/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemarchitecture;


public class Coffee extends Drink {

    private CoffeeType coffee;
    enum CoffeeType{
        LATTE,MOCHA,WHITE,STARTBUCKS,AMERICANO,ESPRESSO
    }
    
    public Coffee() {
    }

    public Coffee(SugarType sugar, IceType ice) {
        super(sugar, ice);
    }
    
    public CoffeeType getCoffeeType(){
        return coffee;
    }
    public void setCoffeeType(CoffeeType coffee){
        this.coffee=coffee;
    }
    
}
