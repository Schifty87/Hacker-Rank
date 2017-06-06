package Compare_the_Triplets;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void solve(int[] A, int[] B){
		int scoreA = 0;
		int scoreB = 0;
		for(int i=0; i<A.length; i++){
			if(A[i] > B[i]){
				scoreA++;
			}
			if(A[i] < B[i]){
				scoreB++;
			}
		}
		System.out.println(scoreA + " " + scoreB);
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] A = {a0, a1, a2};
        int[] B = {b0, b1, b2};
        solve(A,B);
       
        
    }
}
