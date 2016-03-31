package com.leecoder.src;

public class PalindromeNumber {

	/**
	 * 判断传入的整数是不是回文数（负数不是回文数）
	 * @param x	传入参数
	 * @return	判断结果
	 */
    public static boolean isPalindrome(int x) {
    	
    	boolean bPalindrome = false;
    	int xReverse = 0;
    	int xTemp = x;
    	if (x<0) {
			return bPalindrome;
		}
    	while (x>0) {
    		xReverse = xReverse*10 + x%10;
    		x /= 10;
			
		}
    	if (xReverse==xTemp) {
			bPalindrome = true;
		}
		return bPalindrome;
        
    }
    
}
