/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidaddeantioquia;

import java.util.*;
import universidaddeantioquia.Familia;

/**
 *
 * @author Estudiante
 */
public class UniversidadDeAntioquia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        while (true) {
            System.out.println("Desea: ");
            System.out.println("1. Ingresar una nueva familia");
            System.out.println("2. Consultar Familia");
            System.out.println("3. Consultar miembro se familia");
            int a = read.nextInt();
            HashMap<String, Familia> familias = new HashMap<String, Familia>();

            switch (a) {
                case 1: {
                    ingresarFamilia(familias);

                    break;
                }
                case 2: {
                    consultarFamilia();
                    break;
                }
                case 3: {
                    consultarPersona();
                    break;
                }
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    private static void ingresarFamilia(HashMap<String, Familia> familias) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        System.out.println("Ingrese el apellido de la familia: ");
        String apellido;
        apellido = read.nextLine();
        String nombre= "";
        String sexo;
        int edad;
        System.out.println("Ingrese datos del padre: ");
        System.out.println("Nombre: ");
        nombre = read.nextLine();
        System.out.println("Genero: ");
        sexo = read.nextLine();
        System.out.println("Edad: ");
        edad = read.nextInt();
        Persona padre = new Persona(nombre, sexo, edad);
        System.out.println("Ingrese datos del madre: ");
        System.out.println("Nombre: ");
        nombre = read.nextLine();
        System.out.println("Genero: ");
        sexo = read.nextLine();
        System.out.println("Edad: ");
        edad = read.nextInt();
        Persona madre = new Persona(nombre, sexo, edad);
        System.out.println("Ingrese datos del primer hijo: ");
        System.out.println("Nombre: ");
        nombre = read.nextLine();
        System.out.println("Genero: ");
        sexo = read.nextLine();
        System.out.println("Edad: ");
        edad = read.nextInt();
        Persona hijo1 = new Persona(nombre, sexo, edad);
        System.out.println("Ingrese datos del segundo hijo: ");
        System.out.println("Nombre: ");
        nombre = read.nextLine();
        System.out.println("Genero: ");
        sexo = read.nextLine();
        System.out.println("Edad: ");
        edad = read.nextInt();
        Persona hijo2 = new Persona(nombre, sexo, edad);

        Familia f = new Familia(padre, madre, hijo1, hijo2, apellido);
        familias.put(f.getApellido(), f);

    }

    private static void consultarFamilia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void consultarPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
