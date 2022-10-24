/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern;

/**
 *
 * @author karta
 */
public class Calculator {
    
    private int sum=0;
    private IStrategy strategy;
    
    public int execute(int a,int b){
        return this.strategy.calculate(a,b);
    }
    public void reset(){
        this.sum=0;
    }
    
    public void setStrategy(DoType doType){
        switch(doType){
            case ADD:
                this.strategy=new add();
                break;
            case MINUS:
                this.strategy=new minus();
                break;
            case MULTYPLY:
                this.strategy=new multyply();
                break;
            case DIVIDE:
                this.strategy=new divide();
                break;
        }
    }
    enum DoType{
        ADD, MINUS, MULTYPLY,DIVIDE
    }
}
