package extra;

import java.util.*;
import java.lang.*;

/*
 *
 */
//prova 1 sap
public class provaSP {
    public static void main(String[] args) {

        int[] distanciaDeCadaFuncionario = {30, 40, 20, 81};
        int start = 25;
        int end  =75;

        int[]  answer = new int[100];

        for(int i =0; i < distanciaDeCadaFuncionario.length; i++){
            if(distanciaDeCadaFuncionario[i] > start && distanciaDeCadaFuncionario[i] < end){
                answer[i] = distanciaDeCadaFuncionario[i];
            }
        }
        System.out.println(Arrays.toString(distanciaDeCadaFuncionario));
        System.out.println(Arrays.toString(answer));

    }
}
