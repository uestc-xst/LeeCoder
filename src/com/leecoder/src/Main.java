package com.leecoder.src;

import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{0,4,3,0};
		System.out.println(nums.length);
		TwoSum solution = new TwoSum();
		int[] results = solution.twoSum(nums, 0);
		System.out.println(Arrays.toString(results));


		ListNode ll4 = new ListNode(5);
		int getvalue = AddTwoNumbers.readfromlist(ll4);
		System.out.println(getvalue);
		ListNode l1 = null;
		ListNode l1tmep = AddTwoNumbers.ConstructLink(l1, 9);
		ListNode l2 = null;
		ListNode l2tmep = AddTwoNumbers.ConstructLink(l2, 991);		

		ListNode restult = AddTwoNumbers.addTwoNumbers_xst(l1tmep,l2tmep);
		System.out.println("hello");
		
		String ss = "abcabcd";
		//System.out.println(ss.contains(ss.substring(0,1)));
		int max = LengthOfLongestSubstring.lengthOfLongestSubstring2(ss);
		System.out.println(max);
		
		
		
		
	}

}
