import java.util.Arrays;

public class Del_ele_inArray {
	

		public static void main(String[] args) {
	       int [] a= {1,2,3,4,5,6};
	       System.out.println("Org Array="+Arrays.toString(a));
	       
	       int index=2;
	       int[] b=new int[a.length-1];
	       int k=0;
	       
	       for(int i=0;i<a.length;i++) {
	    	   if(i==index) {
	    		continue;   
	    	   }
	    	   b[k++]=a[i];
	       }
	       System.out.println("New Array="+Arrays.toString(b));
		}

	}


