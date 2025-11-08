
package eva3_3_menu;

import java.util.Scanner;


public class EVA3_3_MENU {

    
 public static void main(String[] args) {
            Scanner captu = new Scanner(System.in);
            int opcion;
            do{
            imprimirMenu();
            opcion = captu.nextInt();
                if (opcion == 1) {
                    calcularPotencia();
                    
                }else if (opcion == 2) {
                    sumarDos();
                    
                }
            }while(opcion != 3);
    }
    public static void imprimirMenu(){
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("Selecciona una opcion: ");
        System.out.println("1. Calcular una potencia");
        System.out.println("2. Sumar 2 numeros");
        System.out.println("3. Salir del sistema");
        System.out.println("Selecciona una opcion: ");
        
        
    }
    public static void calcularPotencia(){
        Scanner input = new Scanner(System.in);
        int base, exp, resu;
        System.out.println("***********CALCULO DE UNA POTENCIA***************");
        System.out.println("Captura la base: ");
        base = input.nextInt();
        System.out.println("*************************************************");
        System.out.println("Captura el exponente: ");
        exp = input.nextInt();
        System.out.println("*************************************************");
        
        System.out.println(base + " elevado a " + exp + " = " + calcularPot(base, exp));
        System.out.println("");
        
    }
    public static int calcularPot(int base, int expo){
        int resu = 1;
        for (int i=0; i<=expo; i++){
            resu = resu * base; 
        }
        return resu;
    
    }

    public static void sumarDos(){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("***********SUMAR DOS NUMEROS***************");
        System.out.println("Primer numero: ");
        num1 = input.nextInt();
        System.out.println("*************************************************");
        System.out.println("Segundo numero: ");
        num2 = input.nextInt();
        System.out.println("*************************************************");
        
        System.out.println(num1 + " + " + num2 + " = " + calcularResu(num1, num2));
        System.out.println("");
        
    }
    public static int calcularResu(int num1, int num2){
        int resu;
        resu = num1 + num2;
        return resu;
       
        
    
    }
}