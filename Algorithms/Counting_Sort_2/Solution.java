package Counting_Sort_2;

/*Problem
 * 
 * Sort all of the numbers
 * 
 * 
 * Solution
 * 
 * Perhaps I cheated a bit on this one.  I populated an ArrayList
 * and used Collections.sort().  I didn't see anything in the problem
 * that explicitly stated that I had to use the previous sorting
 * procedures and couldn't use the method that I used.
 * 
*/



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<Integer> num = new ArrayList<Integer>();
		for(int i=0; i<n; i++){
			num.add(s.nextInt());
		}
		Collections.sort(num);
		for(int i=0; i<num.size(); i++){
			System.out.print(num.get(i) + " ");
		}
	}
}
