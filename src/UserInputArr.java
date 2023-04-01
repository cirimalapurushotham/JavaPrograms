

import java.util.Scanner;

public class UserInputArr {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size");
		
		int size=sc.nextInt();
		
		int [] a=new int [size];
		
		System.out.println("Enter The Elements..");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println("Printing the elements..");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}