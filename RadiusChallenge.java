package HackerHank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        double totalPositive = 0;
        double totalNegative = 0;
        double totalZero = 0;

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > 0) {
                totalPositive++;
            }
            if(arr.get(i) < 0) {
                totalNegative++;
            }
            if(arr.get(i) == 0) {
                totalZero++;
            }
        }
        int numOfElements = arr.size();
        double positiveResult = totalPositive / numOfElements;
        double negativeResult = totalNegative / numOfElements;
        double zeroResult = totalZero / numOfElements;


            System.out.printf("%.6f%n", positiveResult);
            System.out.printf("%.6f%n",negativeResult);
            System.out.printf("%.6f%n",zeroResult);

    }

}

public class RadiusChallenge {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
//usando java streams
//long totalPositive = arr.stream().filter(num -> num > 0).count();
//    long totalNegative = arr.stream().filter(num -> num < 0).count();
//    long totalZero = arr.stream().filter(num -> num == 0).count();
//    int numOfElements = arr.size();
