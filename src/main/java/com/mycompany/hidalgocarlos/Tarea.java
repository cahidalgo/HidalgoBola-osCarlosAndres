package com.mycompany.hidalgocarlos;
import java.util.Date;
/**
 *
 * @author HidalgoCarlos
 */
public class Tarea {
    private boolean habilitada;
    private boolean deshabilitarFalla;

    public Tarea(boolean habilitada, boolean deshabilitarFalla) {
        this.habilitada = habilitada;
        this.deshabilitarFalla = deshabilitarFalla;
    }
    
    public void ejecutar(){
        
    }
    public void doEjecutar(){
        
    }
    
    public Date ultimaEjecucion(){
        return new Date();
    }
    
    public void vecesQueSeEjecuto(Date date, Date dato){
        
    }
    
    public void vecesQueDioError(int date, int dato){
        
    }
    
}
