import java.util.*;
public class Printdupicate_2 {
	
		
			public static void main(String[] args) {
				String dup[]=new String[] {"java","spring","hibernet","java"};
				
				Set nonDup=new HashSet<>();
				
				Set dupSet=new HashSet<>();
				
				for(String s :dup)
				{
					if(!nonDup.contains(s))
					{
						nonDup.add(s);
					}
					else
					{
						dupSet.add(s);
					}
				}
				System.out.println(dupSet);
			}
		}



