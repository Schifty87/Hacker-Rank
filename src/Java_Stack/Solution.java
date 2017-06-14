package Java_Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


/*long and drawn out way of solving problem*/

class Solution{	   
	public static void main(String []argh){
		Scanner sc = new Scanner(System.in);
	      
		while (sc.hasNext()) {
			Stack<String> s = new Stack<String>();
			String input=sc.next();
			//cannot be balanced with an odd number of brackets
			if(input.length()%2 !=0){
				System.out.println("false");
			}
			else{
				//split all characters up into array
				String[] c = input.split("");
				//push characters into stack
				for(int i=0; i<c.length; i++){
					s.push(c[i]);
				}
				int si = s.size();
				
				ArrayList<String> f = new ArrayList<String>();
				//keep track of whether or not error occurs with 'y'
				int y = 0;
				for(int i=0; i<si; i++){
					String x = s.pop().trim();
					
					
					if(x.equals(")") || x.equals("}") || x.equals("]")){
						f.add(x.trim());
						
					}
					
					else{
						
						if(x.equals(("("))){
							if(f.contains(")")){
								f.remove(")");
							}
							else{
								System.out.println("false");
								y++;
								break;
							}
						}
						if(x.equals("{")){
							if(f.contains("}")){
								f.remove("}");
							}
							else{
								System.out.println("false");
								y++;
								break;
							}
						}
						if(x.equals("[")){
							if(f.contains("]")){
								f.remove("]");
							}
							else{
								System.out.println("false");
								y++;
								break;
							}
						}//end if's
					}//end else
					
				}//end for
				//edit here
				if(f.size()==0 && y==0){
					System.out.println("true");
				}
				if(f.size()!=0 && y==0){
					System.out.println("false");
				}
				
			}	
		}//end while	      
	}
}
