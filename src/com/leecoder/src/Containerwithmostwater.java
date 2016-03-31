package com.leecoder.src;

public class Containerwithmostwater {
	
	/**
	 * �����Ŀ��O(N*N)��ʱ�临�Ӷ��㷨�ᳬʱ
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
     * ���ϵĴ���
     * ����˼·��������ָ������˿�ʼ���м俿£���������߶ζ����Ҷˣ���ô������ƣ���֮�Ҷ����ƣ�֪�����������Ƶ��м��غϣ���¼���������ÿһ�����ľͰ���ݻ��������������ġ�
     * ������߶�LС���Ҷ��߶�Rʱ�����ǰ�L���ƣ���ʱ��������L���Ҷ������߶Σ�R-1, R-2, ...����ɵ�ľͰ����ЩľͰ��û��Ҫ�жϵģ���Ϊ��ЩľͰ���ݻ��϶���û��L��R��ɵ�ľͰ�ݻ���
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
