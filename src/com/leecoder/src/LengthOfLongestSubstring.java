package com.leecoder.src;

import java.util.HashMap;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import com.sun.xml.internal.ws.org.objectweb.asm.Label;


public class LengthOfLongestSubstring {
	
	
    /**
     * 计算单个字符串s中不重复的最长子串，时间复杂度O(N*N)
     * @param s
     * @return	最长子串长度
     */
    public static int lengthOfLongestSubstring(String s) {
    
    	int max = 0;
    	String substr = null;
    	
    	if (s==null) {
			return 0;
		}
    	if (s.length()<=1) {
			return s.length();
		}else{
			for(int i=0;i<s.length()-1;i++){
				for(int j=i+1;j<s.length();j++){
					substr = s.substring(i,j);
					if (substr.contains(s.substring(j,j+1))) {
						if (substr.length()>max) {
							max = substr.length();
						}
						break;
					}
					if (j==s.length()-1) {
						if (!substr.contains(s.substring(s.length()-1,s.length()))) {
							substr = substr+s.substring(s.length()-1,s.length());
						}
						if (substr.length()>max) {
							max = substr.length();
						}						
					}
				}

			}	
		}
		return max;
        
    }
    
    /**
     * 计算单个字符串s中不重复的最长子串，时间复杂度O(N)
     * @param s
     * @return	最长子串长度
     */
    public static int lengthOfLongestSubstring2(String s) {
    	if(s==null)
    		return 0;
    	char[] arr = s.toCharArray();
    	int pre = 0;

    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    	for (int i = 0; i < arr.length; i++) {
    		if (!map.containsKey(arr[i])) {
    			map.put(arr[i], i);
    		} else {
    			pre = Math.max(pre, map.size());
    			i = map.get(arr[i]);
    			map.clear();
    		}
    	}

    	return Math.max(pre, map.size());

    }
}
