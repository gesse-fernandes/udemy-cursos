package sessão2.aula_19;

import java.util.Random;

public class ArraysMatrizes {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        Random r = new Random();
        for(int i=0;i<matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = r.nextInt(10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf(" [%d] ", matriz[i][j]);
            }
            System.out.println();
        }


    }
}
