/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodpattern;


public class ChickenFactory implements Factory {

    @Override
    public Product getProduct() {
        return new Chicken();
    }
    public Product getProduct(String size){
        return new Chicken(size);
    }
    
}
