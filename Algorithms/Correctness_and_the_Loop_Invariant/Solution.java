package Correctness_and_the_Loop_Invariant;


/*Problem
 * 
 * Fix the error with the insertion sort method
 * 
 * 
 * Solution
 * 
 * The condition of the while loop needed to be changed.
 * The loop fails to trigger on the first iteration when
 * i=1.  It needed to be changed to while(j >= 0 && A[j] > value)
 * 
 *  
 * Issues
 * 
 * For some strange reason, my eclipse IDE output the correct
 * result without altering the code.  HackerRank thought different.
 * Worked through it step by step with pen and paper to troubleshoot.
 * 
*/




import java.io.*;
import java.util.*;

public class Solution {

    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    
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
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }

        printArray(A);
    }
}
