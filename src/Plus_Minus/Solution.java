package Plus_Minus;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double pos = 0;
        double neg = 0;
        double zero = 0;
        for(int i=0; i < n; i++){
            double X = in.nextDouble();
            if(X > 0){
            	pos++;
            }
            else if(X < 0){
            	neg++;
            }
            else{
            	zero++;
            }
        }
        //print positive
        System.out.println(pos/n);
        //print negative
        System.out.println(neg/n);
        //print zero
        System.out.println(zero/n);
    }
}
