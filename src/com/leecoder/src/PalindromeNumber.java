package com.leecoder.src;

public class PalindromeNumber {

	/**
	 * �жϴ���������ǲ��ǻ��������������ǻ�������
	 * @param x	�������
	 * @return	�жϽ��
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
