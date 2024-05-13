package za.ac.cput;
import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result6 {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
       List<Integer> output = new ArrayList<>(100);

       for(int j=0;j<100;j++){
           output.add(0);
       }

       for(int i: arr){
           output.set(i,output.get(i)+1);
       }
       return output;
    }

}

public class CountingSort {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());

        Integer[] arr = new Integer[]{63, 25, 73, 1, 98, 73, 56, 84, 86, 57, 16, 83, 8,25, 81 ,56 ,9 ,53 ,98 ,67 ,99 ,12 ,83 ,89 ,80 ,91 ,39 ,86 ,76 ,85 ,74 ,39, 25, 90, 59, 10, 94, 32, 44, 3 ,89 ,30 ,27 ,79 ,46 ,96 ,27 ,32 ,18 ,21 ,92 ,69 ,81 ,40 ,40 ,34 ,68 ,78 ,24 ,87 ,42 ,69 ,23 ,41 ,78 ,22 ,6 ,90 ,99 ,89 ,50 ,30 ,20 ,1 ,43 ,3 ,70 ,95 ,33 ,46 ,44 ,9 ,69 ,48 ,33 ,60 ,65 ,16 ,82 ,67 ,61 ,32 ,21 ,79 ,75 ,75, 13, 87, 70, 33};

        List<Integer> result = Result6.countingSort(Arrays.asList(arr));
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
