package com.leecoder.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	
	/**
	 * 4Sum
	 * @param nums
	 * @param target
	 * @return
	 */
    public static List<List<Integer>> fourSum(int[] nums, int target) {
    		
    	List<List<Integer>> returnlist = new ArrayList<List<Integer>>();
    	
    	Arrays.sort(nums);		//对输入数组排序
    			
    	for (int i = 0; i < nums.length-3; i++) {
			
			while(i>0&&nums[i]==nums[i-1]){
    			i++;
    		}
    		int firtarget = target - nums[i];
			for(int j=i+1;j<nums.length-2;j++){
				while(j>(i+1)&&j<(nums.length-2)&&nums[j]==nums[j-1]){
					j++;
				}
				int sectarget = firtarget - nums[j];
				int start = j+1;
				int end = nums.length-1;
				while (start<end) {
					if (nums[start]+nums[end]==sectarget) {
						List<Integer> resulist = new ArrayList<>();
						resulist.add(nums[i]);
						resulist.add(nums[j]);
						resulist.add(nums[start]);
						resulist.add(nums[end]);
						returnlist.add(resulist);
						start++;
						end--;
						while(start<=(nums.length-1)&&nums[start-1]==nums[start]){
							start++;
						}
						while(end>=(j+1)&&nums[end]==nums[end+1]){
							end--;
						}
						
					}else if (nums[start]+nums[end]>sectarget) {
						end--;
					}else if (nums[start]+nums[end]<sectarget) {
						start++;
					}	
				}
			}
		}
    	
    	
		return returnlist; 
        
    }

}
