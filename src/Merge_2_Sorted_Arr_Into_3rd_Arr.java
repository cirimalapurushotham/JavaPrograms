

public class Merge_2_Sorted_Arr_Into_3rd_Arr {
		
		public static int[] merge(int[] arr1,int arr2[])
		{
			int[] result=new int[arr1.length+arr2.length];
			int i=0;
			int j=0;
			int k=0;
			
			while(i < arr1.length && j<arr2.length)
			{
				if(arr1[i] < arr2[j])
				{
				    result[k++] = arr1[i++];
				}
				else
				{
					result[k++] = arr2[j++];
				}
			}
			
			while(i < arr1.length)
			{
				result[k++]=arr1[i++];
			}
			while(j < arr2.length)
			{
				result[k++] = arr2[j++];
			}
			return result;
		}
	   public static void main(String[] args) {
		
		  int [] arr1= {1,5,6,7,12,12};
		  int [] arr2= {2,5,8,9,11};
		  
		  int [] result = merge(arr1 , arr2);
		  
		  for(int i=0; i<result.length;i++)
		  {
			  System.out.print(result[i]+" ");
		  }
	  }
	}


