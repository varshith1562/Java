import java.util.*;
import java.io.*;
public class sort {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int n,k;
		while(t-->0) {
			n=Integer.parseInt(br.readLine());
			int[] arr=new int[n];
			String[] num=br.readLine().split(" ");
			for(int i=0;i<n;i++) {
				arr[i]=Integer.parseInt(num[i]);
			}
			k=Integer.parseInt(br.readLine());
			int min_index;
			for(int j=0;j<n;j++) {
				min_index=j;
				for(int l=j+1;l<n-1;l++) {
					if(arr[k]<arr[min_index]) {
						min_index=l;
					}
				}
				int temp=arr[min_index];
				arr[min_index]=arr[j];
				arr[j]=temp;
			}
			
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			} 	
		}
	}
}
