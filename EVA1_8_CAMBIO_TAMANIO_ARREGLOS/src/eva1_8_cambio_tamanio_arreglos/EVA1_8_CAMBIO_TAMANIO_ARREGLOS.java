package eva1_8_cambio_tamanio_arreglos;

public class EVA1_8_CAMBIO_TAMANIO_ARREGLOS {

    public static void main(String[] args) {
        int [] datos = new int [10];
        System.out.println(datos);
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 100);
        }  
        for (int i = 0; i < datos.length; i++){
            System.out.println("[" + datos[i] + "]");
        }
        System.out.println("");
        datos = new int [5];
        System.out.println(datos);
        for (int i = 0; i < datos.length; i++){
            System.out.println("[" + datos[i] + "]");
        }  
    }
}
//como puedo cambiar de 10 a 5 elementos (los primeros) sin perder la informacion
//AIarray crea un nuevo arreglo de 2 enteros
//En "null" ocupa 2 bytes en el HEAP
//Ai = Arreglos de enteros es decir, ejemplo Method Main (){
//int[] siArray = new int [3];
//aiArray = new int [2];
// solo el Garbage collector se encarga de desopcupar los objetos que se dejaron de utilzar el espacio
//Los parentesis es un constructor que va determinar que memoria vamos a requerir en el HEAP
//Array almacena las direcciones de los arrglos 