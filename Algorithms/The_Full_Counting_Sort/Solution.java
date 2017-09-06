package The_Full_Counting_Sort;


/*Problem
 * 
 *You are given a list of number-string pairs.
 * Put them in order based on the number.  No sorting
 * is needed beyond that.  First come first served based
 * on the number.
 * The first half of the number-string pairs are represented
 * by '-' instead of the string.
 * 
 * 
 * Solution
 * 
 * Java cannot chain HashMaps on its own.  In order to do it, I
 * used a HashMap<Integer, ArrayList<String>>.
 * 
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//java cannot chain hashmaps, so use an arraylist as a value
		HashMap<Integer, ArrayList<String>> hmap = new HashMap<Integer, ArrayList<String>>();
		for(int i=0; i<n; i++){
			int x = s.nextInt();
			String y = s.next();
			
			/*replace string value if it is in the first
			half of the user-input*/
			if(i<n/2){
				y = "-";
			}		
			if(hmap.containsKey(x)){
				ArrayList a = hmap.get(x);
				a.add(y);
				hmap.put(x, a);
			}
			else{
				ArrayList<String> b = new ArrayList<String>();
				b.add(y);
				hmap.put(x,b);
			}
		}		
		for(int i=0; i<hmap.size(); i++){
			ArrayList x = hmap.get(i);		
			for(int j=0; j<x.size(); j++){
				System.out.print(x.get(j) + " ");
			}		
		}		
	}
}
