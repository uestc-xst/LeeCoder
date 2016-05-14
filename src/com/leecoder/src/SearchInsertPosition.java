package com.leecoder.src;

public class SearchInsertPosition {

	/**
	 * return the index if the target is found. If not, return the index where it would be if it were inserted in order.
	 * 题解思路：二分查找+递归
	 * @param nums
	 * @param target
	 * @return
	 */
    public static int searchInsert(int[] nums, int target) {
    	
    	int result = 0;
    	if (nums==null||nums.length<1) {
			return result;
		}
    	if (target>nums[nums.length-1]) {
			return nums.length;
		}else if (target<nums[0]) {
			return result;
		}else {
			return recursionSearch(nums,target,0,nums.length-1);
		}
    }
    
    public static int recursionSearch(int[] nums,int target,int left,int right){
    	
    	int mid = (right+left)/2;

    	if (nums[mid]==target) {
			return mid;
		}
    	if ((right-left)==1) {
			if (target<nums[left]) {
				if (left==0) {
					return 0;
				}else{
					return left-1;
				}
			}else if (target>nums[right]) {
				return right+1;
			}else {
				return left+1;
			}
		}else if (nums[mid]>target) {
			return recursionSearch(nums, target, left, mid);
		}else {
			return recursionSearch(nums, target, mid, right);
		}
    }
}
