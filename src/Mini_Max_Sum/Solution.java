package Mini_Max_Sum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger[] arr = new BigInteger[5];
        for(int i=0; i < 5; i++){
            arr[i] = in.nextBigInteger();
        }
        BigInteger min = new BigInteger("0");
        BigInteger max = new BigInteger("0");
        for(int i=0; i<arr.length; i++){
        	BigInteger sum = new BigInteger("0");
        	for(int j=0; j<arr.length; j++){
        		if(j != i){
        			sum = sum.add(arr[j]);
        		}
        	}
        	
        	if(i==0 || sum.compareTo(max)==1){
        		max = sum;
        	}
        	if(i==0 || sum.compareTo(min)==-1){
        		min = sum;
        	}
        	
        }
        System.out.println(min + " " + max);
    }
}
