
package eva1_9_arrelglos_obj;


public class EVA1_9_ARRELGLOS_OBJ {

 
    public static void main(String[] args) {
        Ejemplo [] arreglo = new Ejemplo [2]; //arreglo que guarda dos objetos de tipo ejemplo
    System.out.println("arreglo = " + arreglo);
    System.out.println("arreglo [0] = " + arreglo[0]);
    System.out.println("arreglo [1] = " + arreglo[1]);
       arreglo[0] = new Ejemplo ();
       arreglo[1] = new Ejemplo ();
    System.out.println("arreglo = " + arreglo);
    System.out.println("arreglo [0] = " + arreglo[0]);
    System.out.println("arreglo [1] = " + arreglo[1]);
       // NECESITAMOS UN DUPLICADO
    Ejemplo [] copia =  arreglo;
    System.out.println("arreglo = " + arreglo);
    System.out.println("copia = " + copia);
    }
    
}
class Ejemplo{
    int valor = 5;
}
