import java.util.Arrays;
import java.util.stream.IntStream;

public class Deleting_Ele_inArray {
	
	
		public static void main(String[] args) {
			int[] a= {1,2,3,4,5,6,7};
			System.out.println("Origanal Array Ele="+Arrays.toString(a));
	        
			int delIndex=3;
			
			int[] newArray=IntStream.range(0, a.length).filter(i->i != delIndex).map(i->a[i]).toArray();
			
			System.out.println("New Array After deleting index="+Arrays.toString(newArray));
		}

	}


