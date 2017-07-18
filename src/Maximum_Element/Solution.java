package Maximum_Element;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> max = new Stack<Integer>();
		
		
		//get number of queries
		int n = s.nextInt();
		
		for(int i=0; i<n; i++){
			int option = s.nextInt();
			if(option==1){
				int num = s.nextInt();
				stack.push(num);
				if(max.isEmpty() || num >= max.peek()){
					max.push(num);
				}
			}
			if(option==2){
				//MUST use .equals() to compare items in stacks
				if(stack.peek().equals(max.peek())){
					max.pop();
				}
				stack.pop();
			}
			if(option==3){
				//print max
				System.out.println(max.peek());
			}
		}
		
		
	}
}
