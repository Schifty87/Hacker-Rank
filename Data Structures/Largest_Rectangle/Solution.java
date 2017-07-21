package Largest_Rectangle;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){
    	
    	Scanner s = new Scanner(System.in);
    	
        ArrayList<Integer> area = new ArrayList<Integer>();
        ArrayList<Integer> si = new ArrayList<Integer>();
        int max = 0;
        int x = s.nextInt();
        for(int i=0; i<x; i++){
        	si.add(s.nextInt());
        }
        
        for(int i=0; i<si.size(); i++){
        	int l=i, r = i;
        	int x3 = si.get(i);
        	if(i>0){
        		for(int j=i; j>=0; j--){
        			if(si.get(j)<x3){
        				break;
        			}
        			else{
        				l = j;
        			}
        		}
        	}
        	if(i<si.size()){
        		for(int j=i; j<si.size(); j++){
        			if(si.get(j)<x3){
        				break;
        			}
        			else{
        				r = j;
        			}
        		}
        	}
        	int sum = ((r+1)-l) * x3;
        	if(sum>max){
        		max = sum;
        	}      	
        }
        System.out.println(max);
    }
}
