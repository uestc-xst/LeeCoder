package com.leecoder.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidParentheses {

	


	/**
	 * Valid Parentheses
	 * 判断括号、中括号以及大括号在字符串s中是否成对匹配出现
	 * @param s
	 * @return
	 */
	public static boolean isValid(String s) {
    	
    	Map<String, Integer> map = new HashMap<String, Integer>();
    	List<Integer> vaList = new ArrayList<>();
    	boolean bResult = false;
    	map.put("{", 1);
    	map.put("[", 2);
    	map.put("(", 3);
    	map.put(")", 4);
    	map.put("]", 5);
    	map.put("}", 6);
    	
    	int len = s.length();
    	
    	for(int i=0;i<len;i++){
    		String charcode = s.substring(i,i+1);
    		if (map.containsKey(charcode)) {	
				vaList.add(map.get(charcode));
				
			}
    	}
    	int pairsize = vaList.size();
    	if (pairsize%2!=0) {
			return false;
		}
    	else{
    		for(int i=0;i<pairsize/2;i++){
    			for(int j=vaList.size()-1;j>0;j--){
    				if ((vaList.get(j)>vaList.get(j-1))
    						&&(vaList.get(j)+vaList.get(j-1)==7)) {
						vaList.remove(j);
						vaList.remove(j-1);
						break;
					}
    			}
    		}
    	}

    	if (vaList.size()==0) {
			bResult = true;
		}
    	
		return bResult;
    }
    
}
