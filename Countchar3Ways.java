package com.java.core.again;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Countchar3Ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="AEJAL";
		Map<Character,Integer> map =new HashMap<>();
		for(char c : str.toCharArray()) {
			System.out.println(c);
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1) ;
			}else {
				map.put(c, 1);
			}

		}
		System.out.println(map);

		
		System.out.println(" 1. - - -- -- -- - - ");
		
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			System.out.println(entry); //A=2 E=1 J=1 L=1
			//System.out.println("Character : "+entry.getKey()+", Count : "+entry.getValue());		
		}
		System.out.println(" 2. - - -- -- -- - - ");
		for(Character c : map.keySet()) {
			System.out.println("Char : " +c+ ", count "+map.get(c));
		}
		System.out.println(" 3. @ - ~ ~ - -- -- -- - ~ - ");
		map.forEach((k,v) ->{
			System.out.println("Key :  "+k+ " ,  count : "+v);
		});
	}

}
