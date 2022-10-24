/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern.strategy2;


public class MRTStrategy implements IStrategy {

    @Override
    public int calculate(int km) {
        
        //        小於10公里20元，超過每2公里多5元
        int total=0;
        
        if(km<=10){
            total=20;
        }
        if(km>10){
            total=20+5*((km-10)/2);
        }
        
        return total;
    }
    
}
