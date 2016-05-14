package com.leecoder.src;

import java.util.ArrayList;
import java.util.List;

public class CountandSay {

	
	/**
	 * n=1时输出字符串1；n=2时，数上次字符串中的数值个数，因为上次字符串有1个1，所以输出11；
	 * n=3时，由于上次字符是11，有2个1，所以输出21；n=4时，由于上次字符串是21，有1个2和1个1，所以输出1211。
	 * 依次类推，写个countAndSay(n)函数返回字符串
	 * @param n
	 * @return
	 */
    public static String countAndSay(int n) {
    	
    	if (n==1) {
			return "1";
		}
    	String last = countAndSay(n-1);
    	List<Character> list = new ArrayList<>();
    	for(int i=0;i<last.length();i++){
    		list.add(last.charAt(i));
    	}
    	char temp = ' ';
    	char lastchr = ' ';
    	int cnt = 0;
    	StringBuilder result = new StringBuilder();
    	for(int i=0;i<list.size();i++){
    		if (i==0) {
				cnt++;
				lastchr = list.get(0);
			}else {
				if (lastchr==list.get(i)) {
					cnt++;
				}else {
					
					result.append(cnt); 
					result.append(lastchr);
					cnt = 1;
					lastchr = list.get(i);
				}
			}
    	}
		result.append(cnt); 
		result.append(lastchr);
		
        return result.toString();
    }
}
