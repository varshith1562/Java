package hackerrank;
import java.io.*;
import java.util.*;
public class arrayrev {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] s=br.readLine().split(" ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(s[i]);
			//System.out.print(arr[i]+" ");
		}
		System.out.println(arr.length);
		/* for(int j=n-1;j>=0;j--) {
			System.out.print(arr[j]+" ");
	 	 } */
		int[] b=new int[n];
		for(int j=n-1,i=0;j>=0 && i<n;j--,i++) {
			b[i]=arr[j];
			System.out.print(b[i]+" ");
	 	 }
	}
}
