package com.leecoder.src;

public class SearchforaRange {

	/**
	 * Given a sorted array of integers, find the starting and ending position of a given target value.
	 * @param nums
	 * @param target
	 * @return
	 */
    public static int[] searchRange(int[] nums, int target) {
    	
    	int[] resultarr = {-1,-1};
    	if (nums==null||nums.length<1) {
			return resultarr;
		}
    	if (nums.length==1) {
			if (nums[0]==target) {
				return new int[]{0,0};
			}else{
				return resultarr;
			}
		}
    	
    	if (nums[0]>target||nums[nums.length-1]<target) {
			return resultarr;
		}
    	int start =0;
    	int end = nums.length - 1;
    	resultarr = recursionSearch(nums,target,start,end);
		return resultarr;
        
    }
    
    public static int[] recursionSearch(int[] arr,int target,int start,int end){
    	int[] resultarr = {-1,-1};
    	int mid = (end-start)/2+start;
    	if ((end-start)==1) {
			if (arr[end]==target&&arr[start]==target) {
				resultarr[0] = start;
				resultarr[1] = end;
				return resultarr;
			}else if (arr[end]!=target&&arr[start]==target) {
				resultarr[0] = start;
				resultarr[1] = start;	
				return resultarr;
			}else if (arr[end]==target&&arr[start]!=target) {
				resultarr[0] = end;
				resultarr[1] = end;	
				return resultarr;
			}else {
				return resultarr;
			}
		}
    	if (arr[mid]==target) {
    		int ltemp = mid;
    		int rtemp = mid;
			while(ltemp>=0&&arr[ltemp]==target){
				resultarr[0] = ltemp;
				ltemp--;
			}
			while(rtemp<=end&&arr[rtemp]==target){
				resultarr[1] = rtemp;
				rtemp++;
			}
		}else if (arr[mid]>target) {
			resultarr = recursionSearch(arr,target,start,mid);
		}else{
			resultarr = recursionSearch(arr,target,mid,end);
		}
    	
    	return resultarr;
    	
    }
}
