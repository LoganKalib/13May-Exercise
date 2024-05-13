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

class Result2 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        BigInteger sum = BigInteger.valueOf(0);
        Collections.sort(arr);

        for(Integer item:arr){
            sum = sum.add(BigInteger.valueOf(item));
        }
        System.out.println(sum.subtract(BigInteger.valueOf(arr.get(arr.size()-1))) + " " + sum.subtract(BigInteger.valueOf(arr.get(0))));

    }

}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());

        Integer[] arr1 = new Integer[]{793810624, 895642170, 685903712, 623789054, 468592370};
        List<Integer> arr = Arrays.asList(arr1);

        Result2.miniMaxSum(arr);

       // bufferedReader.close();
    }
}
