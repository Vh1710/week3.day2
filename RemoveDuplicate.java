package week3.day2;



import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
	
	String input="we learn java basics as a part of java session in java week1";
	Set<Character> charset=new LinkedHashSet<Character>();
	
	
	for (int i = 0; i < input.length(); i++) {
		charset.add(input.charAt(i));
		}
      for (Character std : charset) {
    	  if(std !=' ')
    	  System.out.print(std);
		
	}
	}

}
