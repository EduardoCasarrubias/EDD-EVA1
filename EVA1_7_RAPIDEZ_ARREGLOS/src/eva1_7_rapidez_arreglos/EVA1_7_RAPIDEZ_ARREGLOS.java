
package eva1_7_rapidez_arreglos;


public class EVA1_7_RAPIDEZ_ARREGLOS {


    public static void main(String[] args) {
       int [] arreglo = new int [1000000000];
       for (int i = 0; i < arreglo.length; i++){
           arreglo[i] = ( int ) (Math.random() * 1000);
       }
    }
    
}
