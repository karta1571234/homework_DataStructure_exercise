/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern.strategy2;

public class BusStrategy implements IStrategy {

    @Override
    public int calculate(int km) {

        //        一段票10元，十公里內一段票，超過十公里兩段票
        int section = 0;

        if (km <= 10) {
            section = 1;
        } else {
            section = 2;
        }

        return section * 10;
    }

}
