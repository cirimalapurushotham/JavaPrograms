
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Three_DifferentWayToConvert_ArrToArrList {

	public static void main(String[] args) {
		
		String s[]= {"Red","Green","Blue"};
		
		
		System.out.println("1st Way..");
		List li=Arrays.asList(s);
		
		System.out.println(li);
		
		System.out.println("2nd Way");
		
		List<String> l=new ArrayList<>();
		
		Collections.addAll(l,s);
		
		System.out.println(l);
		
		
		System.out.println("3rd Way");
		
		for(String str : s)
		{
		  l.add(str);
		}
		 
		System.out.println(l);

		
	}
}
