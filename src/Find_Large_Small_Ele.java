
public class Find_Large_Small_Ele {
	

		public static void main(String[] args) {
	          int[] a= {3,6,4,2,5,7};
	          int lar=Integer.MIN_VALUE;
	          int small=Integer.MAX_VALUE;
	          for(Integer n:a)
	          {
	        	  if(n>lar)
	        	  {
	        		  lar=n;
	        	  }
	          }
	          System.out.println("Large num="+lar);
	          for(Integer n:a)
	          {
	        	  if(n<small)
	        	  {
	        		  small=n;
	        	  }
	          }
	          System.out.println("Small num="+small);
		}

	}

