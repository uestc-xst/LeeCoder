package com.leecoder.src;

public class MergeTwoSortedLists {
	
	
	/**
	 * Merge two sorted linked lists and return it as a new list. T
	 * he new list should be made by splicing together the nodes of the first two lists.
	 * ���õݹ����㡣
	 * �ݹ�3���裺	1��ȷ����������
	 * 		   	2��ȷ��ÿ���ڵ�Ĳ���
	 * 			3��ǰһ�ڵ�ͺ�һ�ڵ���ν�
	 * @param l1
	 * @param l2
	 * @return
	 */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	
    	ListNode returnNode = null;
    	if (l1!=null||l2!=null) {
			if (l1!=null&&l2!=null) {
				if (l1.val>l2.val) {
					returnNode = l2;
					returnNode.next = mergeTwoLists(l1,l2.next);
				}else {
					returnNode = l1;
					returnNode.next = mergeTwoLists(l1.next,l2);
				}
			}else if (l1==null&&l2!=null) {
				return l2;
			}
			else {
				return l1;
			}
		}
    	
		return returnNode;

    }
    
    
}
