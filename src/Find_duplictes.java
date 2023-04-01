
public class Find_duplictes {
	

		public static void main(String[] args) {
	      int [] a= {1,2,5,2,4,5,6,7};
	      
	      for(int i=0;i<a.length;i++) {
	    	  for(int j=i+1;j<a.length;j++) {
	    		  if(a[i]==a[j]) {
	    			  System.out.println("1st Occured ele in given array="+a[i]);
	    			  return;
	    		  }
	    	  }
	      }
		}
	}


