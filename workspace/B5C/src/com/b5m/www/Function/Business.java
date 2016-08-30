package com.b5m.www.Function;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.apache.xpath.operations.Equals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.b5m.www.Elements.Mainpage_Element;
import com.b5m.www.Function.Mainpage_ElementsFind;
import com.b5m.www.Testcase.Test;

public class Business {
	WebDriver driver;
	static Logger log = Logger.getLogger(Test.class);
		public Business(WebDriver driver){
			this.driver = driver;		
	}

//检查默认页面是否已经登录，如果已经登录，则退出
public boolean IsLogin(){
	Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
	try {
		if (ef.log().isEnabled()){
			log.info("当前用户：" + ef.log().getText() + "正在登录");
			ef.log().click();
			log.info("用户已退出");		
			return true;
		}		
	}catch (Exception e){
		log.info("------------当前无用户登录------------");
	}
	return false;		
}

//登录功能, loginUrl是登录界面确认的url，用来验证跳转是否正确
public void login(String account, String password, String loginUrl) throws InterruptedException{
	String a;
	Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
	Mainpage_Function mf = new Mainpage_Function(driver);
	ef.loginInfo().click();
	Thread.sleep(5000);
	if(!(a = driver.getCurrentUrl()).equals(loginUrl)){
		mf.Snapshot("LoginTest1");
		log.warn("没有跳转到登录页面，当前页面是："+ a);
		log.warn("期望的登录页面是：" + loginUrl);
	}
	assertEquals("页面跳转不正确",driver.getCurrentUrl(),loginUrl);	
	log.info("已经入登录界面");
	ef.account().sendKeys(account);
	log.info("输入的账号是：" + account);
	ef.password().sendKeys(password);
	log.info("输入的密码是：" + password);
	ef.account().submit();
	log.info("已经登录");
}

//主页点击直采页面进入
public void zhicai(){
	driver.findElement(By.xpath("/html/body/div[1]/div/ul[1]/li[1]/a")).click();
}

}
