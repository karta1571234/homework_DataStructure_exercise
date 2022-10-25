/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemarchitecture;

/**
 *
 * @author karta
 */
public class Juice extends Drink {

    private JuiceType juiceType;
    enum JuiceType{
        APPLE,BANANA,ORANGE
    }
    
    public Juice(SugarType sugar, IceType ice) {
        super(sugar,ice);
    }

    /**
     * @return the juiceType
     */
    public JuiceType getJuiceType() {
        return juiceType;
    }

    /**
     * @param juiceType the juiceType to set
     */
    public void setJuiceType(JuiceType juiceType) {
        this.juiceType = juiceType;
    }
    
    
}
