package za.ac.cput;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

class Results7{

    public static int flipping(List<List<Integer>> arr){
        int x = arr.size();
        int sum=0;
        int a =0,b=0,c=0,d=0;

        for(int i = 0;i<x/2;i++){
            for(int j = 0; j< x/2;j++){

                a = arr.get(i).get(j);
                b = arr.get(i).get(x - j -1);
                c = arr.get(x-i-1).get(j);
                d = arr.get(x-i-1).get(x-j-1);

                System.out.println(a + " "+ b + " " + c + " " + d);
                sum += Math.max(a,Math.max(b,Math.max(c,d)));
            }
        }
        return sum;

    }
}

public class FlippingTheMatrix {

    public static void main(String[] args) {
        Integer[][] arr = new Integer[][]{{112,42,83,119},{56,125,56,49},{15,78,101,43},{62,96,114,108}};

        System.out.println(
                Arrays.deepToString(arr)
        );
        int result = Results7.flipping(Arrays.stream(arr).map(Arrays::asList).collect(toList()));
        System.out.println(result);
    }

}
