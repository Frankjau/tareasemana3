
/**
 *
 * @author rogelio
 */
import java.util.Scanner;
// jercicio 01 al ingresar datos y si eres mas de 14 estoy en la adolecencia 
public class Ejercio01 {
   //metodo de la clase 
    public static void main(String[]args){
    //declarar variables 

    Scanner lectura=new Scanner (System.in);
    // entrada de datos 
    int edad=lectura.nextInt();
    if(edad>14){
        System.out.println("estoy en la pubertad");
    }
    }
    
    }
