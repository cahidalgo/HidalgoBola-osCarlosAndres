package com.mycompany.hidalgocarlos;
import java.util.Stack;
/**
 *
 * @author sala4
 */
public class StoredProcedure {
    Stack<Tarea> lista1=new Stack<>();
    Stack<TareaCompuesta> lista= new Stack<>();
    
    public StoredProcedure(TareaCompuesta tarea){
        lista.add(tarea);
    }
    public StoredProcedure(Tarea tarea){
        lista1.add(tarea);
    }
}
