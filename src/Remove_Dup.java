
public class Remove_Dup {
	
		public static void main(String[] args) {
	      int [] a= {1,1,2,3,4,4,1,9};
	      int count=0;
	      
	      
	      int k=0;
	      for(int i=0;i<a.length;i++) {
	    	  int j=0;
	    	  for(;j<i;j++) {
	    		  if(a[i]==a[j]) {
	    			  count++;
	    			  break;
	    		  }
	    	  }
	    	  if(i==j) {
	    		 
	    		 a[k++]=a[i];
	    	  }
	      }
	      System.out.println(a.length);
	      System.out.println(count);
	      int [] b=new int[(a.length)-count];
	      int z=(a.length)-count;
	     
	     for(int i=0;i<z;i++)
	     {
	    	 b[i]=a[i];
	    	 
	     }
	      for(int r=0;r<b.length;r++) {
	    	  System.out.println(b[r]);
	      }
		}

	}


