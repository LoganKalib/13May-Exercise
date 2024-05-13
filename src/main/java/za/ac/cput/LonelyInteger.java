package za.ac.cput;

import java.util.*;

class Result4 {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Collections.sort(a);
        System.out.println(a);
        if(a.size() == 1){
            return a.get(0);
        }

        if(a.get(0) != a.get(1)){
            return a.get(0);
        }else if(a.get(a.size()-1) != a.get(a.size()-2)){
            return a.get(a.size()-1);
        }

        for(int i =2;i<a.size()-2;i+=2){
            if(Objects.equals(a.get(i), a.get(i + 1))){
                continue;
            }
                return a.get(i);
        }
        return -1;
    }

}

public class LonelyInteger {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2,3,3,6,2,5,4,6,4};

        List<Integer> a =Arrays.asList(arr);

        int result = Result4.lonelyinteger(a);
        System.out.println(result);
    }
}
