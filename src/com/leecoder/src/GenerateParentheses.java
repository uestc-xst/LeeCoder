package com.leecoder.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenerateParentheses {

	
	
	
	
    public static List<String> generateParenthesis(int n) {
    	ArrayList<String> aList = new ArrayList<>();	
    	if (n==1) {
    		aList.add("()");
			return aList;
		}else {
			List<String> listtemp = CreateParenthesis(n-1);
			int jlen = listtemp.size();
			for(int j=0;j<jlen;j++){
				
				int len = listtemp.get(j).length();
				for(int i=0;i<=len;i++){
					StringBuilder sb = new StringBuilder(listtemp.get(j));
					sb.insert(len-i, "()");	
					if (!aList.contains(sb.toString())) {
						aList.add(sb.toString());
					}
				}				
			}

		}
		return aList;
    }
    
    public static List<String> CreateParenthesis(int n){
    	ArrayList<String> aList = new ArrayList<>();	
    	if (n==1) {
    		aList.add("()");
			return aList;
		}else {
			List<String> listtemp = CreateParenthesis(n-1);
			int jlen = listtemp.size();
			for(int j=0;j<jlen;j++){
				
				int len = listtemp.get(j).length();
				for(int i=0;i<=len;i++){
					StringBuilder sb = new StringBuilder(listtemp.get(j));
					sb.insert(len-i, "()");	
					if (!aList.contains(sb.toString())) {
						aList.add(sb.toString());
					}
				}				
			}

		}
		return aList;
    }
    
    
}
