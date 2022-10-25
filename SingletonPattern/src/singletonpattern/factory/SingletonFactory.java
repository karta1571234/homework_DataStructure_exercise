/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpattern.factory;

/**
 *
 * @author karta
 */
public class SingletonFactory {
    
    public static Factory getColaFactory(){
        return ColaFactory.colaFactory;
    }
    public static Factory getHamburgerFactory(){
        return HamburgerFactory.hamburgerFactory;
    }
    
    private static class ColaFactory implements Factory{

        private static ColaFactory colaFactory = new ColaFactory();

        private ColaFactory(){}

        @Override
        public Product getProduct() {
            return new Cola();
        }
    }
    private static class HamburgerFactory implements Factory{
        
        private static HamburgerFactory hamburgerFactory=new HamburgerFactory();
        
        private HamburgerFactory(){}
        
        public Product getProduct(){
            return new Hamburger();
        }
    }
}
