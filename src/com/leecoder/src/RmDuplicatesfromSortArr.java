package com.leecoder.src;



public class RmDuplicatesfromSortArr {

	/**
	 * Remove Duplicates from Sorted Array
	 * Given a sorted array, remove the duplicates in place such that each element appear only once 
	 * and return the new length.
	 * @param nums
	 * @return
	 */
    public static int removeDuplicates(int[] nums) {
		
    	if (nums==null||nums.length==0) {
			return 0;
		}

    	int cnt = 1;
    	int temp = nums[0];
    	for(int i=1;i<nums.length;i++){
    		if (nums[i]!=temp) {
				cnt++;
				temp = nums[i];
				nums[cnt-1] = nums[i];
    		}
    	}
    	return cnt;
        
    }
    
    
}
