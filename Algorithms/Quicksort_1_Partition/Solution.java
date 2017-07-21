package Quicksort_1_Partition;

import java.util.*;
public class Solution {
       
          static void partition(int[] ar) {
        	  int pivot = 0;
        	  for(int i=1; i<ar.length; i++){
        		  
        		  if(ar[i] < ar[pivot]){
        			  //place number into temporary variable
        			  int temp = ar[i];
        			  for(int j=i; j>pivot; j--){
        				  ar[j] = ar[j-1];
        			  }
        			  ar[pivot] = temp;
        			  pivot++;      			  
        		  }
        	  }
        	  printArray(ar);
          }   
 
          static void printArray(int[] ar) {
        	  for(int n: ar){
        		  System.out.print(n+" ");
        	  }
        	  System.out.println("");
          }
       
          public static void main(String[] args) {
        	  Scanner in = new Scanner(System.in);
        	  int n = in.nextInt();
        	  int[] ar = new int[n];
        	  for(int i=0;i<n;i++){
        		  ar[i]=in.nextInt(); 
        	  }
        	  partition(ar);
          }    
}
