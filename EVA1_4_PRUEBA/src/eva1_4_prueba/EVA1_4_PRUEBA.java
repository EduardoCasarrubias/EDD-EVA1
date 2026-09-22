
package eva1_4_prueba;

public class EVA1_4_PRUEBA {

    public static void main(String[] args) {
        
        //REFERENCIAS -->> DIRECCCIÓB DE MEMORIA 
        //APUNTADORES-->> DIRECCCIONES DE MEMORIA -->> C++
        Prueba prueba = new Prueba ();
        System.out.println(prueba);
        //QUITART LA DIRECCIÓN 
        prueba = null; 
        //permite destruir (liberar memoria) de un objeto
    }   //COMO DESTRUYE JAVA LOS OBJETOS QUE YA NO SE VAN A USAR?
        //GARBAGE COLLECTOR
}
 class Prueba{
}



//LOS ARREGLOS SON OBJETOS PARA EL HEAP
// EN PARENTESIS ES LLAMADA FUNCIÓN

