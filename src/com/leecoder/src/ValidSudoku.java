package com.leecoder.src;

import java.util.ArrayList;

public class ValidSudoku {

	
	/**
	 * Determine if a Sudoku is valid
	 * @param board
	 * @return
	 */
    public static boolean isValidSudoku(char[][] board) {
    	
    	char[] arr_x = new char[9];
    	char[] arr_y = new char[9];
    	char[] arr_ceil = new char[9];
    	
    	for(int i=0;i<9;i++){
    		for(int j=0;j<9;j++){
    			arr_x[j] = board[i][j];
    			arr_y[j] = board[j][i];
    			arr_ceil[j] = board[(i/3)*3+j/3][(i%3)*3+j%3];
    		}
    		if (!bRepeat(arr_x)||!bRepeat(arr_y)||!bRepeat(arr_ceil)) {
				return false;
			}
    	}

		return true;
        
    }	
	
    public static boolean bRepeat(char[] arr){
    	
    	ArrayList<Character> arrayList = new ArrayList<>();
    	
    	for(int i=0;i<arr.length;i++){
    		if (arr[i]>='1'&&arr[i]<='9') {
				if (arrayList.contains(arr[i])) {
					return false;
				}
				arrayList.add(arr[i]);
			}
    	}
		return true;
    	
    }
    
}
