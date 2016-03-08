/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidaddeantioquia;

/**
 *
 * @author Estudiante
 */
    
public class Familia {

    private Persona Padre;
    private Persona madre;
    private Persona hijo1;
    private Persona hijo2;
    public String apellido;

    public Familia(Persona Padre, Persona madre, Persona hijo1, Persona hijo2, String apellido) {
        this.Padre = Padre;
        this.madre = madre;
        this.hijo1 = hijo1;
        this.hijo2 = hijo2;
        this.apellido = apellido;
    }
    
    public Familia() {
        this.Padre = null;
        this.madre = null;
        this.hijo1 = null;
        this.hijo2 = null;
        this.apellido = null;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona getPadre() {
        return Padre;
    }

    public void setPadre(Persona Padre) {
        this.Padre = Padre;
    }

    public Persona getMadre() {
        return madre;
    }

    public void setMadre(Persona madre) {
        this.madre = madre;
    }

    public Persona getHijo1() {
        return hijo1;
    }

    public void setHijo1(Persona hijo1) {
        this.hijo1 = hijo1;
    }

    public Persona getHijo2() {
        return hijo2;
    }

    public void setHijo2(Persona hijo2) {
        this.hijo2 = hijo2;
    }

}