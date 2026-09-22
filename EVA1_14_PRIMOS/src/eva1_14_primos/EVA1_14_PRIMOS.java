
package eva1_14_primos;

import java.util.Scanner;

public class EVA1_14_PRIMOS {        
    //CREOAR UNA FUNCION PARA UN ALGORITMO 
    // SOLICITAR UN ENTERO 
    //INDICAR SI EL NUMERO ES PRIMO O NO 
 
    public static String evaluarPrimo(int numero) {
        if (numero <= 1) {
            return "El numero " + numero + " No es primo";
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return "El numero " + numero + " No es primo";
            }
        }
        return "El numero " + numero + " Si es primo";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        try {
            int numero = scanner.nextInt();
            String resultado = evaluarPrimo(numero);
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("Debes ingresar un numero entero valido");
        } finally {
            scanner.close();
        }
    }
}

