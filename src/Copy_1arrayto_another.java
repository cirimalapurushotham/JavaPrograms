
public class Copy_1arrayto_another {
	

	    public static void main(String[] args) {
			
		
		int a[]= {7,2,3,4,5,6,1};
		int sum=8;
		
		int low=0;
		int high=a.length-1;
		boolean flag=false;
		while(low < high)
		{
			if(a[low] + a[high] != sum)
			{
				high--;
				low++;
			}
			else if((a[low]+a[high]) == sum)
			{
				flag=true;
				System.out.println("Pair ("+a[low]+" , "+a[high] + ")");
				low++;
				high--;
			}
		}
		if(flag==false)
		{
			System.out.println("No Pairs Found");
		}
	}
	}

