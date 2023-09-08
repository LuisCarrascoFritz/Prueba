
import java.util.Scanner;

/**
 *
 * @author Luis Carrasco
 * @version 07-09-2023
 */
public class Main {
    public boolean flag;
    private Vehiculo autito;
    private Cliente clientito;
    private Validacion validar;
    public static void main(String[] args) {
        Scanner opcion;
        Vehiculo vehiculo1 = new Vehiculo(1999, "descapotable", "CB3366", 0, 0);
        
        do {
            System.out.println("opcion 1:Guardar");//me e perdido :c
            System.out.println("opcion 2:info");
            System.out.println("opcion 3:valor");
            System.out.println("opcion 4:Salir");
            
            switch (opcion) {
                case 1:
                    System.out.println("hola mundo");
                    break (flag); //el orden me confuncio
                default:
                    throw new AssertionError();
            }
                
            }
        }
            
        
       

}
