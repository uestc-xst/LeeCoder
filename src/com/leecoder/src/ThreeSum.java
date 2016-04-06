package com.leecoder.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ThreeSum {
	

	/**
	 * 从网上找的算法，时间复杂度为O(N*N)
	 * @param num
	 * @return
	 */
	public static List<List<Integer>> threeSum2(int[] num) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		 
		if (num.length < 3)
			return result;
	 
		// sort array
		Arrays.sort(num);
	 
		for (int i = 0; i < num.length - 2; i++) {
			// //avoid duplicate solutions
			if (i == 0 || num[i] > num[i - 1]) {
	 
				int negate = -num[i];
	 
				int start = i + 1;
				int end = num.length - 1;
	 
				while (start < end) {
					//case 1
					if (num[start] + num[end] == negate) {
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[start]);
						temp.add(num[end]);
	 
						result.add(temp);
						start++;
						end--;
						//avoid duplicate solutions
						while (start < end && num[end] == num[end + 1])
							end--;
	 
						while (start < end && num[start] == num[start - 1])
							start++;
					//case 2
					} else if (num[start] + num[end] < negate) {
						start++;
					//case 3
					} else {
						end--;
					}
				}
	 
			}
		}
	 
		return result;
	}


	/**
	 * 算法超时
	 * @param nums
	 * @return
	 */
    public static List<List<Integer>> threeSum(int[] nums) {
    	
    	int a=0,b=0,c=0;
    	boolean bExist = false;
    	List<List<Integer>> resultlist = new ArrayList<List<Integer>>();
    	List<Integer> templist = null;
    	if (nums.length<3) {
			return null;
		}
    	for(int i=0;i<nums.length-2;i++){
			a = nums[i];
    		for(int j=i+1;j<nums.length-1;j++){
    			b = nums[j];
    			for(int k=j+1;k<nums.length;k++){
    				c = nums[k];
    				int sum = a+b+c;
    				if (sum==0) {
						if (a==0&&b==0&&c==0) {
							continue;
						}
						int[] arrs = new int[]{a,b,c};
						int[] getarr = BubbleSort(arrs);
						//templist.clear();
						templist = new ArrayList<Integer>();
						templist.add(getarr[0]);
						templist.add(getarr[1]);
						templist.add(getarr[2]);	
						for(int cnt=0;cnt<resultlist.size();cnt++){
							ArrayList<Integer> buflist = (ArrayList<Integer>) resultlist.get(cnt);
							if (buflist.get(0)==templist.get(0)&&buflist.get(1)==templist.get(1)&&buflist.get(2)==templist.get(2)) {
								bExist = true;							
							}
						}
						if (!bExist) {
							resultlist.add(templist);
						}
						else{
							bExist = false;
						}					
					}	
    			}
    		}
    	}
    	
		return resultlist;
        
    }

    /**
     * 冒泡排序，从小到大排列,功能和Arrays.sort相同
     * @param arrs
     * @return
     */
    public static int[] BubbleSort(int[] arrs){
    	
		for(int m=0;m<arrs.length-1;m++){
			for(int n=m+1;n<arrs.length;n++){					
				if (arrs[m]>arrs[n]) {
					int temp = arrs[m];
					arrs[m] = arrs[n];
					arrs[n] = temp;
				}
			}
		}
		return arrs;
    }
    
}
