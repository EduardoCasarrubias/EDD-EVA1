/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_arreglo;

/**
 *
 * @author bisonte
 */
public class EVA1_6_arreglo {

    
    public static void main(String[] args) {
       int [] arreglo1 = new int [10]; //cuanta memoria ocupa? 40 bytes
       //acceso por idices 
       arreglo1 [1] = 100;
       for (int i = 0; i < 10; i++){
           arreglo1[i] = ( int ) (Math.random() * 100); 
       }
       for (int i = 0; i < 10; i++){
          System.out.println("[" + arreglo1 [i] + "]");
       }
    }
    
}
