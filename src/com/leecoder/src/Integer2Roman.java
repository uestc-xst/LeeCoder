package com.leecoder.src;

public class Integer2Roman {
	
	
//  	【罗马数字】
//
//	1~9: {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
//
//	10~90: {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
//
//	100~900: {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
//
//	1000~3000: {"M", "MM", "MMM"}.
	
	/**
	 * 阿拉伯数字转换为罗马数字
	 * @param num
	 * @return
	 */
    public static String intToRoman(int num) {
    	
  
    	StringBuilder RomanStr = new StringBuilder("");
    	if (num<1||num>3999) {
			return RomanStr.toString();
		}
    	String[] RomanCharsOne = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    	String[] RomanCharsTwo = new String[]{"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    	String[] RomanCharsThree = new String[]{"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    	String[] RomanCharsFour = new String[]{"M", "MM", "MMM"};
    	    	
    	if (num/1000>0) {
    		RomanStr.append(RomanCharsFour[num/1000-1]);
    		num  = num%1000;
    	}
    	if (num/100>0) {
    		RomanStr.append(RomanCharsThree[num/100-1]);
    		num  = num%100;
    	}
    	if (num/10>0) {
    		RomanStr.append(RomanCharsTwo[num/10-1]);
    		num  = num%10;
    	}
    	if (num>0) {
    		RomanStr.append(RomanCharsOne[num-1]);
    	}

		return RomanStr.toString();
        
    }	

}
