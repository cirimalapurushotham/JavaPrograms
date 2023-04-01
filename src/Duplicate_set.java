import java.util.*;

public class Duplicate_set {
	
		public static void main(String[] args) {
			int a[]= {1,2,3,1,4,2};
			
			Set<Integer> s=new HashSet<>();
			
			boolean flag=false;
			
			for(int i=0;i<a.length;i++)
			{
				if(s.contains(a[i]))
				{
					flag=true;
					System.out.println("Duplicate Ele "+a[i]);
					
				}
				else
				{
					s.add(a[i]);
				}
			}
			if(flag==false)
			{
				System.out.println("No Duplicates..");
			}
		}
	}


