
package eva3_2_metodos;

import java.util.Scanner;


public class EVA3_2_METODOS {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String mensaje;
    int valor;
        System.out.println("Captura el mensaje");
    mensaje = input.nextLine();
        System.out.println("Cuantas repeticiones?");
    valor = input.nextInt();
        System.out.println("");
    imprimirMensaje(mensaje,valor);
        
    }
    public static void imprimirMensaje(String mensaje, int repeticiones){
        for (int i = 0; i < repeticiones ; i++) {
            System.out.println(mensaje);
            
        }
    }
    
}
