/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author karta
 */
public class SingletonRegistered {
    
    //可以確保線程安全，保證物件唯一性，並且延遲實例化，所以推薦使用。
    
    private SingletonRegistered(){}
    
    public static SingletonRegistered getInstance(){
        return SingletonRegisteredHolder.instance;
    }
    
    private static class SingletonRegisteredHolder{
        private static SingletonRegistered instance=new SingletonRegistered();
    }
    
}
