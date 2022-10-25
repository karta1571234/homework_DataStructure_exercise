/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author karta
 */
public class SingletonDuoLock {
    
    public static SingletonDuoLock instance;
    
    private SingletonDuoLock(){}
    
    public static SingletonDuoLock getInstance(){
        //第一層判斷為了避免不必要的同步
        if(instance==null){
            synchronized (SingletonDuoLock.class){
                //第二層判斷為了在null的狀況下建立實例
                if(instance==null){
                    instance=new SingletonDuoLock();
                }
            }
        }
        return instance;
    }
}
