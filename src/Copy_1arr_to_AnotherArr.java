import java.util.*;
public class Copy_1arr_to_AnotherArr {
	
	 

		public static void main(String[] args) {
			
			int oldArr[]= {1,2,3,4,5};
			int newArr[]=Arrays.copyOf(oldArr, oldArr.length);
			
			for(int i=0;i<newArr.length;i++)
			{
				System.out.println(newArr[i]);
			}
		}
	}

