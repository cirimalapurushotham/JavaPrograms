
public class PairsOfSum {
	
		public static void main(String[] args) {
			int []a= {20,10,20,50,40};
			int sum=50;
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]+a[j]==sum)
					{
						System.out.println(a[i]+" "+a[j]);
					}
				}
			}
		}

	}

