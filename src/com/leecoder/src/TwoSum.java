package com.leecoder.src;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public int[] twoSum(int[] nums, int target) {
    	
    	int[] index = new int[2];
    	if (nums.length<2) {
			return index;
		}
    	else {
			for (int i = 0; i < nums.length-1; i++) {
				for (int j = i+1; j < nums.length; j++) {
					if ((nums[i]+nums[j])==target) {
						index[0] = i;
						index[1] = j;
						return index;
					}
				}
			}
		}
    	
    	return index;
        
    }
    
    public int[] towSumMap(int[] nums,int target){
    	
    	int[] index = new int[2];
    	Map<Integer, Integer> map = null;
    	map = new HashMap<>();
    	int arrlen = nums.length;
    	if (nums.length<2) {
			return index;
		}
    	else{
    		//1.建立map
    		for (int i = 0; i < arrlen; i++) {
				map.put(nums[i], i);	
			}   				
    	}
    	//2.遍历查找
    	for (int i = 0; i < arrlen-1; i++) {
			int sub = target - nums[i];
			int temp = map.get(nums[i]);
			map.remove(nums[i]);
			if (map.containsKey(sub)) {
				index[0] = i;
				index[1] = map.get(sub);
				return index;
			}
			map.put(nums[i], temp);
		}
    	return index;
    }
}
