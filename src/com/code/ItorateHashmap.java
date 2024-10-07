package com.code;

import java.util.HashMap;
import java.util.Map;

public class ItorateHashmap {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(101, "Sushant");
		map.put(102, "Jay");
		map.put(103, "Amit");
		map.put(104, "Viraj");
		map.put(105, "Tom");
		
		for(Integer a:map.keySet()) {
			System.out.println(a+"-"+map.get(a));
		}
	}

}
