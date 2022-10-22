/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodpattern;

/**
 *
 * @author karta
 */
public class FrenchFries implements Product{
    
    String remark="多鹽的";
    
    protected FrenchFries(){
        
    }
    protected FrenchFries(String remark){
        this.remark=remark;
    }
    
    public void describe(){
        System.out.println(remark+"薯條");
    }
}
