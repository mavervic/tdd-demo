package com.tdd.leedcode.simple;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class TwoSum {

	public int[] excute(int[] nums, int target) {
		
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i+1; j < nums.length; j++) {
////				System.out.print(i);
////				System.out.print("+");
////				System.out.print(j);
////				System.out.println();
//				if(nums[i] + nums[j] == target) {
////					System.out.println("got it");
//					return new int[] {i, j};
//				}				
//			}
//		}
		
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i};
            }
            map.put(nums[i], i);              
        }
		
		return null;
	}
	
	
	@Test
	void input_2_7_11_15_target_9_return_0_1() {
		assertThat(excute(new int[] {2, 7, 11, 15}, 9)).isEqualTo(new int[] {0, 1});
	}
	
	@Test
	void input_3_2_4_target_6_return_1_2() {
		assertThat(excute(new int[] {3, 2, 4}, 6)).isEqualTo(new int[] {1, 2});
	}
	
	@Test
	void input_3_3_target_6_return_0_1() {
		assertThat(excute(new int[] {3, 3}, 6)).isEqualTo(new int[] {0, 1});
	}
	
	@Test
	void input_3_3_target_7_return_null() {
		assertThat(excute(new int[] {3, 3}, 7)).isEqualTo(null);
	}
	
	@Test
	void input_2_5_5_11_target_10_return_1_2() {
		assertThat(excute(new int[] {2, 5, 5, 11}, 10)).isEqualTo(new int[] {1, 2});
	}
}
