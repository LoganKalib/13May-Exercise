package za.ac.cput;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result5 {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int firstDiagonal = 0, secondDiagonal = 0;
        int rows = arr.size(), cols = arr.get(0).size();

        int i=0,j=0,k=0,l= arr.size()-1;

        while(i<rows && j< cols && k <rows && l >=0){
            firstDiagonal += arr.get(i).get(j);
            secondDiagonal += arr.get(k).get(l);
            i+=1;
            j+=1;
            k+=1;
            l-=1;
        }
        System.out.println(firstDiagonal + " " + secondDiagonal);
        return Math.abs(firstDiagonal-secondDiagonal);

    }

}

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<List<Integer>> arr = new ArrayList<>();
//
//        IntStream.range(0, n).forEach(i -> {
//            try {
//                arr.add(
//                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                .map(Integer::parseInt)
//                                .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });

        Integer[][] arr = new Integer[][]{{1,2,3},{4,5,6},{7,8,9}};

        for (int e=0;e<arr.length;e++){
                System.out.println(Arrays.toString(arr[e]));


        }

        int result = Result5.diagonalDifference(Arrays.stream(arr).map(Arrays::asList).collect(toList()));

        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
