/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heritage;

/**
 *
 * @author Estudiante
 */
public class Vehicle {
    int horsePower;

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    
    
    public void start()
    {
        System.out.println("Arrancar.");
    }
    public void stop()
    {
        System.out.println("Parar.");   
    }
    
}
