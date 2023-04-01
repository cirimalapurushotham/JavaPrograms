
public class Move_All_Neg_Ele_Start_OF_The_Array {
	
		public static void main(String[] args) {
			
			int a[]= {-1,10,20,-2,30,-3};
			
			int a1[]=new int [a.length];
			
			rearrange(a,a1);
			
			print(a1);
		}

		private static void print(int[] a1) {
			
			for(int i :a1)
			{
				System.out.print(i);
				System.out.print(" ");
			}
		}
		private static void rearrange(int[] a, int[] a1) {
		
			int j=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]<0)
				{
					a1[j]=a[i];
					j++;
				}
			}
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>0)
				{
					a1[j]=a[i];
					j++;
				}
			}
		}
	}


