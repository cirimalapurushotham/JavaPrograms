import java.util.*;

public class DuplicateEle_Using_map {
	

	
		public static void main(String[] args) {
			
	      int[] a= {2,5,3,1,8,7,2,5,8};
	      
	      Map<Integer,Integer> m=new HashMap<>();
	      
	      for(int i=0;i<a.length;i++) {
	    	  
	    	  if(m.containsKey(a[i])) {
	    		  m.put(a[i], m.get(a[i])+1);
	    	  }else {
	    		  m.put(a[i], 1);
	    	  }
	      }
	      
	      m.forEach((k,v) -> {
	    	  if(v > 1) {
	    		  System.out.print(k+",");
	    	  }
	      });
		}

	}


