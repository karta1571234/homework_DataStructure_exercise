/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern;


public class minus implements IStrategy {

    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
    
}
