package Birthday_Cake_Candles;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int max = 0;
        for(int i=0; i < n; i++){
            height[i] = in.nextInt();
            if(height[i]>max){
            	max = height[i];
            }
        }
        int count = 0;
        for(int i=0; i<height.length; i++){
        	if(height[i]==max){
        		count++;
        	}
        }
        System.out.println(count);
    }
}
