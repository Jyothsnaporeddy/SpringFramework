package com.spring.Spring_autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("humanHeart")	
	private Heart heart;
	
	/*
	 * public Human() {
	 * 
	 * }
	 * 
	 * 
	 * public Human(Heart heart) {
	 * 
	 * this.heart = heart; System.out.println("This is Heart constr method"); }
	 * 
	 * 
	 * public void setHeart(Heart heart) { this.heart = heart; }
	 */
	public void startPumping() {
		if(heart != null) {
			heart.pump();
			System.out.println("Name of os animal is:" + heart.getNameOfAnimal()+
					"Number of hearts present is : " +heart.getNoOfHearts());
		}else {
			System.out.println("You are dead");
		}
	}
	
	

}
