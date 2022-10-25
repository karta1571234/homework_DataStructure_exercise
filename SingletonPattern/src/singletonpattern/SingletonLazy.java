/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author karta
 */
public class SingletonLazy {
    //懶散單例模式
    
    private static SingletonLazy instance;
    
    private SingletonLazy(){
        
    }
    
    /*
    因為整個系統都要存取這個類別，很可能有多個process或thread同時存取
    為了讓線程安全添加synchronized在多線程下確保物件唯一性
    !這個實現方式每次都需要進行同步，效率很很低
    */
    public static synchronized SingletonLazy getInstance(){
        if(instance==null){
            instance=new SingletonLazy();
        }
        return instance;
    }
}
