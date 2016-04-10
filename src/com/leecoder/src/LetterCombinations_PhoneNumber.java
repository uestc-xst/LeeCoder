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
	 * ��ȡ��ĸ���
	 * @param digits
	 * @return
	 */
    public static List<String> letterCombinations(String digits) {
    	

    	List<String> combinationList = new ArrayList<String>();
    	StringBuilder letter = new StringBuilder();
    	
    	if (digits==null||digits.length()==0) {
			return combinationList;
		}
    	
    	int len = digits.length();
    	String[][] arrList = new String[len][];
    	int[] index = new int[len]; 
    	int totalnum = 1;
    	
    	for(int i=0;i<len;i++){
    		String charcode = digits.substring(i,i+1);
    		if (charcode.compareTo("2")<0||charcode.compareTo("9")>0) {
				return null;
			}
    		arrList[i] = getArrays(digits.substring(i,i+1));
    		index[i] = arrList[i].length;
    		totalnum *= index[i];   				//������ϳ���
    		letter.append(arrList[i][0]);			//��ʼ����һ�����
    	}

    	
    	combinationList.add(letter.toString());
    	int[] replacearr = new int[len];

    	for(int i=0;i<totalnum-1;i++){			//�����滻��ĸ����ĸ�����е�λ�ã������ڼ���ʮ��������ֻ��ÿһλ�Ľ����Ƕ�Ӧ����ĳ���
    		replacearr[len-1]++; 
    		if (replacearr[len-1]>=index[len-1]) {
        		for(int j=len-1;j>0;j--){
        			if (replacearr[j]>=index[j]) {
        				replacearr[j-1]++;
        				replacearr[j] %= index[j];

    				}       			
        		}				
			}
        	for(int k=0;k<len;k++){
    			letter.replace(k, k+1, arrList[k][replacearr[k]]);			
        	}
        	combinationList.add(letter.toString());
    	}


		return combinationList;
        
    }
    
    
    
    /**
     * �����ַ���ȡ��Ӧ����ĸ����
     * @param code
     * @return
     */
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
