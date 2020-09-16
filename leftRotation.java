package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result  {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
        int n=arr.size();
        List<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n+d; i++) {
           a.add(0);
        }
        for(int i=0;i<n;i++){
            a.set(i,arr.get(i));
        } 
        for(int i=0;i<d;i++){
            a.set(n+i,arr.get(i));
        } 
        while(d-->0){
            for(int i=0;i<d;i++){
                int temp=a.get(i);
                a.set(i,a.get(i+1));
                a.set(i+1,temp);
            }
            a.remove(d);
        }
    
      //  for (int i = 0; i < n+d; i++) {
       //    System.out.print(a.get(i)+" ");
       // } 
        return a;
    }

}

public class leftRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        List<Integer> result = Result.rotateLeft(d, arr);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
