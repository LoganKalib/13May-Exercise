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

class Result3 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        int hours = Integer.parseInt(s.substring(0,2));
        String indicate = s.substring(s.length()-2);
        String returnString = s;
        if(indicate.equalsIgnoreCase("pm")){
                if(hours<10){
                    returnString = s.replace("0" +Integer.toString(hours),Integer.toString(hours+12));
                }else if(hours ==12){
                    returnString =  returnString.replace(indicate,"");
            }else{
                    returnString = s.replace(Integer.toString(hours),Integer.toString(hours+12));
                }
        }
        if(hours == 12 && indicate.equalsIgnoreCase("am")){
            returnString = s.replace(Integer.toString(hours), "00");
        }
        returnString =  returnString.replace(indicate,"");
        return returnString;
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
        String s = "12:45:54PM";

        String result = Result3.timeConversion(s);
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
