
public class NextGreatestEle {
	
		public static void main(String[] args) {
			int []a= {2,5,1,3};
			int next ;
			
			for(int i=0;i<a.length;i++)
			{
				next=-1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]<a[j])
					{
						next=a[j];
						break;
					}
				}
				System.out.println(a[i]+" "+next);	
			}	
		}
	}

