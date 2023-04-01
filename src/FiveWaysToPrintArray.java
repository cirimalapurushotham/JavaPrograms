import java.util.Arrays;

public class FiveWaysToPrintArray {
	
		public static void main(String[] args) {
			
			String s[]= {"hari","praveen","raj","rick","purushotham"};
			
			System.out.println("1st Way");
			
			System.out.println(s);
			
			
			System.out.println();
			System.out.println("2nd Way");
			
			for(int i=0;i<s.length;i++)
			{
				System.out.println(s[i]);
			}
			System.out.println();
			System.out.println("3rd way");
			
			for(String str:s)
			{
				System.out.println(str);
			}
			System.out.println();
			System.out.println("4th way");
			
			System.out.println(Arrays.asList(s));
			
			System.out.println();
			
			System.out.println("5th way");
			
			System.out.println(Arrays.deepToString(s));
		}
	}


