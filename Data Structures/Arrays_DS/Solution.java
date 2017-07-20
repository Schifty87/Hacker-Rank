package Arrays_DS;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int arr_i=0; arr_i < n; arr_i++){
            arr.add(in.nextInt());
        }
        
        Collections.reverse(arr);
        
        for(int i=0; i<arr.size(); i++){
        	System.out.print(arr.get(i) + " ");
        }
	}
}
