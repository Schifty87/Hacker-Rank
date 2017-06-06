package Diagonal_Difference;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = in.nextInt();
            }
        }
        int sumA = 0;
        int sumB = 0;
        for(int i=0; i<n; i++){
        	sumA += a[i][i];
        	sumB += a[i][(n-1)-i];       	
        }
        System.out.println(Math.abs(sumA-sumB));
    }
}
