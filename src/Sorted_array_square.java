import java.util.Arrays;

public class Sorted_array_square {
	
		public static int[] sum(int a[])
		{
			int[] s=new int[a.length];
			int sa=0;
			int e=a.length-1;
			int sq_ind=a.length-1;
			while(sa<=e) {	
	          if(a[sa]*a[sa]>a[e]*a[e])
	          {
		        s[sq_ind--]=a[sa]*a[sa];
				sa++;
	          }else {
		        s[sq_ind--]=a[e]*a[e];
		         e--;
	           }
			}
			return s;
		}
		public static void main(String[] args) {
			int []a= {2,5,7};
	        int []sx=sum(a);
	        System.out.println(Arrays.toString(sx));
		}

	}

