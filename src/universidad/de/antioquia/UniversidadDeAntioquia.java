package universidaddeantioquia;

import java.util.*;

public class UniversidadDeAntioquia {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int h;
        HashMap<String, Familia> familias = new HashMap<>();
        HashMap<String, Persona> personas = new HashMap<String, Persona>();
        do {
            System.out.println("Desea: ");
            System.out.println("1. Ingresar una nueva familia");
            System.out.println("2. Consultar Familia");
            System.out.println("3. Consultar miembro se familia");
            int a = l.nextInt();
            Familia f = new Familia();
            switch (a) {
                case 1: {
                    String pa, ma, h1, h2, apellido,s1,s2;
                    int edadp,edadm,edad1,edad2;
                    System.out.println("Padre: ");
                    pa = l.next();
                    System.out.println("Edad del padre: ");
                    edadp=l.nextInt();
                    System.out.println("Madre: ");
                    ma = l.next();
                    System.out.println("Edad de la madre: ");
                    edadm=l.nextInt();
                    System.out.println("Primer hijo: ");
                    h1 = l.next();
                    System.out.println("Edad del hijo: ");
                    edad1=l.nextInt();
                    System.out.println("Sexo del hijo:(masculino/femenino) ");
                    s1=l.next();
                    System.out.println("Segundo hijo: ");
                    h2 = l.next();
                    System.out.println("Edad del hijo: ");
                    edad2=l.nextInt();
                    System.out.println("Sexo del hijo:(masculino/femenino) ");
                    s2=l.next();
                    System.out.println("Apellido: ");
                    apellido = l.next();
                    Persona padre =new Persona(pa,"masculino",edadp,apellido);
                    Persona madre =new Persona(ma,"femenino",edadm,apellido);
                    Persona hijo1 =new Persona(h1,s1,edad1,apellido);
                    Persona hijo2 =new Persona(h2,s2,edad2,apellido);
                    personas.put(pa,padre);
                    personas.put(ma,madre);
                    personas.put(h1,hijo1);
                    personas.put(h2,hijo2);
                    Familia familian = new Familia(padre, madre, hijo1, hijo2, apellido);
                    familias.put(familian.getApellido(),familian);
                    //System.out.println(familian.getApellido());
                    System.out.println("Nueva familia asignada");
                    break;
                }
                case 2: {
                    String ap;
                    System.out.println("Ingrese el apellido que desea buscar: ");
                    ap = l.next();
                    Familia x = familias.get(ap);
                    if(x!=null){
                        System.out.println("Padre: "+x.getNpadre());
                        System.out.println("sexo: Masculino\nEdad: "+x.getEdadp());
                        System.out.println("Madre: "+x.getNmadre());
                        System.out.println("sexo: Femenino\nEdad: "+x.getEdadm());
                        System.out.println("Primer hijo: "+x.getN1());
                        System.out.println("sexo:"+x.getSexo1()+"\nEdad: "+x.getEdad1());
                        System.out.println("Segundo hijo: "+x.getN2());
                        System.out.println("sexo:"+x.getSexo2()+"\nEdad: "+x.getEdad2());
                    }
                    else if(x==null){System.out.println("apellido no encontrada");}
                    break;
                }
                case 3: {
                    String no;
                    System.out.println("Ingrese el nombre que desea buscar: ");
                    no=l.next();
                    Persona y = personas.get(no);
                    if(y!=null){
                        System.out.println("Su apellido es: "+y.getApellido());
                        System.out.println("Su edad es: "+y.getEdad());
                        System.out.println("Su sexo es: "+y.getSexo());
                        Familia z=familias.get(y.getApellido());
                        if(z.getParentesco(no)=="Madre"){
                            System.out.println("Esposo: "+z.getNpadre());
                            System.out.println("sexo: Masculino\nEdad: "+z.getEdadp());
                            System.out.println("Primer hijo: "+z.getN1());
                            System.out.println("sexo:"+z.getSexo1()+"\nEdad: "+z.getEdad1());
                            System.out.println("Segundo hijo: "+z.getN2());
                            System.out.println("sexo:"+z.getSexo2()+"\nEdad: "+z.getEdad2());
                        }
                        else if(z.getParentesco(no)=="Padre"){
                            System.out.println("Esposa: "+z.getNmadre());
                            System.out.println("sexo: Femenino\nEdad: "+z.getEdadm());
                            System.out.println("Primer hijo: "+z.getN1());
                            System.out.println("sexo:"+z.getSexo1()+"\nEdad: "+z.getEdad1());
                            System.out.println("Segundo hijo: "+z.getN2());
                            System.out.println("sexo:"+z.getSexo2()+"\nEdad: "+z.getEdad2());
                        }
                        else if(z.getParentesco(no)=="Segundo hijo"){
                            System.out.println("Madre: "+z.getNmadre());
                            System.out.println("sexo: Femenino\nEdad: "+z.getEdadm());
                            System.out.println("Padre: "+z.getNpadre());
                            System.out.println("sexo: Masculino\nEdad: "+z.getEdadp());
                            System.out.println("Hermano/a: "+z.getN1());
                            System.out.println("sexo:"+z.getSexo1()+"\nEdad: "+z.getEdad1());
                            }
                        else if (z.getParentesco(no)=="Primer hijo"){
                            System.out.println("Madre: "+z.getNmadre());
                            System.out.println("sexo: Femenino\nEdad: "+z.getEdadm());
                            System.out.println("Padre: "+z.getNpadre());
                            System.out.println("sexo: Masculino\nEdad: "+z.getEdadp());
                            System.out.println("Hermano/a: "+z.getN2());
                            System.out.println("sexo:"+z.getSexo2()+"\nEdad: "+z.getEdad2());
                        }
                    }
                    else {System.out.println("Persona no encontrada");}
                    break;
                }
            }
            System.out.println("presione 1 para continuar con el programa o 2 para salir...");
            h = l.nextInt();
        } while (h == 1);
    }
}
