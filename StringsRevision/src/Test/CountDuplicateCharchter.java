package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountDuplicateCharchter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ss = "hello world";
		char[] a = ss.toCharArray();
		int count = 0;
		Map<Character,Integer> li = new HashMap<Character,Integer>();
		
		for(int i = 0; i < a.length ; i++ ) {
			count = 1;
			for(int j = 0;j < a.length; j++) {
				if(i  != j) {
                    if(a[i] == a[j]) {
						count++;
						
					}
                    
				}
				//System.out.println(a[i] + " " +count);
				li.put(a[i], count);
			}
			 
			
		}
		
		
		
		System.out.println(li);

	}

}
