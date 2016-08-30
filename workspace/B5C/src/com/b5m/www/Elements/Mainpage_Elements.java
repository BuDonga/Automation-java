package com.b5m.www.Elements;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.b5m.www.Elements.Globel_Element;
import com.b5m.www.Function.Mainpage_Function;
import com.b5m.www.Testcase.Test;



public class Mainpage_Elements {	
	WebDriver driver;
	Mainpage_Function mf = new Mainpage_Function(driver);
	static Logger log = Logger.getLogger(Test.class);	
	public Mainpage_Elements(WebDriver driver) {
		this.driver = driver;
	} 
		
	//主页点击直采页面进入
	public void zhicai(){
		driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[2]/a")).click();
	}
	
}
