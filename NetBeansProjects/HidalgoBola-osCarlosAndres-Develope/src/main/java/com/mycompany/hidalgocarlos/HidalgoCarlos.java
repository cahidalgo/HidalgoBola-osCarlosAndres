package com.mycompany.hidalgocarlos;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author sala4
 */
public class HidalgoCarlos {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Tarea tarea;
        TareaCompuesta tareac;
        StoredProcedure sp;
        int opcion;
        String nombre;
        do{
            System.out.println("Ingrese una opcion"
                    + "\n Crear una tarea "
                    + "\n Mostrar listado de tareas"
                    + ""
                    + "\n Salir.");
            opcion=in.nextInt();in.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Que tipo de tarea es:"
                            + "\n 1.Tarea simple."
                            + "\n 2.Tarea Compuesta.");
                    opcion=in.nextInt();in.nextLine();
                    switch(opcion){
                        case 1:
                            System.out.println("Ingrese el nombre de la tarea:");
                            nombre=in.nextLine();
                            tarea=new Tarea(nombre);
                            sp=new StoredProcedure(tarea);
                        break; 
                            
                        case 2:
                            tareac=new TareaCompuesta();
                            System.out.println("De cuantas tareas esta compuesta: ");
                            opcion=in.nextInt();in.nextLine();
                            
                            for (int i = 0; i < opcion; i++) {
                                System.out.println("Ingrese el nombre de la tarea "+ i+1);
                                nombre=in.nextLine(); 
                                tarea=new Tarea(nombre);
                                tareac.setListat(tarea);
                            }
                            sp=new StoredProcedure(tareac);
                            
                            break;
                    }
                break;
                    
                case 2:
                break;
                
                case 3:
                break;
                    
                case 4:
                break;
            }
                    
                    
        }while(true);
    }
}
