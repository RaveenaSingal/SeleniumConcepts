package Java_Programs_forLoop;
import java.util.*;
import java.util.ArrayList;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		// Remove Duplicate Word from a String
		String name = "automation";
		
		
		Set<Character> unique  =new LinkedHashSet<>();
		for(char un:name.toCharArray()) {
			unique.add(un);
		}
	
		System.out.println("After Removing Duplicates"+" "+unique);

	}

}
