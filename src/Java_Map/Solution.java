package Java_Map;

import java.util.Scanner;
import java.util.HashMap;

class Solution{
	public static void main(String []argh){
		//initialize hashmap
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		
		for(int i=0;i<n;i++){
			String name=in.nextLine();		
			int phone=in.nextInt();		
			m.put(name,  phone);
			in.nextLine();
		}
		
		//get inquiries
		while(in.hasNext()){
			//find name to search for
			String s=in.nextLine();
			
			if(m.get(s) != null){
				System.out.println(s + "=" + m.get(s));
			}
			else{
				System.out.println("Not found");
			}
		}
	}
}
