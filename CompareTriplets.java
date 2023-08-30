package HackerHank;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

public class CompareTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> newList = new ArrayList<>();
        int alicePoints = 0;
        int bobPoints = 0;
        for (int i=0; i< a.size(); i++){
                if(a.get(i) > b.get(i)){
                    alicePoints = alicePoints +  1;
                } else if (a.get(i) < b.get(i)) {
                    bobPoints = bobPoints + 1;
                }
            }

        newList.add(alicePoints);
        newList.add((bobPoints));
        return newList;
    }
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);

        List<Integer> b = new ArrayList<>();
        b.add(5);
        b.add(50);
        b.add(20);


        List<Integer> result = compareTriplets(a, b);
        System.out.println(result);

//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining(" "))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
