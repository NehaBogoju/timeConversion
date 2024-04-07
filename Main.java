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

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here +12
        String[] words=s.split(":");
        int hour=Integer.valueOf(words[0]);
        if(s.charAt(s.length()-2)=='P'){
            if(hour==12){
                words[0]=String.valueOf("12");
            }
            else{
                hour=hour+12;
                words[0]=String.valueOf(hour);
            }
            
            
        }
        else{
            if(hour==12){
                words[0]=String.valueOf("00");
            }
        }
        
        String ss=String.join(":",words);
        ss=ss.substring(0,s.length()-2);
        return ss;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
