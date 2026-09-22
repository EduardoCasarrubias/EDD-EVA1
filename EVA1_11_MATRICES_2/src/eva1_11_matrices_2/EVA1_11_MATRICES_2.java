package eva1_11_matrices_2;

public class EVA1_11_MATRICES_2 {

    public static void main(String[] args) {
        int [][] matriz = new int [3][];
        matriz [0] = new int [3];
        matriz [1] = new int [4];
        matriz [2] = new int [5];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("[" + matriz [i][j] + "]");
            }
            System.out.println();
        }
    }
}
