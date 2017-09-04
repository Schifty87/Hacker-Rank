package Big_Sorting;

/*Problem
 * 
 * When given user-input numbers, sort them and print
 * the results.  All numbers are to be on their own line
 * 
*/

/*Solution
 * 
 * Ran into some roadblocks using arraylist and BigInteger.
 * Ended up settling with String data type and normal arrays.
 * Used Comparator to sort array.  Had some issues figuring out why
 * I was timing out on HackerRank.  Turns out it was because I was doing
 * unnecessary comparisons between small and large numbers based on
 * decimal places.  This greatly helps with the computing time. 
 * 
*/




import java.util.*;
import java.math.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int i = 0; i < n; i++){
        	unsorted[i] = in.next();
        }

        Arrays.sort(unsorted,new Comparator<String>(){
            @Override
            public int compare(String x, String y){
                return Compare(x,y);
            }
        });
        
        for(int i=0; i<unsorted.length; i++){
        	System.out.println(unsorted[i]);
        }
    }
    
    
    static int Compare(String x, String y){
    	
    	/*
    	 * first check to see if one number is simply larger
    	 * by looking at the number of digits.
    	 * This prevents unneeded comparisons of small integers to
    	 * rediculously large ones
    	*/
        if(x.length() > y.length()){
        	return 1;
        }
        if(x.length() < y.length()){ 
        	return -1;
        }      
        /*
         * Otherwise, you can look at the individual digits
        */
        for(int i=0; i<x.length(); i++){
            if(x.charAt(i)>y.charAt(i)){ 
            	return 1;
            }
            if(x.charAt(i)<y.charAt(i)){ 
            	return -1;
            }
        }
        return 0;
    }
}
