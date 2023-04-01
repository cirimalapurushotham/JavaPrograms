import java.util.Arrays;

public class MoveZeros_ToLast {
	
		public static void main(String[] args) {
	       int a[]= {23,2,0,4,0,45,3,0,5,6};
	       int b[]=new int[a.length];
	       zero(a,b);
		}

		private static void zero(int[] a, int[] b) {
			int j=0;
			int n=b.length-1;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=0)
				{
					b[j]=a[i];
					j++;
				}
				else {
					b[n]=a[i];
					 n--;
				}
			}
			System.out.println(Arrays.toString(b));
//			for(int y:b)
//			{
//				System.out.println(y);
//			}
			
		}

	}

