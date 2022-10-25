/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemarchitecture;

/**
 *
 * @author karta
 */
public abstract class Drink {
    
    SugarType sugar;
    IceType ice;
    static int counter=0;
    
    enum SugarType{
        REGULAR,LESS,HALF,QUARTER,FREE
    }
    enum IceType{
        REGULAR,EASY,FREE,HOT
    }
    
    public Drink(){
        
    }
    public Drink(SugarType sugar,IceType ice){
        this.sugar=sugar;
        this.ice=ice;
        counter++;
    }

    /**
     * @return the sugar
     */
    public SugarType getSugar() {
        return sugar;
    }

    /**
     * @param sugar the sugar to set
     */
    public void setSugar(SugarType sugar) {
        this.sugar = sugar;
    }

    /**
     * @return the ice
     */
    public IceType getIce() {
        return ice;
    }

    /**
     * @param ice the ice to set
     */
    public void setIce(IceType ice) {
        this.ice = ice;
    }

}
