package com.leedcode.simple;

import java.util.Arrays;

public class TwoSum {

	public static int[] excute(int[] nums, int target) {
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}				
			}
		}
		
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement)) {
//                return new int[] { map.get(complement), i};
//            }
//            map.put(nums[i], i);              
//        }
		
		return null;
	}
	
	public static void main(String[] args) {
		int[] result = excute(new int[] {1, 2}, 3);
		System.out.println(Arrays.toString(result));
	}
	
}
