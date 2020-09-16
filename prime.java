import java.util.*;
import java.lang.*;
import java.io.*;
public class prime {

	public static void main (String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	//	BufferedWriter bw=new BufferedWriter(new OutputStreamReader(System.out));
		int t=Integer.parseInt(br.readLine());
		int c=0;
		while(t-->0){
		    int n=Integer.parseInt(br.readLine());
		    for(int i=2;i<15;i++){
		        c=0;
		        for(int j=1;j<15;j++){
		            if(i%j==0){
		                c++;
		            }
		        }
		        if(c==2){
		        	while(i>0) {
		        		int num=i%10;
		        		if(num==2 || num==3 || num==5 || num==7) {
		        			i=i/10;
		        			continue;
		        		}
		        		else {
		        			i=i/10;
		        			break;
		        		}
		        	}
		            System.out.println(i+" ");
		        }
		    }
		}
	}
}