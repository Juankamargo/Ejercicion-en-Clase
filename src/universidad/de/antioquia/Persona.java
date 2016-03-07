/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.de.antioquia;

/**
 *
 * @author Estudiante
 */
public class Persona {
    public String nombre;
    public String sexo;
    public int edad;
    java.util.Scanner l=new java.util.Scanner(System.in);
    public Persona(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }
    public Persona setpersona(){
        System.out.println("Nombre:");
        this.nombre=l.next();
        System.out.println("Sexo:");
        this.sexo=l.next();
        System.out.println("Edad:");
        this.edad=l.nextInt();
        return this;
    }
    
}
