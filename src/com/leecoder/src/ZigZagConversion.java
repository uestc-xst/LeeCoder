package com.leecoder.src;

public class ZigZagConversion {
	
	public String convert(String s, int numRows) {
		
		char[][] array_s;
		int strlen = s.length();
		int col = strlen/(numRows*2-2);
		int res = strlen%(numRows*2-2);
		int row = 0;
		if (res==0) {
			row = col*(numRows-1);		
		}
		else {
			row = (col+1)*(numRows-1);		
		}
		
		array_s = new char[numRows][row];
		
		return s;
		

	}
}
