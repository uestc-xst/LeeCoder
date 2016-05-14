package com.leecoder.src;

public class RemoveElement {

	/**
	 * Given an array and a value, remove all instances of that value in place and return the new length.
	 * @param nums
	 * @param val
	 * @return
	 */
    public static int removeElement(int[] nums, int val) {
    	
    	if (nums==null||nums.length==0) {
			return 0; 
		}
    	if (nums.length==1) {
    		if (nums[0]==val) {
				return 0;
			}else{
				return 1;
			}
		}
    	int pleft = 0,pright = nums.length-1;
    	while(pleft<pright){
    		if (nums[pleft]==val&&nums[pright]!=val) {
				int temp = nums[pright];
				nums[pright] = nums[pleft];
				nums[pleft] = temp;
				pleft++;
				pright--;
			}else if (nums[pleft]!=val&&nums[pright]!=val) {
				pleft++;
			}else {
				pright--;
			}
    	}
    	if (nums[pright]==val) {
			return pright;
		}
    	else{
    		return pright+1;
    	}
        
    }
}
