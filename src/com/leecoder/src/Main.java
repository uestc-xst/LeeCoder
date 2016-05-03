package com.leecoder.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.net.ssl.SSLContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int[] nums = new int[]{0,4,3,0};
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
		
		boolean bpal = PalindromeNumber.isPalindrome(12321);
		System.out.println(bpal);
		
		String[] egStrings = new String[]{"a","","ab"};
		String longpre = LongestCommonPrefix.longestCommonPrefix(egStrings);
		System.out.println(longpre);*/
		
/*		int[] S = {-1,0,1,2,-1,-4};
		List<List<Integer>> getlist = ThreeSum.threeSum2(S);
//		Arrays.sort(S);
//		System.out.println(Arrays.toString(S));
		int i=0;
		i++;
		
//		int[] threes = {0,1,1,1};
		int[] threes = {1,2,-1,-4};
		int gettarget = ThreeSumClosest.threeSumClosest(threes, 1);
		System.out.println(gettarget);
		*/
		
/*		String arrtet = "24";
		List<String> conbis = LetterCombinations_PhoneNumber.letterCombinations(arrtet);*/

/*		ListNode nodes = new ListNode(1);
		ListNode resultnode = RemoveNthNodeFromEndofList.removeNthFromEnd(nodes, 1);*/
		
/*		ListNode[] nodes = new ListNode[5];
		for(int i=0;i<5;i++){
			nodes[i] = new ListNode(i+1);
		}
		for(int i=0;i<4;i++){
			nodes[i].next = nodes[i+1];
		}
		ListNode resultnode = RemoveNthNodeFromEndofList.removeNthFromEnd(nodes[0], 2);
		System.out.println("hello");*/

/*		boolean b = ValidParentheses.isValid("([])");
		System.out.println(b);
		
		ListNode l1 = null,l2 = null;
		ListNode resultnodes = null;
		l1 = new ListNode(1);
		//l1.next = new ListNode(3);
		l2 = new ListNode(1);
		//l2.next = new ListNode(7);
		resultnodes = MergeTwoSortedLists.mergeTwoLists(l1, l2);
		System.out.println("hello");*/
		//int[] nums = {0,0,0,0};
		//int[] nums = {-3,-2,-1,0,0,1,2,3};
/*		int[] nums = {-1,-5,-5,-3,2,5,0,4};
		List<List<Integer>> testlist = FourSum.fourSum(nums, 0);
		System.out.println("hello");*/

	
/*		String ss = "xst";
		int len = ss.length();
		StringBuilder sBuilder = new StringBuilder(ss);
		for(int i=0;i<=len;i++){
			sBuilder.insert(len-i, "a");			
		}
		System.out.println(sBuilder.toString());
		List<String> aList = GenerateParentheses.generateParenthesis(3);
		System.out.println("");*/
		
/*		ListNode[] nodes = new ListNode[4];
		nodes[0] = new ListNode(1);
		nodes[1] = new ListNode(2);
		nodes[2] = new ListNode(3);
		nodes[3] = new ListNode(4);
		nodes[0].next = nodes[1];
		nodes[1].next = nodes[2];
		nodes[2].next = nodes[3];
		ListNode head = SwapNodesinPairs.swapPairs(nodes[0]);
		System.out.println("hello");*/
		
		
		int[] sum = {1,2};
		int len = RmDuplicatesfromSortArr.removeDuplicates(sum);
		System.out.println(len);
	}

}





















