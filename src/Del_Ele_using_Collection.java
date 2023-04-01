import java.util.*;

public class Del_Ele_using_Collection {
	

		public static void main(String[] args) {
	       String[] s= {"Red","Green","Blue"};
	       
	      List<String>sl=new ArrayList(Arrays.asList(s));
	      
//	      sl.remove(2);
	        sl.remove("Red");
	      
	      System.out.println(sl); //UnsupportedOperationException
	                              //^^without creating list object
		}

	}


