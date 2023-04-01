import java.util.Arrays;

public class Missing_Num {
	

		public static void main(String[] args) {
			
			int [] a= {1,2,4,5,6};
			
			int mis=getMissingNumber(a,6);
			
			System.out.println("Missing Num in Array "+ Arrays.toString(a)+" is "+mis);
		}
		private static int getMissingNumber(int[] a, int n) {
			
			int actualSum=0;
			int expectedSum=(n*(n+1)/2);
			
			for(int i : a)
			{
				actualSum=actualSum+i;
			}
			return expectedSum-actualSum;
		}
	}

