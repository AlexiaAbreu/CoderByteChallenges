package HackerHank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Resultado {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) { //refazer
        List<Integer> listaOrdenadaSemOMenor = arr.stream().sorted().skip(1).collect(toList());
        List<Integer> listaOrdenadaSemOMaior = arr.stream().sorted(Comparator.reverseOrder()).skip(1).collect(toList());

        long somaSemValorMenor = listaOrdenadaSemOMenor.stream().mapToInt(Integer::intValue).sum();
        long somaSemValorMaior = listaOrdenadaSemOMaior.stream().mapToInt(Integer::intValue).sum();

        System.out.print(somaSemValorMaior + " " );
        System.out.println(somaSemValorMenor);
    }

}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Resultado.miniMaxSum(arr);

        bufferedReader.close();
    }
}
