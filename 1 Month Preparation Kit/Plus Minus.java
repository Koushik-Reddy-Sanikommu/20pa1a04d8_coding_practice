import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        float p=0.0f,n=0.0f,z=0.0f;
        int i=0;
        for(i=0;i<arr.size();i++){
            if(arr.get(i)<0){
                n++;       
            }
            else if(arr.get(i)>0){
                p++;
            }
            else{
                z++;
            }
        }
        float pr=p/arr.size();
        float nr=n/arr.size();
        float zr=z/arr.size();
        System.out.println(String.format("%.6f", pr));
        System.out.println(String.format("%.6f", nr));
        System.out.println(String.format("%.6f", zr));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
