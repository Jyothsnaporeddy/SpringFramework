package com.spring.SpringFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;

public class Login {
	
	@Value("${login.url}")
	private String url;
	
	@Value("${login.username}")
	private String username;
	
	@Value("${login.passwod}")
	private String password;
	
	@Value("${login.driver}")
	private String driverPro;
	
	public WebDriver driver;
	
	public void display() {
		System.out.println(username +" "+password+" "+url+" "+driver);
	}
	public void loginGoogle() throws ClassNotFoundException {
		
		//Class.forName(driver);
		System.setProperty("webdriver.chrome.driver", driverPro);
		driver = new ChromeDriver();
		driver.get(url);
		
		
	}
	

}
