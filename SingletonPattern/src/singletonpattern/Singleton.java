/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author karta
 */
public class Singleton {
    //積極單例模式
    
    /*
    創建 Singleton 的一個對象
    積極模式在宣告靜態物件的時候就已經初始化，
    !懶散模式(Lazy)是在呼叫getInstance時才進行初始化。
    */
    private static Singleton instance=new Singleton();
    
    private Singleton(){
        //將constructor 設為private,該類不會被實例化(instance)
        //(讓別人不能創建)
    }
    
    //獲取唯一可用的對象
    public static Singleton getInstance(){
        return instance;
    }
}
