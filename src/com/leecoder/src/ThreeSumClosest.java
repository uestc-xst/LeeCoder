package com.leecoder.src;

import java.util.Arrays;

public class ThreeSumClosest {
	
	/**
	 * Find three integers in S such that the sum is closest to a given number, target.
	 * Return the sum of the three integers.
	 * @param nums
	 * @param target
	 * @return
	 */
    public static int threeSumClosest(int[] nums, int target) {
    	
    	if (nums==null||nums.length<3) {
			return 0;
		}
    	int result = 0;
    	int sum = 0;
    	int min = 0;
    	Arrays.sort(nums);
    	sum = nums[0] + nums[1] + nums[2];
    	min = Math.abs(sum-target);
    	for(int i=0;i<nums.length;i++){
    		int l = i+1;
    		int r = nums.length-1;
    		while(l<r){
    			sum = nums[i] + nums[l] + nums[r];
    			if (min>=Math.abs(sum-target)) {
					min = Math.abs(sum-target);
					result = sum;
				}
    			if (sum>target) {
					r--;
				}
    			if (sum<target) {
					l++;
				}
    			if (sum==target) {
					return target;
				}
    		}
    	}
    	
		return result;
        
    }
}
