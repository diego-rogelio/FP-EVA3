
package eva3_1_metodos;


public class EVA3_1_METODOS {

    
    public static void main(String[] args) {
    int val1 = 5, val2 =10;
    //1.Si necesito guardar el valor de retorno
    int resu = sumarEnteros(val1, val2); //Se invoca el metodo
        System.out.println("Suma de 5 + 10 = " + resu);
    
    //2. No necesito guardar el valor, solo se usa una vez
    System.out.println("Suma de 5 + 10 = " + sumarEnteros(val1, val2));
    
    //3.Solo necesito ejecutar el metodo, no interesa el resultado
    sumarEnteros(val1, val2);
    }
    //Metodo para sumar dos enteros
    //Llamar a sus metodoso usando verbos y escritura camelCase
    //1. Modificadores de acceso: public, protected, private
    //2. static --> Para usar los metodos dentro del main
    //3. Valor de retorno: cualquier tipo de dato
    //4. nombre del metodo: mismas reglas que los identificadores
    //5.Lista de parametros:pueden ser cero o N cantidad
    // void ---> si no quieren regresar un valor
    public static int sumarEnteros(int num1, int num2){
    int suma = num1 +num2;
    return suma;
    
    }
}
