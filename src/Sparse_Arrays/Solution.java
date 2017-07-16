package Sparse_Arrays;

import java.util.*;

public class Solution {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<String> arr1 = new ArrayList<String>();
		for(int i=0; i<n; i++){
			arr1.add(s.next());
		}
		n = s.nextInt();
		for(int i=0; i<n; i++){
			int c = 0;
			String x = s.next();
			for(int j=0; j<arr1.size(); j++){
				if(x.equals(arr1.get(j))){
					c++;
				}
			}
			System.out.println(c);
		}
		
	}
}
