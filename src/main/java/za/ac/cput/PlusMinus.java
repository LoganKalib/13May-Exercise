package za.ac.cput;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int denom = arr.size();
        double posCount = 0, negCount = 0, zeroCount = 0;
        DecimalFormat decimalFormat = new DecimalFormat("#0.000000");

        for(int item:arr){
            if(item < 0){
                negCount+=1;
            }else if(item > 0){
                posCount+=1;
            }else{
                zeroCount+=1;
            }
        }

        System.out.println(decimalFormat.format(posCount/denom));
        System.out.println(decimalFormat.format(negCount/denom));
        System.out.println(decimalFormat.format(zeroCount/denom));
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result1.plusMinus(arr);

        bufferedReader.close();
    }
}