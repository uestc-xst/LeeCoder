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
		
		String arrString = "aabcde";
		char[] chars = arrString.toCharArray();
		char[][] sss = new char[2][2];
		if (sss[0][0]==0) {
			System.out.println(sss[0][0]);
		}
		System.out.println(sss[0][0]);
		
		String resString = ZigZagConversion.convert("PAYPALISHIRING", 3);
		System.out.println(resString);
		
		int xx = 1534236469;
		int resultxx = ReverseInteger.reverse(xx);
		System.out.println(resultxx);
		
		String sx = "123b2";
		StringBuffer teString = new StringBuffer(sx.substring(0,3));
		teString.append('5');
		teString.append(sx.substring(4,sx.length()));
		
//		System.out.println(teString.toString());
//		Integer value = new Integer("+0012");
		int val = String2Integer.myAtoi("-2147483649");
		System.out.println(val);
		
		String Romanstr = "DCXXI";
		int rnum = Roman2Integer.romanToInt(Romanstr);
		System.out.println(rnum);
		

		String getRomanstr = Integer2Roman.intToRoman(4);
		System.out.println(getRomanstr);
	}

}
