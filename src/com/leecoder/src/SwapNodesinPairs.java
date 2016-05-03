package com.leecoder.src;

public class SwapNodesinPairs {
	
	/**
	 * Swap Nodes in Pairs 
	 * Given 1->2->3->4, you should return the list as 2->1->4->3.
	 * @param head
	 * @return
	 */
    public static ListNode swapPairs(ListNode head) {
    	
    	if(head==null||head.next==null){		
    		return head;
    	}
    	ListNode tempnode = head;
    	ListNode nextnode = tempnode.next;
    	ListNode prenode = null;
    	ListNode returnnode = head;
    	while(tempnode!=null&&nextnode!=null){
	    	//���������ڵ�
	    	if (prenode==null) {		//�׽ڵ�
				tempnode.next = nextnode.next;
				nextnode.next = tempnode;
				returnnode = nextnode;
				prenode = tempnode;
				tempnode = tempnode.next;
				if (tempnode==null||tempnode.next==null) {
					return returnnode;
				}
				nextnode = tempnode.next;
			}else {				//�����м������ڵ�����
				prenode.next = tempnode.next;
				tempnode.next = nextnode.next;
				nextnode.next = tempnode;
				prenode = tempnode;
				tempnode = tempnode.next;
				if (tempnode==null) {
					return returnnode;
				}
				nextnode = tempnode.next;
			}    		
    	}
		return returnnode;
    }
}
