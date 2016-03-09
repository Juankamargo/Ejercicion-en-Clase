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
public class Car extends Vehicle {
    int doorsQuantity;

    public int getDoorsQuantity() {
        return doorsQuantity;
    }

    public void setDoorsQuantity(int doorsQuantity) {
        this.doorsQuantity = doorsQuantity;
    }

    public Car(int horsePower, int doorsQuantity) {
        this.horsePower = horsePower;
        this.doorsQuantity = doorsQuantity;
    }
        public Car() {
        this.horsePower = 0;
        this.doorsQuantity = 0;
    }
    
  

     public void acelerate(int quantity)
    {
        System.out.println("Acelerar:   " + quantity + "km/h");  

    }   
    
}
