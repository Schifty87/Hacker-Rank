package Array_Left_Rotation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int r = s.nextInt();
		
		//read in initial array
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<x; i++){
			arr.add(s.nextInt());
		}
		
		for(int i=0; i<r; i++){
			//get the item at beginning of array
			int n = arr.get(0);
			//remove item at beginning
			arr.remove(0);
			//add item to end of list
			arr.add(n);
		}
		
		for(int i=0; i<arr.size(); i++){
			System.out.print(arr.get(i) + " ");
		}
	}
}
