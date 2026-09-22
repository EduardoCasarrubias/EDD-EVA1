
package eva1_2_stack_;

public class EVA1_2_STACK_ {


    public static void main(String[] args) {
        System.out.println("INICIA main()");
        A();
        System.out.println("TERMINA msin()");
    }
    public static void A() {
        System.out.println("INICIA A()");
        A();
        System.out.println("TERMINA A()");
    }
     public static void B() {
        System.out.println("INICIA B()");
        B();
        System.out.println("TERMINA B()");
    }
}
