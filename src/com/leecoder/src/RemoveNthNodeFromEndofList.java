package com.leecoder.src;

public class RemoveNthNodeFromEndofList {
	
	/**
	 * Remove Nth Node From End of List
	 * Given linked list: 1->2->3->4->5, and n = 2.
	 * After removing the second node from the end, the linked list becomes 1->2->3->5.
	 * @param head
	 * @param n
	 * @return
	 */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	
    	if (head==null) {
			return null;
		}
    	int listlen = 0;
    	int index = 0;
    	ListNode headtemp = head;
    	ListNode curNode = head;
    	while(headtemp!=null){
    		headtemp = headtemp.next;
    		listlen++;
    	}
    	
    	if (n<listlen) {
	    	index = listlen - n-1;		//从0开始第index个节点后面的节点需要移除
	    	//1->2->3->4->5, and n = 2.
	    	for(int i = 0;i<index;i++){
	    		curNode = curNode.next;
	    	}
	    	curNode.next = curNode.next.next;			
		}
    	if (n==listlen) {
			curNode = curNode.next;
			return curNode;
		}
		return head;
        
    }

}
