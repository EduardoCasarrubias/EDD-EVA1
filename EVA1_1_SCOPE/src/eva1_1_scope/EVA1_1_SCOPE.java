/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_1_scope;

/**
 *
 * @author ecasa
 */
public class EVA1_1_SCOPE {

  
   public static void main(String[] args) {
    int x = 100; //existe en todo el bloque del for
    for(int i= 0; i<10; i++){
       System.out.println("valor de i = "+ + i);
    }
       System.out.println("valor final de i =" + i);//no existe aqui
        System.out.println("valor de x = " + x);//existe aqui
   }
   public static void otraFuncion(){
       System.out.println("valor de x =" + x);//no existe aqui
   }
}
