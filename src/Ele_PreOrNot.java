import java.util.*;
public class Ele_PreOrNot {
	
	//Elements present in atleast two arrays

		public static void main(String[] args) {
	        Integer []a1= {4,6,2,9,2};
	        Integer []a2= {1,2,3,4,5};
	        Integer []a3= {9,8,7,6,5};
	 //Hash set using for unique     
	        HashSet<Integer> h=new HashSet<>();  
	        
	        List<Integer> l1=Arrays.asList(a1);
	        List<Integer> l2=Arrays.asList(a2);
	        List<Integer> l3=Arrays.asList(a3);
	        
	        h.addAll(l1);
	        h.addAll(l2);
	        h.addAll(l3);
	        
	        List<Integer> finallist=new ArrayList<Integer>();
	        
	        for(Integer num:h) { //we are checking hashset ele presents or not in l1,l2 and l3
	        	if((l1.contains(num) && l2.contains(num))||
	        	  (l2.contains(num) && l3.contains(num))||
	        	  (l3.contains(num) && l1.contains(num)))
	        	{
	        		finallist.add(num);
	        	}
	        }
	        System.out.println(finallist);
		}

	}


