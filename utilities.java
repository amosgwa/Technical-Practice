package technicalPractice;
import java.util.*;

public class utilities<T extends Comparable<T>> {
	public static <T extends Comparable> ArrayList<T> mergeSort(ArrayList<T> input){
				
		if(input.size() <= 1){
			ArrayList<T> newArray = new ArrayList<T>();
			newArray.add(input.remove(0));
			return newArray;
		}
		
		int mid = input.size()/2;
		
		ArrayList<T> left = mergeSort(new ArrayList<T>(input.subList(0, mid)));
		ArrayList<T> right = mergeSort(new ArrayList<T>(input.subList(mid, input.size())));
		
		//Merge
		ArrayList<T> result = new ArrayList<T>();
		
		while(left.size() != 0 && right.size() != 0){
			
			if(left.get(0).compareTo(right.get(0)) < 0){
				result.add(left.remove(0));
			} else {
				result.add(right.remove(0));
			}
		}
		
		result.addAll(right);
		result.addAll(left);
		
		return result;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(3,2,5,7,2,2,6,9,3,-900));
		ArrayList<Character> Char_input = new ArrayList<Character>(Arrays.asList('m','y','n','a','A','m','o','s'));
		ArrayList<Character> result = mergeSort(Char_input);
		
		println(Arrays.toString(result.toArray()));
	}
	
	public static void println(Object line){
		System.out.println(line);
	}
}
