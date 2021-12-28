package com.bilibili.yuanshenjian;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzPrinter {

	public static String print(int number) {
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= number; i++) {
			String result = "";
			if(i % 3 == 0) result += "Fizz";
			if(i % 5 == 0) result += "Buzz";
			
			if(result.length() > 0) {
				list.add(result);
			} else {
				list.add(String.valueOf(i));
			}
		}
		return list.toString();
	}
}
