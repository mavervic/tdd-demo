package com.udemy.discount;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Basket {
	private String itemName;
	private Integer amount;
}
