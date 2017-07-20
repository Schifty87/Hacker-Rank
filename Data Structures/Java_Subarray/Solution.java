package Java_Subarray;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
        	arr[i] = s.nextInt();
        }
              
        ArrayList<Integer> sum = new ArrayList<Integer>();
        
        //initialize negative number tally
        int neg = 0;
        
        for(int i=0; i<arr.length; i++){
        	sum.add(arr[i]);
        	int total = arr[i];
        	for(int j=i+1; j<arr.length; j++){
        		total += arr[j];
        		sum.add(total);
        	}
        }
        int total = 0;
        for(int i=0; i<sum.size(); i++){
        	if(sum.get(i)<0){
        		total++;
        	}
        }
        System.out.println(total);
    }
}
