/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodpattern;


public class FrenchFriesFactory implements Factory {

    @Override
    public Product getProduct() {
        return new FrenchFries();
    }
    public Product getProduct(String remark){
        return new FrenchFries(remark);
    }
    
}
