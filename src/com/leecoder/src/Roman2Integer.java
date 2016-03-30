package com.leecoder.src;

import java.util.HashMap;

public class Roman2Integer {
	
	
	
//	  	【罗马数字】
//
//		1~9: {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
//
//		10~90: {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
//
//		100~900: {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
//	
//		1000~3000: {"M", "MM", "MMM"}.
	 
	/**
	 * 将罗马数字转换为阿拉伯数字
	 * @param s
	 * @return
	 */
    public static int romanToInt(String s) {
    	
    	int result = 0;
    	HashMap<String, Integer> map = new HashMap<String, Integer>();
    	
    	map.put("I", 1);
    	map.put("V", 5);
    	map.put("X", 10);
    	map.put("L", 50);
    	map.put("C", 100);
    	map.put("D", 500);
    	map.put("M", 1000);
    
    	for(int i=0;i<s.length();i++){
    		result += map.get(s.substring(i,i+1));
    		if (i>0&&map.get(s.substring(i-1,i))<map.get(s.substring(i,i+1))) {
    			result -= 2*map.get(s.substring(i-1,i));
			}
    	}
		return result;
        
    }
}
