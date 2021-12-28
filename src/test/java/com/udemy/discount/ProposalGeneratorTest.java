package com.udemy.discount;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ProposalGeneratorTest {

	@Test
	void discountWhenChristmax() {
		Basket basket = Basket.builder().itemName("Mac").amount(1000).build();
		
		ProposalGenerator generator = new ProposalGenerator();
		double finalAmount = generator.calculateDiscount(basket);
		
		Assert.assertEquals(1000 * 0.85, finalAmount, 0.0001);
	}
}
