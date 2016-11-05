package technicalPractice;

import java.util.*;

public class arraysAndStrings {
	
	//Q1.1 Implement an algorithm to determine if a string has all unique characters.
	public static boolean Qone_one(String input){
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
