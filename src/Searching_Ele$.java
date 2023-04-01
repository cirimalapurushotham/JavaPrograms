import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Searching_Ele$ {
	

		public static void main(String[] args) throws IOException {
	      int[] a= {1,2,3,4,5,6,7};
	      boolean flag=false;;
	      Integer index=null;
	      System.out.println("Enter the number to be search:");
	      //Same like Scanner class to take input from scanner
	      
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      String input= br.readLine();
	     
	      //Covert String to integer
	     Integer num=Integer.valueOf(input);
	     
	     for(int i=0;i<a.length;i++) {
	    	 if(a[i]==num) {
	    		 flag=true;
	    		 index=i;
	    	 }
	     }
	     if(flag==true) {
	    	 System.out.println("Ele is Present at index="+index);
	     }
		}

	}


