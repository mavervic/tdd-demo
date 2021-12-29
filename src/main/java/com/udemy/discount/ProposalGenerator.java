package com.udemy.discount;

import java.util.Calendar;

public class ProposalGenerator {
	
	private Clock clock;
	
	public ProposalGenerator(Clock clock) {
		this.clock = clock;
	}
	
	public double calculateDiscount(Basket basket) {
		if(isJanuary()) return basket.getAmount() * 0.05;
		if(isChristmas()) return basket.getAmount() * 0.15;
		
		return basket.getAmount();
	}

	private boolean isChristmas() {
		Calendar today = clock.now();
		return today.get(Calendar.MONTH) == Calendar.DECEMBER &&
				today.get(Calendar.DATE) == 25;
	}

	private boolean isJanuary() {
		Calendar today = clock.now();
		return today.get(Calendar.MONTH) == Calendar.JANUARY;
	}
	
	
}