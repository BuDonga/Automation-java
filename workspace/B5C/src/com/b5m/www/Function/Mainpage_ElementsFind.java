package com.b5m.www.Function;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.b5m.www.Elements.Mainpage_Element;
import com.b5m.www.Testcase.Test;



public class Mainpage_ElementsFind {	
	WebDriver driver;
	Mainpage_Function mf = new Mainpage_Function(driver);
	static Logger log = Logger.getLogger(Test.class);	
	public Mainpage_ElementsFind(WebDriver driver) {
		this.driver = driver;
	} 
	
	//��鵱ǰ�Ƿ��С��˳���¼���ı�ǩ���������λ,ʹ��ǰ��try catch
	public WebElement log(){
			WebElement fs = driver.findElement(By.xpath("//*[@id='b5c_wrap']/div[1]/div/div[2]/div/a)"));	
			return fs;			
	}
	
	//��ҳ����¼����ť
	public WebElement loginInfo(){
		WebElement fs = driver.findElement(By.xpath("//*[@id='b5c_wrap']/div[1]/div/div[2]/div/a[1]"));
		return fs;
	}	
	
	//��¼��
		public WebElement account(){
			WebElement fs = driver.findElement(By.xpath("//*[@id='loginform-username']"));
			return fs;
		}	

	//�����
		public WebElement password(){
			WebElement fs = driver.findElement(By.xpath("//*[@id='loginform-password']"));
			return fs;
		}	
	
	//ֱ��
		public WebElement zhicai(){
			WebElement fs = driver.findElement(By.xpath("/html/body/div[1]/div/ul[1]/li[1]/a"));
			return fs;
		}
	
	
	
	
	
	
}
