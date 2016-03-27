package com.leecoder.src;

public class ZigZagConversion {
	
	public static String convert(String s, int numRows) {
		if (s==""||numRows==1) {
			return s;
		}
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
		char[] chararr_s = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			int t1 = i%(2*numRows-2);
			int t2 = i/(2*numRows-2);
			int row_s = t1<=(numRows-1)?t1:(2*numRows-2-t1);
			int temp_y = t1<=(numRows-1)?0:(t1-(numRows-1));
			int col_s = t2*(numRows-1)+temp_y;
			array_s[row_s][col_s] = chararr_s[i];
		}
		StringBuffer strbuff = new StringBuffer();
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < row; j++) {
				if (array_s[i][j]!=0) {
					strbuff.append(array_s[i][j]);
				}
				
			}
		}
		return strbuff.toString();
		

	}
}
