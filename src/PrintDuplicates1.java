import java.util.*;
public class PrintDuplicates1 {
	

		public static void main(String[] args) {
			
	      int []a= {34,45,6,34,2,45,2};
	      
	      duplicate( a);
	      nextmethod(a); 
		}

		 private static void nextmethod(int[] a) {
			Set<Integer> s=new HashSet();
			
			for(int i=0;i<a.length;i++)
			{
				if(s.contains(a[i]))
				{
					System.out.println(a[i]);
				}
				else
				{
					s.add(a[i]);
				}
			}	
		}

		static void duplicate(int[] a) {
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						System.out.println(a[i]);
					}
				}
			}	
		}

	
}
