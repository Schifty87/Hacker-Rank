package Insertion_Sort_Part1;

/*Problem
 * 
 * Essentially, work your way from the rear of the
 * array to insert an item into it.  The item to be
 * inserted is placed at the rear of the user-input array.
 * 
 * Push numbers ahead (one index) in the array, until
 * the 'number to be inserted' can be inserted
 *  
*/

/*Approach
 * 
 * The only part of this problem that needed to be completed
 * was the method that inserted the number and shifted all
 * others.
 * I used a simple 'for' loop to work from the rear to the front
 * of the array.
 * 
*/



import java.util.*;


public class Solution {
    
    
    /* Tail starts here */
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }//end main
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
    
    public static void insertIntoSorted(int[] ar){
    	int x = ar[ar.length-1];
    	
    	for(int i=ar.length-1; i>-1; i--){
    		/*cannot use other if statements when i=0*/
    		if(i==0){
    			ar[i] = x;
    			printArray(ar);
    			break;
    		}
    		/*Insert item*/
    		if(x>ar[i-1]){
    			ar[i] = x;
    			printArray(ar);
    			break;
    		}
    		/*Shift array*/
    		else{
    			ar[i] = ar[i-1];
    			printArray(ar);
    		}
    	}
    }
}
