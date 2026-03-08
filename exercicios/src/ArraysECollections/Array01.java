package arraysECollections;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        
        //int[] a = new int[4];
       // double[][] b = new double[4][4];

       double[] notasAlunoA = new double[3];
       notasAlunoA[0] = 7.9;
       notasAlunoA[1] = 8;
       notasAlunoA[2] = 6.7;

       System.out.println(Arrays.toString(notasAlunoA));
       
       double total = 0;
       for(int i = 0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];
       }

       System.out.printf("\n\nTotalA: %.1f", (total / notasAlunoA.length));

       double[] notasAlunoB = {6.8, 7, 5.6};

       double totalB = 0;

       for(int i = 0; i < notasAlunoB.length; i++){
            totalB += notasAlunoB[i];
       }

       System.out.printf("\n\nTotalB: %.1f\n\n", (totalB / notasAlunoB.length));
       
    }

}
