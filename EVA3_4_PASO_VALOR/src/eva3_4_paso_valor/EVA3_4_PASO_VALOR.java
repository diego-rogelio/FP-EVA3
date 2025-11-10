
package eva3_4_paso_valor;


public class EVA3_4_PASO_VALOR {

    /*
    Cuando se manda valor al metodo se manda una copia del valor, es decir val, val es el que se suma
    una vez que se acaba el metodo de incrementar val tambien se acaba, y valor se queda igual pq es un entero
    y al ser este un tipo de dato primitivo no se actualiza
    */
   
    public static void main(String[] args) {
        int valor = 5;
        System.out.println("valor (antes): " + valor);
        incrementar(valor);
        System.out.println("Valor (despues): " + valor);
    
    }
    //Suma uno
    public static void incrementar(int val){
        val = val + 1;
       
    
    }
    
}
