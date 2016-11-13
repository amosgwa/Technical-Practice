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
	
	public static void traverse_dfs(TreeNode input){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(input);
		println(input.data);
		
		while(!stack.isEmpty()){
			TreeNode currNode = stack.peek();
			//Look at the child nodes
			TreeNode child = currNode.getUnvisitedChild();
			
			if(child != null){
				child.visited = true;
				println(child.data);
				stack.push(child);
			} else {
				stack.pop();
			}
		}
		
		
	}
	
	public static void main(String[] args){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(3,2,5,7,2,2,6,9,3,-900));
		ArrayList<Character> Char_input = new ArrayList<Character>(Arrays.asList('m','y','n','a','A','m','o','s'));
		ArrayList<Character> result = mergeSort(Char_input);
		
		println(Arrays.toString(result.toArray()));
		
		//Traversing tree
		TreeNode root = TreeNode.createSampleTree();
		traverse_dfs(root);
	}
	
	public static void println(Object line){
		System.out.println(line);
	}
	
	private static class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNode right;
		private Boolean visited;
		
		private TreeNode(int data){
			this.data = data;
			this.right = this.left = null;
			this.visited = false;
		}
		

		public static  TreeNode createSampleTree(){

			TreeNode root = new TreeNode(3);
			TreeNode a = new TreeNode(9);
			TreeNode b = new TreeNode(20);
			TreeNode c = new TreeNode(15);
			TreeNode d = new TreeNode(7);
			
			root.left = a;
			root.right = b;
			b.left = c;
			b.right = d;
			return root;
			
		}
		
		private TreeNode getUnvisitedChild(){
			
			if(this.left != null && !this.left.visited){
				return this.left;
			} else if (this.right != null && !this.right.visited){
				return this.right;
			}
			return null;
		}
	}
}
