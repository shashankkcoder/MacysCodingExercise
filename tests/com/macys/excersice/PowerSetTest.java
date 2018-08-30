package com.macys.excersice;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PowerSetTest {

	@Test
	public void nullList() {
		PowerSet powerSet = new PowerSet();
		int[] nums = {};
		List allSubSet = powerSet.getAllSubsets(null);
		Assert.assertEquals(1, allSubSet.size());
	}
	
	@Test
	public void emptyList() {
		PowerSet powerSet = new PowerSet();
		int[] nums = {};
		List allSubSet = powerSet.getAllSubsets(nums);
		Assert.assertEquals(1, allSubSet.size());
	}
	
	@Test
	public void twoElementsList() {
		PowerSet powerSet = new PowerSet();
		int[] nums = {1, 2};
		List allSubSet = powerSet.getAllSubsets(nums);
		Assert.assertEquals(4, allSubSet.size());
	}
	
	
	
}
