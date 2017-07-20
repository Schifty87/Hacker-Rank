package Java_List;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	for(int i=0; i<n; i++){
    		arr.add(s.nextInt());
    	}
    	
    	//find number of queries
    	int x = s.nextInt();
    	
    	for(int i=0; i<x; i++){
    		String option = s.next();
    		if(option.equals("Insert")){
    			ArrayList<Integer> insert = new ArrayList<Integer>();
    			for(int j=0; j<2; j++){
    				insert.add(s.nextInt());
    			}
    			arr.add(insert.get(0),insert.get(1));
    		}
    		if(option.equals("Delete")){
    			int del = s.nextInt();
    			arr.remove(del);
    		}
    	
    	}
    	
    	for(int i=0; i<arr.size(); i++){
    		System.out.print(arr.get(i) + " ");
    	}
    	
    	
    }
}

   