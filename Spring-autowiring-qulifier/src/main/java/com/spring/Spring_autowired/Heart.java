package com.spring.Spring_autowired;

public class Heart {
	
	private String nameOfAnimal;
	private int NoOfHearts;
	
	
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}
	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public int getNoOfHearts() {
		return NoOfHearts;
	}
	public void setNoOfHearts(int noOfHearts) {
		NoOfHearts = noOfHearts;
	}

	public void pump() {
		System.out.println("Your heart is pumping");
		System.out.println("Alive");
	}
	

}
