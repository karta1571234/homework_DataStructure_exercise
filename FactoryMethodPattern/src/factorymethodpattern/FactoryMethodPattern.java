/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorymethodpattern;

/**
 *
 * @author karta
 */
public class FactoryMethodPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //薯條
        Factory friesFactory = new FrenchFriesFactory();
        Product fries1 = friesFactory.getProduct();
        Product fries2 = ((FrenchFriesFactory) friesFactory).getProduct("少鹽的");

        fries1.describe();
        fries2.describe();

        //雞塊
        Factory chickenFactory = new ChickenFactory();
        Product ckicken1 = chickenFactory.getProduct();
        Product chicken2 = ((ChickenFactory) chickenFactory).getProduct("大");

        ckicken1.describe();
        chicken2.describe();
    }

}
