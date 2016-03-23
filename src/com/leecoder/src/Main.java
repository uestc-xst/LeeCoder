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
		
		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(9);
		ListNode l3 = new ListNode(9);
		ListNode l4 = new ListNode(9);
		ListNode l5 = new ListNode(9);
		ListNode l6 = new ListNode(9);
		ListNode l7 = new ListNode(9);		
		ListNode l8 = new ListNode(9);
		ListNode l9 = new ListNode(9);
		ListNode l0 = new ListNode(9);		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
		l8.next = l9;
		l9.next = l0;
		System.out.println(AddTwoNumbers.readfromlist(l1));
		
		
		
	}

}
