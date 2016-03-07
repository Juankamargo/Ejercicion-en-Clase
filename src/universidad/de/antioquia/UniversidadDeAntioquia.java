/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.de.antioquia;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class UniversidadDeAntioquia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner l=new java.util.Scanner(System.in);
        System.out.println("Desea: ");
        System.out.println("1. Ingresar una nueva familia");        
        System.out.println("2. Consultar Familia");
        System.out.println("3. Consultar miembro se familia");
        int a=l.nextInt();
        HashMap<String,Familia> familias = new HashMap<String,Familia>();
        Familia f = new Familia();
        switch(a){
            case 1:{
                System.out.println("Apellido: ");
                
                break;
            }
            case 2:{
                break;
            }
            case 3:{
                break;
            }
        }
    }
    
}
