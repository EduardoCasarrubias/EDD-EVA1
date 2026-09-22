/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_referencia;

/**
 *
 * @author ecasa
 */
public class EVA2_1_REFERENCIA {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Ejemplo ejemplo1 = new Ejemplo();
      System.out.println("ejemplo1 =" + ejemplo1);
      System.out.println("ejemplo.val =" + ejemplo1.val);
      System.out.println("ejemplo.otro =" + ejemplo1.otro);
      
      ejemplo1.otro = new Ejemplo();
      System.out.println("ejemplo1,otro =" + ejemplo1);
      System.out.println("ejemplo.otro.val =" + ejemplo1.val);
      System.out.println("ejemplo.otro.otro =" + ejemplo1.otro);
      
      ejemplo1.otro.otro = new Ejemplo();
      ejemplo1.otro.otro.otro = new Ejemplo();
      ejemplo1.otro.otro.otro.otro = new Ejemplo();//no tiene limtes- estos es una lksta concepto basico de una lista 
      
      Ejemplo siguiente = ejemplo1;
      while (siguiente !=null){
          System.out.print("[" + siguiente.val + "]");
          siguiente = siguiente.otro;
             
      }
      System.out.println("");
   }
   
}
class Ejemplo{
   int val =5;
   Ejemplo otro;
}