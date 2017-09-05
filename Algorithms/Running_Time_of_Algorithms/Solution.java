package Running_Time_of_Algorithms;

/* Problem
 * 
 * Output the number of shifts needed using insertion sort
 * 
 * 
 * Solution
 * 
 * 1)  Copied and pasted the insertion sort code from previous problem
 * 2)  Delete printArray method
 * 3)  Inside while loop inside insertionSort method, increment a count variable
 * 
*/





import java.util.Scanner;

public class Solution {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
    
    public static void insertionSort(int[] A){
    	int count = 0;
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > value){
            	count++;
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }

        System.out.println(count);
    }
}
