package A_Very_Big_Sum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        /*Initialize the sum*/
	        BigInteger sum = new BigInteger("0");
	        /*initialize the array based on user input*/
	        BigInteger arr[] = new BigInteger[n];
	        for(int i=0; i < n; i++){
	            arr[i] = scan.nextBigInteger();
	        }
	        for(int i=0; i< arr.length; i++){
	            sum = sum.add(arr[i]);
	        }
	        System.out.println(sum);
        
    }
}