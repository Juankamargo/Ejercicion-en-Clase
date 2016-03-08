/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidaddeantioquia;

import java.util.Scanner;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Scanner getL() {
        return l;
    }

    public void setL(Scanner l) {
        this.l = l;
    }
    
    
}