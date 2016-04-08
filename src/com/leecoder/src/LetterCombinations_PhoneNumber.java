package com.leecoder.src;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations_PhoneNumber {
	
	
	static String[] arr_two = new String[]{"a","b","c"};
	static String[] arr_three = new String[]{"d","e","f"};
	static String[] arr_four = new String[]{"g","h","i"};
	static String[] arr_five = new String[]{"j","k","l"};
	static String[] arr_six = new String[]{"m","n","o"};
	static String[] arr_seven = new String[]{"p","q","r","s"};   	
	static String[] arr_eight = new String[]{"t","u","v"};
	static String[] arr_nine = new String[]{"w","x","y","z"};
	/**
	 * 
	 * @param digits
	 * @return
	 */
    public static List<String> letterCombinations(String digits) {
    	
    	List<String> combinationList = new ArrayList<String>();
    	StringBuilder letter = new StringBuilder();

    	
    	int len = digits.length();
    	for(int i=0;i<len;i++){
    		letter.append("a");
    	}
    	
    	String ss = digits.substring(0,1);
    	String[] chararr = new String[len];
    	String[][] selectarr = null;
    	for(int i = 0;i<len;i++){
    		chararr[i] = digits.substring(i,i+1);
    		selectarr[i] = new String[getArrays(chararr[i]).length];
    		selectarr[i] = getArrays(chararr[i]);
    	}
    	
    	ss  = ss+"";
		return combinationList;
        
    }
    
    private static String[] getArrays(String code){
    	String[] returnarr = null;
    	switch (code) {
		case "2":
			returnarr = arr_two;
			break;
		case "3":
			returnarr = arr_three;
			break;
		case "4":
			returnarr = arr_four;
			break;
		case "5":
			returnarr = arr_five;
			break;
		case "6":
			returnarr = arr_six;
			break;
		case "7":
			returnarr = arr_seven;
			break;
		case "8":
			returnarr = arr_eight;
			break;
		case "9":
			returnarr = arr_nine;
			break;
		default:
			break;
		}
    	return returnarr;
    	
    }
}
