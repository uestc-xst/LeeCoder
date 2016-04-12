package com.leecoder.src;

public class MergeTwoSortedLists {
	
	
	/**
	 * Merge two sorted linked lists and return it as a new list. T
	 * he new list should be made by splicing together the nodes of the first two lists.
	 * 采用递归运算。
	 * 递归3步骤：	1、确定结束条件
	 * 		   	2、确定每个节点的操作
	 * 			3、前一节点和后一节点的衔接
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
