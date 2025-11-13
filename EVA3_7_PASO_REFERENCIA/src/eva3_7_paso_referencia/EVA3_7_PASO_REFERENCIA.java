
package eva3_7_paso_referencia;

import java.util.Scanner;


public class EVA3_7_PASO_REFERENCIA {

    
    public static void main(String[] args) {
        String cliente[] = new String [5];
        double credito[] = new double[5];
        capturarClientes(cliente, credito);
        imprimir(cliente, credito);
    }
    
    public static void capturarClientes(String [] nombre, double[] credito){
    Scanner input = new Scanner(System.in);
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Nombre del cliente");
            nombre[i] = input.nextLine();
            System.out.println("Credito del cliente");
            credito[i] = input.nextDouble();
            input.nextLine();  //Solo sirve para evitar problemas al capturar varios enteros o dobles
            System.out.println("========================");
        }
    }
    
    public static void imprimir(String [] nombre, double[] credito){
    for (int i = 0; i < nombre.length; i++) {
           System.out.println("Nombre: " + nombre[i] );
           System.out.println("Credito: $" + credito[i]);
          
            
        }
    }
    
    /*Como la firma es diferente (los tipos de datos son diferentes) no sale como si fuera repetido
    Si hay dos metodos con el mismo nombre ocurre una sobrecarga*/
    public static void imprimir(String [] nombre){
    for (int i = 0; i < nombre.length; i++) {
           System.out.println("Nombre: " + nombre[i] );
    }
    }
    
    public static void imprimir(double[] credito){
    for (int i = 0; i < credito.length; i++) {
            System.out.println("Credito: $" + credito[i]);
    }
}
}
