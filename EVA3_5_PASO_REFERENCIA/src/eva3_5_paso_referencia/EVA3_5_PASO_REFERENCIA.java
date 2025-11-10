
package eva3_5_paso_referencia;


public class EVA3_5_PASO_REFERENCIA {

    /*
    valor aqui cuenta como arreglo, igual se manda valor como una copia, solo que aqui
    cuando se termina la variable de val si se actualiza valor, porque es una variable de 
    otro tipo (se sabe pq se usa la palabra new), la variable se convierte en objeto por lo cual la copia
    es de la direccion en la memoria en donde se guarda la variable valor, aqui si se regresa lo que se le haga en 
    incrementar a val si se modifica tambien en valor
    */
    
    public static void main(String[] args) {
    int valor[] = new int [1];
    valor[0] = 5;
        System.out.println(valor); //Direccion del arreglo
    System.out.println("valor (antes): " + valor[0]);
        incrementar(valor);
    System.out.println("Valor (despues): " + valor[0]);
        
    }
    public static void incrementar(int[] val){
        System.out.println(val); //Copia de la direccion del arreglo
        for (int i = 0; i < val.length; i++) {
           val[i] = val[i] + 1;
            
        }
    
    }
    
}
