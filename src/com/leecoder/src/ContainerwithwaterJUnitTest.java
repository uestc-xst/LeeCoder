package com.leecoder.src;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ContainerwithwaterJUnitTest {

	int[] heigh;
	@Before
	public void InitData(){
		heigh = new int[]{2,5,2,5,6,4};
	}
	
	@Test
	public void test() {
		
		int actual = Containerwithmostwater.maxArea2(heigh);
		System.out.println(actual);
		Assert.assertEquals(16, actual);	//判断得到的结果值和预期值是否相等
	}

	@After
	public void UpdateData(){
		heigh = new int[]{2,5,2,7,4};
		int actual = Containerwithmostwater.maxArea2(heigh);
		System.out.println(actual);
	}
}
