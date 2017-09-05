package Insertion_Sort_Part2;

/*Problem
 * 
 * Similar to the previous Insertion Sort problem,
 * the program needs to work through all of the items
 * in order and if the number is not in the right place,
 * utilize the previous solution (Insertion Sort Part 1)
 * to work backwards from that particular number to find
 * out where it belongs.
 * 
 * 
 * Solution
 * 
 * Incremented forwards through array.  When a number was
 * out of place, I worked backwards to find it's place.
 * 
*/



import java.util.*;

public class Solution {
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
    	for(int n: ar){
    		System.out.print(n+" ");
    	}
        System.out.println("");
    }
    
    public static void insertionSortPart2(int[] ar){       
        for(int i=1; i<ar.length; i++){
        	int key = ar[i];
        	if(key<ar[i-1]){
        		for(int j=i; j>-1; j--){
            		/*cannot use other if statements when i=0*/
            		if(j==0){
            			ar[j] = key;
            			
            			break;
            		}
            		/*Insert item*/
            		if(key>ar[j-1]){
            			ar[j] = key;
            			
            			break;
            		}
            		/*Shift array*/
            		else{
            			ar[j] = ar[j-1];
            			
            		}
            	}
        	}
        	printArray(ar);
        }
        
    }  
}
