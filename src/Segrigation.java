import java.util.Arrays;

public class Segrigation {
	

		public static int[] segrigation(int a[])
		{
			int left,right;
			left=0;
			right=a.length-1;
			while(left<right)
			{
				while(a[left]%2==0 && left<right)
				{
					left++;
				}
				while(a[right]%2==1 && left<right)
				{
					right--;
				}
				if(left<right) {
					int temp=a[left];
					a[left]=a[right];
					a[right]=temp;
					left++;
					right--;
					
				}
			}
			return a;
		}
		
		
		public static void main(String[] args) {
			
	        int s[]= {0,1,1,0,1,0,1,1,0};
	          segrigation(s);
	          System.out.println(Arrays.toString(s));
		}

	}


