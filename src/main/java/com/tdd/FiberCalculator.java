package com.tdd;

/**
 * 透過TDD實現計算費波那契數
 * 參考: https://www.bilibili.com/video/BV18s411K7Kr
 * @author Vic
 */
public class FiberCalculator {

	/**
	 * 計算費波那契數
	 * @param index
	 * @return 0 1 1 2 3 5 8 13 21
	 */
	public static long calculate(int index) {
		if(index <= 0 || index > 50) {
			throw new IllegalArgumentException();
		}
		
		if(index == 1 || index == 2) {
			return 1;
		}
		
		long first = 1;
		long second = 1;
		long temp = 0;
		for (int i = 3; i <= index; i++) {
			temp = first;
			first = second;
			second = temp + first;
		}
		
		return second;	}
}
