import java.util.HashMap;
import java.util.Map;

public class Majority_Ele_UsingMap {
	
		
		public static void main(String[] args) {
			int[] a= {10,20,10,10,30};
			
	     Map<Integer,Integer> m=new HashMap<>();
	     
	     for(int i=0;i<a.length;i++) {
	    	 
	    	 m.put(a[i], m.getOrDefault(a[i], 0)+1);
	     }
	     
	     //Iterate through the map
	     for(Map.Entry<Integer,Integer> i : m.entrySet()) {
	    	 if(i.getValue()>a.length/2) {
	    		 int res=i.getKey();
	    		 System.out.println(res);
	    	 }
	     }
	     
		}

	
}
