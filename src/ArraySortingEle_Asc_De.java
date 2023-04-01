import java.util.*;

public class ArraySortingEle_Asc_De {
	public static void main(String[] args) {
		String s[]= {"a","d","c","b"};
		
		System.out.println("Before Sorting...");
		
		for(String str:s)
		{
			System.out.println(str);
		}
		
		Arrays.sort(s);
		System.out.println();
		System.out.println("After Sorting Ascending Order...");
		
		for(String str : s)
		{
			System.out.println(str);
		}
		
		Arrays.sort(s,Collections.reverseOrder());
		
		System.out.println();
		System.out.println("After Sorting Decending Order...");
		
		for(String str :s)
		{
			System.out.println(str);
		}
	}

}
