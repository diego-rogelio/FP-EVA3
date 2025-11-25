
package eva3_9_areas;

import java.util.Scanner;

public class EVA3_9_AREAS {

  
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int opc = 0;

        System.out.println("======= MENU =======");
        System.out.println("1. Calcular area de circulo");
        System.out.println("2. Calcular area de rectangulo");
        System.out.println("3. Calcular area de trapecio");
        System.out.println("4. Salir");

        while (opc != 4) {

            System.out.print("Selecciona una opcion: ");
            opc = input.nextInt();

            switch(opc) {

                case 1:
                    System.out.print("Ingresa el radio: ");
                    double radio = input.nextDouble();
                    System.out.println("Area = " + calcularArea(radio));
                    break;

                case 2:
                    System.out.print("Ingresa la base: ");
                    double base = input.nextDouble();
                    System.out.print("Ingresa la altura: ");
                    double altura = input.nextDouble();
                    System.out.println("Area = " + calcularArea(base, altura));
                    break;

                case 3:
                    System.out.print("Ingresa la base mayor: ");
                    double bMayor = input.nextDouble();
                    System.out.print("Ingresa la base menor: ");
                    double bMenor = input.nextDouble();
                    System.out.print("Ingresa la altura: ");
                    double h = input.nextDouble();
                    System.out.println("Area = " + calcularArea(bMayor, bMenor, h));
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        }

        input.close();
    }

//Metodos

    // Círculo
    public static double calcularArea(double radio) {
        return 3.141592 * radio * radio;
    }

    // Rectángulo
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    // Trapecio
    public static double calcularArea(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) / 2) * altura;
    }
    
}
