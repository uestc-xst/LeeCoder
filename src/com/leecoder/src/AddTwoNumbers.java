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
     * ����������Ϊlist����
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
     * ��l1����ת��Ϊ����
     * @param l1
     * @return ת�����
     */
    public  static int readfromlist(ListNode l1){
    	int result = 0;

    	if (l1==null) {
			return 0;
		}
    	result = l1.val+10*readfromlist(l1.next);
    	
    	return result;
    }
    

    /**
     * ����������ϲ�����һ������
     * @param l1	
     * @param l2
     * @return	�ϳɺ������
     */
    public static ListNode addTwoNumbers_xst(ListNode l1, ListNode l2) {
    	
    	
    	ListNode resultList = null;
    	int Carry = 0;	
    	resultList = l1==null?l2:(l2==null?l1:resultList);		//�ж���һ��null������ͷ�����һ��
    	if (resultList!=null) {
			return resultList;
		}
    	
    	ListNode nodetemp = null;
    	while (l1!=null||l2!=null) {	//ѭ�������б�֪�����������������			
    		int sum = ((l1!=null)?l1.val:0) + ((l2!=null)?l2.val:0) + Carry;
    		ListNode node = new ListNode(sum%10);
    		Carry = sum/10;
    		if (resultList==null) {
    			nodetemp = node;
				resultList = nodetemp;
				l1 = l1.next;
				l2 = l2.next;
				continue;
			}
    		nodetemp.next = node;
    		nodetemp = nodetemp.next; 
    		l1 = (l1==null)?null:l1.next;
    		l2 = (l2==null)?null:l2.next;
		}
    	if (Carry!=0) {			//�������������ж����һλ�Ƿ��λ
			ListNode node = new ListNode(Carry);
			nodetemp.next = node;
		}
    
    	return resultList;
    }

}
