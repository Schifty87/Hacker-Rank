package Staircase;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
               
        //cycle through every line
        for(int i=1; i<n+1; i++){
        	char[] C = new char[n];
        	int num = i;
        	//find number of spaces
        	int sp = n-i;
        	for(int j = 0; j<sp; j++){
        		C[j] = ' ';
        		System.out.print(' ');
        	}
        	for(int k=0; k<i; k++){
        		System.out.print('#');
        	}
        	System.out.println();  
            
        }
    }
}
