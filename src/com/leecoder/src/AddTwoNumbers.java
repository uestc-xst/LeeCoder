package com.leecoder.src;

public class AddTwoNumbers {
	
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode listNode;
    	if (l1==null) {
			return l2;
		}
    	else if (l2==null) {
			return l1;
		}
    	else {
			int l1IntVal = readfromlist(l1);
			int l2IntVal = readfromlist(l2);
			int sum = l1IntVal + l2IntVal;
			if (sum==0) {
				return new ListNode(0);					
			}
			listNode = ConstructLink(null, sum);
			return listNode;
		}
        
    }
    
    /**
     * 将整数构建为list链表
     * @param nodeList
     * @param sum
     * @return
     */
    public static ListNode ConstructLink(ListNode nodeList,int sum){
     	if (sum==0) {
			return  null;
		}   	
    	ListNode node = new ListNode(sum%10);
    	sum /= 10;
    	nodeList = node;
    	if (sum>=0) {
			nodeList.next = ConstructLink(nodeList.next, sum);
		}
    	return nodeList;
    }
    
    /**
     * 将l1链表转化为数字
     * @param l1
     * @return 转化结果
     */
    public  static int readfromlist(ListNode l1){
    	int result = 0;

    	if (l1==null) {
			return 0;
		}
    	result = l1.val+10*readfromlist(l1.next);
    	
    	return result;
    }
}
