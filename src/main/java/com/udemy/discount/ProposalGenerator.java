package com.udemy.discount;

public class ProposalGenerator {

	
	public double calculateDiscount(Basket basket) {
		if(isJanuary()) return basket.getAmount() * 0.05;
		if(isChristmas()) return basket.getAmount() * 0.15;
		
		return 0;
	}

	private boolean isChristmas() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isJanuary() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}