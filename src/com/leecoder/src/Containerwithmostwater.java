package com.leecoder.src;

public class Containerwithmostwater {
	
	/**
	 * 这道题目用O(N*N)的时间复杂度算法会超时
	 * @param height
	 * @return
	 */
    public static int maxArea(int[] height) {
    	
    	int MaxArea = 0;
    	int temparea = 0;
    	for(int i=0;i<height.length-1;i++){
    		for(int j = i+1;j<height.length;j++){
    			temparea = (j-i)*Math.min(height[i], height[j]);
    			if (MaxArea<temparea) {
					MaxArea = temparea;
				}
    		}
    	} 	
		return MaxArea;
    }

    /**
     * 网上的代码
     * 解题思路：用两个指针从两端开始向中间靠拢，如果左端线段短于右端，那么左端右移，反之右端左移，知道左右两端移到中间重合，记录这个过程中每一次组成木桶的容积，返回其中最大的。
     * 当左端线段L小于右端线段R时，我们把L右移，这时舍弃的是L与右端其他线段（R-1, R-2, ...）组成的木桶，这些木桶是没必要判断的，因为这些木桶的容积肯定都没有L和R组成的木桶容积大。
     * @param height
     * @return
     */
    public static int maxArea2(int[] height) {
    	
        if (height.length < 2) return 0;  
        int ans = 0;  
        int l = 0;  
        int r = height.length - 1;  
        while (l < r) {  
            int v = (r - l) * Math.min(height[l], height[r]);  
            if (v > ans) ans = v;  
            if (height[l] < height[r]) l++;  
            else r--;  
        }  
        return ans;
    }
    
}
