package com.leecoder.src;

import java.util.ArrayList;

public class ReverseInteger {
	
    public static int reverse(int x) {
    	
    	int result = 0;
    	if (x==0) {
			return x;
		}
    	int flag = x/Math.abs(x);
    	ArrayList<Integer> numList = new ArrayList<Integer>();
    	x = Math.abs(x);
    	while (x!=0) {
			int num = x%10;
			numList.add(num);
			x /= 10; 
			
		}
    	int len = numList.size();
    	for (int i = 0; i < len; i++) {
    		//result += numList.get(i)*Math.pow(10, len-i-1);
    		
    		long temp = result + (long)(numList.get(i)*Math.pow(10, len-i-1));
    		if(temp>Integer.MAX_VALUE||temp<Integer.MIN_VALUE){
    			return 0;
    		}else {
				result = (int) temp;		
			}
    		
		}
    	result *= flag;
    	if (result>Integer.MAX_VALUE||result<Integer.MIN_VALUE) {
			result = 0;
		}
		return result;
        
    }
}
