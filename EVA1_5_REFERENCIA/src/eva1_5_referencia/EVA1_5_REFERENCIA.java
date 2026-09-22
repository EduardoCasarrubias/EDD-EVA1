
package eva1_5_referencia;

public class EVA1_5_REFERENCIA {

    public static void main(String[] args) {
        int x = 5;
        System.out.println("valor de x = " + x);
        incrementar(x);
        System.out.println("valor de x modificado = " + x);
        
        // ahora con objetos
        MiValor mv = new MiValor();
        System.out.println("MiValor.y = " + mv.y);
        incrementarObj(mv);
        System.out.println("MiValor.y = " + mv.y);
    }
    
    public static void incrementar(int valor) {  
        valor = valor + 1;
    }
    
    public static void incrementarObj(MiValor valor) {
        valor.y = valor.y + 1;
    }
}

class MiValor {
    int y = 5;
}