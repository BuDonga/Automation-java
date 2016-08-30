package com.b5m.www.Elements;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.b5m.www.Function.Mainpage_Function;
import com.b5m.www.Testcase.Test;

public class Login_Elements {
	WebDriver driver;
	Mainpage_Function mf = new Mainpage_Function(driver);
	static Logger log = Logger.getLogger(Test.class);

	public Login_Elements(WebDriver driver) {
		this.driver = driver;
	}

	// 检查当前是否有“退出登录”的标签，如果有则定位,使用前加try catch
	public WebElement log() {
		WebElement fs = driver.findElement(By.xpath("//*[@id='b5c_wrap']/div[1]/div/div[2]/div/a)"));
		return fs;
	}

	// 首页“登录”按钮
	public WebElement loginBtn() {
		WebElement fs = driver.findElement(By.xpath("//*[@id='b5c_wrap']/div[1]/div/div[2]/div/a[1]"));
		return fs;
	}

	// 登录框
	public WebElement account() {
		WebElement fs = driver.findElement(By.xpath("//*[@id='loginform-username']"));
		return fs;
	}

	// 密码框
	public WebElement password() {
		WebElement fs = driver.findElement(By.xpath("//*[@id='loginform-password']"));
		return fs;
	}

}
