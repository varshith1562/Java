import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		/*String s=br.readLine();
		String[] s1=br.readLine().split(" ");
		System.out.println(s);
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}*/
		/* int i1=Integer.parseInt(br.readLine());
		System.out.println(i1); */
		
	    int sum=0;
		String[] s=br.readLine().split(" ");
		for(int i=0;i<s.length;i++) {
			sum=sum+Integer.parseInt(s[i]);
		}
		System.out.println("sum "+sum); 
		
	/*	System.out.println(s[0]+s[1]);
		int a=Integer.parseInt(s[0]);
		int b=Integer.parseInt(s[1]);
		System.out.print(a+b); */
		
		/*	int sum=0;
		int[] a=new int[s.length];
		a=new int[s.length];
		for(int i=0;i<s.length;i++) {
			a[i]=Integer.parseInt(s[i]);
			sum=sum+a[i];
		}
		//System.out.print("sum is"+a+b);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}  
		System.out.print(sum+ " "); */
		

	}
}
