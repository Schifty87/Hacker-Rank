package Grading_Students;

import java.util.*;

public class Solution {

    static ArrayList<Integer> solve(ArrayList<Integer> grades){
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        for(int i=0; i<grades.size(); i++){
                int G = grades.get(i);
                int next = 0;
                if(G%5 != 0){
                    for(int k=1; k<5; k++){
                        if((G+k)%5==0){
                            next = G+k;
                        }
                        
                    }
                    if((next-G)<3){
                        if(next<40){
                            sorted.add(G);
                        }
                        else{
                            sorted.add(next);
                        }
                    }
                    else{
                        sorted.add(G);
                    }
                }
                else{
                    sorted.add(G);
                }
            }
          
        
        return sorted;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        ArrayList<Integer> G = new ArrayList<Integer>();
        for(int i=0; i < n; i++){
            grades[i] = in.nextInt();
            G.add(grades[i]);
        }
        ArrayList<Integer> result = solve(G);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + (i != result.size() - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
