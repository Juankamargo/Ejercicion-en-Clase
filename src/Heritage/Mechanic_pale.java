package Heritage;

/**
 *
 * @author Estudiante
 */
public class Mechanic_pale extends Vehicle {
    @Override
    public void stop() {
        System.out.println("parar hijo"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void start() {
        super.start(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHorsePower(int horsePower) {
        super.setHorsePower(horsePower); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHorsePower() {
        return super.getHorsePower(); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    

     public void turn(String direction)
    {
        System.out.println("Girar a la " + direction);  
    }   
    
}
