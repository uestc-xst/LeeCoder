package JUnitTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.leecoder.src.ListNode;
import com.leecoder.src.MergeTwoSortedLists;

import sun.rmi.runtime.Log;

public class MergeTwoSortedLists_JUnitTest {

	public ListNode l1 = null,l2 = null;
	ListNode resultnodes = null;
	
	@Before
	public void InitData(){
		l1 = new ListNode(-9);
		l2 = new ListNode(2);
	}
	
	
	@Test
	public void test() {
		resultnodes = MergeTwoSortedLists.mergeTwoLists(l1, l2);
		System.out.println("hello");
	}

}
