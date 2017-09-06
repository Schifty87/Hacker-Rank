package Counting_Sort_1;

/*Problem
 * 
 * Count the number of occurances of each number
 * The first number of output equals the number of occurances of 0
 * The second number of output equals the number of occurances of 1
 * the nth number of .......
 * 
 * Solution
 * 
 * I used a hashmap to keep track of all of the numbers.
 * If an number is already in the hashmap, I just updated 
 * the value for the key.
 * 
*/


import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {     
    	HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	//keep track of maximum number - needed for output
    	int max = 0;
    	for(int i=0; i<n; i++){
    		int num = s.nextInt();
    		if(num > max){
    			max = num;
    		}
    		if(hmap.containsKey(num)){
    			hmap.put(num, hmap.get(num) + 1);
    		}
    		else{
    			hmap.put(num, 1);
    		}
    	}	
    	for(int i=0; i<=max; i++){		
    		if(hmap.get(i) == null){
    			System.out.print(0 + " ");
    		}
    		else{
    			System.out.print(hmap.get(i) + " ");
    		}
    	}    	
    }
}
