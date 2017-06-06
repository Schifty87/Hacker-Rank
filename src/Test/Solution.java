package Test;



import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) {
    	  //Input
    	Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        
        if(n.isProbablePrime(50)){
        	System.out.println("prime");
        }
        else{
        	System.out.println("not prime");
        }
        
        
        
       
    }
}
