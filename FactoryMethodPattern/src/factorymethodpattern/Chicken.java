/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodpattern;


public class Chicken implements Product {

    String size="中";
    
    protected Chicken(){
        
    }
    protected Chicken(String size){
        this.size=size;
    }
    
    @Override
    public void describe() {
        System.out.println(size+"份雞塊");
    }
    
}
