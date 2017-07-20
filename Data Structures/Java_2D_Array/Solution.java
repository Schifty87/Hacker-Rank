package Java_2D_Array;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        //create arraylist to plug all sums of hourglass into
        ArrayList <Integer> sum = new ArrayList <Integer>();
        
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){           		
            	sum.add(arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);       	
            }
        }
        //print the largest value in the arraylist
        System.out.println(Collections.max(sum));
    }
}
