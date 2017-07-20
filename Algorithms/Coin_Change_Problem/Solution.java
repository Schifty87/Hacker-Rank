package Coin_Change_Problem;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long getWays(long n, long[] c){
        //cycle through individual integers
    	ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
    	//cycle through first number
    	for(int i=0; i<c.length; i++){
    		//number must be smaller than destination
    		if(c[i]<= n){
    			//cycle through numbers to compare to first
	    		for(int j=0; j<c.length; j++){
	    			
	    		}
    		}
    	}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //get destination number
        int n = in.nextInt();
        //get number of integers
        int m = in.nextInt();
        long[] c = new long[m];
        //read in the integers into an array
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(n, c);
    }
}
