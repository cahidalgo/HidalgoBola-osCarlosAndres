package com.mycompany.hidalgocarlos;
import java.util.Stack;

/**
 *
 * @author sala4
 */
public class TareaCompuesta extends Tarea {
    Stack <Tarea> listat=new Stack<>();
    /**
     *
     */
    @Override
    public void doEjecutar(){
        System.out.println("");
    }
    
    public void setListat(Tarea tarea){
        listat.add(tarea);
    }
    
}
