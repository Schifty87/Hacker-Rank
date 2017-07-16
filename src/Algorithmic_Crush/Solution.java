package Algorithmic_Crush;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		
		ArrayList<BigInteger> arr = new ArrayList<BigInteger>();
		
		//initialize array
		for(int i=0; i<x+1; i++){	
			arr.add(new BigInteger("0"));
		}
		//System.out.print(arr);
		
		
		
		
		//initialize max value
		BigInteger max = new BigInteger("0");
		
		for(int i=0; i<y; i++){
			int start = s.nextInt();
			int end = s.nextInt();
			BigInteger a = s.nextBigInteger();
			
			for(int j=start-1; j<end; j++){
				//retreive the item to modify
				BigInteger n = arr.get(j);
				BigInteger m = n.add(a);
				arr.set(j, m);
				if(m.compareTo(max)>0){
					max = m;
				}
				
			}
		}
		System.out.println(max);
		
	}
}
