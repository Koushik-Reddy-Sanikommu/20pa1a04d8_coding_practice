import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        s=s.toLowerCase();
        int i=0,sum=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i)) && s.charAt(i)<='z' && s.charAt(i)>='a'){
                System.out.println(s.charAt(i));
                map.put(s.charAt(i),1);
            }
            else{
                continue;
            }
        }
        for(Map.Entry<Character,Integer>e:map.entrySet()){
            sum+=map.get(e.getKey());
        }
        System.out.println(sum);
        if(sum==26){
            return "pangram";
        }
        else{
            return "not pangram";
        }
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
