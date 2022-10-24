/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern.strategy2;

/**
 *
 * @author karta
 */
public class PriceCalculator {
    
    private int sum=0;
    private IStrategy strategy;
    
    public void setStrategy(IStrategy s){
        this.strategy=s;
    }
    public int execute(int km){
        return this.strategy.calculate(km);
    }
}
