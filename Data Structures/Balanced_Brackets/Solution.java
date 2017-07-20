package Balanced_Brackets;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        bracket b = new bracket();
        int t = s.nextInt();
        for(int i = 0; i < t; i++){
            String n = s.next();
            //Must be even number in length
            if(n.length()%2==1){
            	System.out.println("NO");
            }
            else{
            	if(b.solve(n)==true){
            		System.out.println("YES");
            	}
            	else{
            		System.out.println("NO");
            	}
            }
        }
    }
}


class bracket{
	boolean solve(String x){
		int l = x.length();
		
		Stack<Character> s = new Stack<Character>();
		for(int i=0; i<l; i++){
			char n = x.charAt(i);
			if(s.isEmpty() && (n==')' || n=='}' || n==']')){
				return false;		
			}
			
			else if(n=='(' || n=='{' || n=='['){
				s.push(n);			
			}
			else{
				if(s.peek()=='(' && n==')' || s.peek()=='{' && n=='}'|| s.peek()=='[' && n==']'){
					s.pop();
				}
				else{
					return false;
				}
			}
		}
		if(!s.isEmpty()){
			return false;
		}
		return true;
	}
}