/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategypattern;

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
    }
    
}
