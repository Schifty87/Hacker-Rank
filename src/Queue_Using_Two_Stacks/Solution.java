package Queue_Using_Two_Stacks;


import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		
		//initialize stacks
		//push into here initially
		Stack<Integer> one = new Stack<Integer>();
		//this is the real one that reverses the order
		Stack<Integer> two = new Stack<Integer>();
		
		for(int i=0; i<count; i++){
			int option = s.nextInt();
			
			if(option==1){
				if(two.isEmpty()){
					one.push(s.nextInt());
				}
				else{
					//take everything in two and put into one
					while(!two.isEmpty()){
						one.push(two.pop());
					}
					one.push(s.nextInt());
				}
			}
			if(option==2){
				if(one.isEmpty()){
					two.pop();
				}
				else{
					while(!one.isEmpty()){
						two.push(one.pop());
					}
					two.pop();
				}
			}
			if(option==3){
				if(one.isEmpty()){
					System.out.println(two.peek());
				}
				else{
					while(!one.isEmpty()){
						two.push(one.pop());
					}
					System.out.println(two.peek());
				}
			}
		}
		
		
		
	}
}
