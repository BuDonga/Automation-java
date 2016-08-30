package com.b5m.www.Testcase;

import static org.junit.Assert.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.b5m.www.Business.Login_Business;
import com.b5m.www.Elements.*;
import com.b5m.www.Function.*;
import com.thoughtworks.selenium.webdriven.commands.Click;

public class Test {


	public static void main(String[] args) throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--test-type");
//		driver.get("http://www.b5cai.com/brand-Suiskin/80002435.html");
		
		driver.get("http://www.b5cai.com/");
//		System.out.println("get url: "+driver.getCurrentUrl());
//		driver.navigate().to("http://zhidao.baidu.com/link?url=1l_SP06qRleYc6yP5noc3oJhBothZ2jG-4xM5jzDl9BojIYWghq685xVdDIBeclQvctgCmOPdpEOWoGQlrrghWzM5z1htRyg6gaP4VtTSzK");
//		System.out.println("Navigate to url: "+driver.getCurrentUrl());
//		driver.navigate().back();
//		System.out.println("Navigate back url: "+driver.getCurrentUrl());
//		driver.navigate().to("http://zhidao.baidu.com/link?url=1l_SP06qRleYc6yP5noc3oJhBothZ2jG-4xM5jzDl9BojIYWghq685xVdDIBeclQvctgCmOPdpEOWoGQlrrghWzM5z1htRyg6gaP4VtTSzK");
//		System.out.println("Navigate to url: "+driver.getCurrentUrl());
//		System.out.println("success");
		driver.findElement(By.xpath("//*[@id='b5c_wrap']/div[6]/div/div[4]/ul/li[1]/div[1]/a/img")).click();
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();  
		String [] strArray = new String [driver.getWindowHandles().size()];  
		int a = 0;
		while(it.hasNext()){              			
			String handle = it.next();
			strArray[a] = handle;
			a++;
            System.out.println(handle);  
        }  	
		System.out.println(driver.getCurrentUrl());
		System.out.println(handles);
		driver.switchTo().window(strArray[1]);
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
    }
		
}	