import java.util.*;
public class Find_Index_Based_On_Ele {
			public static void main(String[] args) {
			
			String s[]= {"Red","Green","Blue","Orange"};
			
			int index=0;
			
			boolean flag=false;
			for(int i=0;i<s.length;i++)
			{
				if(s[i]=="Blue") {
					
					flag=true;
					index=i;
				}
				
			}
			
			if(flag==true) 
			{
			System.out.println("Index = "+index);
			}
			else
			{
				System.out.println("Element Not Present In Array");
			}
		}
	}

