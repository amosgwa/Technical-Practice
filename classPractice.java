package technicalPractice;

import java.util.*;
import static technicalPractice.utilities.*;

public class classPractice {
	public class person{
		int age;
		int weight;
		public String name;
		public Boolean married;
		public ArrayList<String> children;
		
		public person(String name, int age, int weight, Boolean married){
			this.name = name;
			this.age = age;
			this.weight = weight;
			this.married = married;
		}
		
		public void printInfo(){
			println(this.name+" is "+age+" years old and is weighed "+ weight + ". The person "+(married?"is":"isn't")+" married");
		}
	}
	
	public static void main (String[] args){
		classPractice personPractice = new classPractice();
		person amos = personPractice.new person("Amos",23,130,false);
		amos.printInfo();
	}
}
