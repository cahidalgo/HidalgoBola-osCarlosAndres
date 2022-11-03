package com.mycompany.hidalgocarlos;
import java.util.Date;
/**
 *
 * @author HidalgoCarlos
 */
public class Tarea {
    private String nombre;
    private boolean habilitada;
    private boolean deshabilitarFalla;

    public Tarea(String nombre){
        this.nombre=nombre;
    }
    
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

    public String getNombre() {
        return nombre;
    }

    public boolean isHabilitada() {
        return habilitada;
    }

    public boolean isDeshabilitarFalla() {
        return deshabilitarFalla;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }

    public void setDeshabilitarFalla(boolean deshabilitarFalla) {
        this.deshabilitarFalla = deshabilitarFalla;
    }
    
    
    
    @Override
    public String toString() {
        return "Tarea{" + "nombre=" + nombre + '}';
    }
    
}
