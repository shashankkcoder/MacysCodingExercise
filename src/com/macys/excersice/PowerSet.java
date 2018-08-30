package com.macys.excersice;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

	public List<List<Integer>> getAllSubsets(int[] nums) {
		List<List<Integer>> powerSet = new ArrayList();
		powerSet.add(new ArrayList());
		for (int i = 0; null != nums && i < nums.length; i++) {
			List<List<Integer>> subPowerSet = new ArrayList();
			for (List<Integer> set : powerSet) {
				List<Integer> temp = new ArrayList<>(set);
				temp.add(nums[i]);
				subPowerSet.add(temp);
			}
			powerSet.addAll(subPowerSet);
		}
		return powerSet;
	}
}
