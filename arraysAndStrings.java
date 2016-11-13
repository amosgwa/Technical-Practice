package technicalPractice;

import java.util.*;
import static technicalPractice.utilities.*;

public class arraysAndStrings {
	
	//Q1.1 Implement an algorithm to determine if a string has all unique characters.
	public static boolean Qone_one(String input, Boolean noExtraSpace){
		
		// If extra space is not allowed. O(n lg n)
		if(noExtraSpace) {
			ArrayList<Character> inputChar = new ArrayList<Character>();
			for(int i = 0; i < input.length(); i++){
				inputChar.add(input.charAt(i));
			}
			
			//Sort
			// Collections.sort(inputChar);
			inputChar = mergeSort(inputChar);
			char prev = inputChar.get(0);
						
			for(int i = 1; i < input.length(); i++){
				if(input.charAt(i) == prev){
					return false;
				}
				prev = input.charAt(i);
			}
			return true;
		} 
		// If extra space is allowed O(n)
		// Store each character into a set
		Set<Character> set = new HashSet<Character>();
		
		for(int i = 0; i < input.length(); i++){
			char currChar = input.charAt(i);
			if(!set.contains(currChar)){
				set.add(currChar);
			} else {
				return false;
			}
		}
		return true;
	}
	
	
}
