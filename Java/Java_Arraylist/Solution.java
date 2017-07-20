package Java_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		//initialize parent arraylist
		ArrayList <ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		Scanner S = new Scanner(System.in);
		int N= S.nextInt();
		
		for(int i=0; i<N; i++){
			//find the number of integers to be read in
			int num = S.nextInt();
			//initialize child ArrayList
			ArrayList<Integer> m = new ArrayList<Integer>();
			for(int j=0; j<num; j++){
				m.add(S.nextInt());
			}
			//add child arraylist to parent
			arr.add(m);			
		}
		
		//find the number of searches
		int H = S.nextInt();
		
		for(int i=0; i<H; i++){
			int x = S.nextInt();
			int y = S.nextInt();
			
			if(x>arr.size()||y>arr.get(x-1).size()){
				System.out.println("ERROR!");
			}
			else{
				System.out.println(arr.get(x-1).get(y-1));
			}
		}	
	}
}
