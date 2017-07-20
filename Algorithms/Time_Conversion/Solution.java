package Time_Conversion;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String[] T2 = time.split(":");
        
       
        /*determine if hour needs to be changed
         *if so, then change it*/
        if(T2[2].substring(2,4).equals("PM")){
        	if(T2[0].equals("12")){       		
        	}
        	else{
        		int hour = Integer.parseInt(T2[0]);
	        	hour += 12;
	        	T2[0] = Integer.toString(hour);
        	}
        }
        
        if(T2[2].substring(2,4).equals("AM")){
        	if(T2[0].equals("12")){       		
	        	T2[0] = "00";
        	}
        }
        
        /*get rid of AM/PM*/
        T2[2] = T2[2].substring(0,2);
        System.out.println(T2[0] + ":" + T2[1] + ":" + T2[2]);
    }
}
