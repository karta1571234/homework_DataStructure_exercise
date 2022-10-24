/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategypattern;
import strategypattern.strategy2.*;
/**
 *
 * @author karta
 */
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator cal1=new Calculator();
        
        cal1.setStrategy(Calculator.DoType.DIVIDE);
        int result_divide=cal1.execute(10, 5);
        System.out.println("calculator divide mode (10/5)="+result_divide);
        
        cal1.setStrategy(Calculator.DoType.ADD);
        int result_add=cal1.execute(10, 10);
        System.out.println("calculator add mode (10+10)="+result_add);
        
        cal1.setStrategy(Calculator.DoType.MINUS);
        int result_minus=cal1.execute(99, 5);
        System.out.println("calculator minus mode (99-5)="+result_minus);
    
        cal1.setStrategy(Calculator.DoType.MULTYPLY);
        int result_multyply=cal1.execute(55, 10);
        System.out.println("calculator multyply mode (55*10)="+result_multyply);
    
        PriceCalculator cal2=new PriceCalculator();
        
        BusStrategy bs=new BusStrategy();
        cal2.setStrategy(bs);
        int result_getBusPrice=cal2.execute(30);
        System.out.println("BusStrategy of PriceCalculator (30km)="+result_getBusPrice);
    
        MRTStrategy ms=new MRTStrategy();
        cal2.setStrategy(ms);
        int result_getMrtPrice=cal2.execute(30);
        System.out.println("MRTStrategy of PriceCalculator (30km)="+result_getMrtPrice);
        
    }
    
}
