package hackerrank;
import java.io.*;
import java.util.*;

public class array2D{

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int r=arr.length;
        int c=r,sum=0;
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<r-2;i++){
            sum=0;
            for(int j=0;j<c-2;j++){
                sum=(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+
                arr[i+2][j+1]+arr[i+2][j+2]);
                al.add(sum);
            }
        }
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+ " ");
        }
        int max=al.get(0);
        for(int i=1;i<al.size();i++){
            if(max<al.get(i)){
                max=al.get(i);
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
