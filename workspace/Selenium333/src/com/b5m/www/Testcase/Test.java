package com.b5m.www.Testcase;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
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



import com.b5m.www.Elements.*;
import com.b5m.www.Function.*;
import com.thoughtworks.selenium.webdriven.commands.Click;

public class Test {
	
	
static Logger logger = Logger.getLogger(Test.class);
	

	
	public static void main(String[] args) {
		
		
		System.out.println("Log4j testing is start!!!!!!!");
		logger.info("This is info message~~~~~~~~~~~~~~~~~~");
		logger.debug("This is debug message~~~~~~~~~~");
		logger.error("This is error message~~~~~~~~");
	}

}
