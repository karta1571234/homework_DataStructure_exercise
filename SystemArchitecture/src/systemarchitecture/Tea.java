/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemarchitecture;


public class Tea extends Drink {

    private TeaType tea;
    enum TeaType{
        MILK,APPLE,BLACKTEA,LEMON,OOLONG,GINGER,HONEY
    }
    
    public Tea(){
        super();
    }
    public Tea(SugarType sugar, IceType ice) {
        super(sugar, ice);
    }

    /**
     * @return the tea
     */
    public TeaType getTea() {
        return tea;
    }

    /**
     * @param tea the tea to set
     */
    public void setTea(TeaType tea) {
        this.tea = tea;
    }
    
}
