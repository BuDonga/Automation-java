package com.b5m.www.Function;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.b5m.www.Testcase.Test;

public class Mainpage_Function {
	WebDriver driver;
	Configuration conf = new Configuration();
	static Logger log = Logger.getLogger(Test.class);
	public Mainpage_Function(WebDriver driver) {
		this.driver = driver;
	}

	// 切换到新建的窗口
	public String GoToNewWindow() {
		String[] handles = new String[driver.getWindowHandles().size()];
		driver.getWindowHandles().toArray(handles);
		driver.switchTo().window(handles[handles.length - 1]);
		return driver.getCurrentUrl();
	}

	// 从字符串中提取带小数点的数字，并且返回
	public float StringToFloat(String Linktext) {
		char[] b = Linktext.toCharArray();
		String result = "";
		for (int i = 0; i < b.length; i++) {
			if (("0123456789.").indexOf(b[i] + "") != -1) {
				result += b[i];
			}
		}
		return Float.parseFloat(result);

	}

	// 截屏功能
	public void Snapshot(String ScirptName) {
		try {
			File screenshot = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			String f1 = ScirptName + "_" + dateFormat.format(now) + ".jpg";
			FileUtils.copyFile(screenshot, new File(
					conf.snapshot_path + f1));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 判断商品来源点击以后，商品来源标签会不会消失，消失返回0
	public int SourceExists(String Source) {
		int i = 0;
		driver.get("http://s.b5m.com/s/Search?key=手机&sources=" + Source);
		List<WebElement> e = driver.findElements(By.tagName("dt"));
		for (WebElement ee : e) {
			// System.out.println(ee.getText());
			if (ee.getText().equals("商品来源:")) {
				i++;
			}
		}
		return i;
	}

	// 初始化，并且登录url
	public boolean hasLoadPageSucceeded(String url) {
		try {
			driver.manage().timeouts().implicitlyWait(Long.valueOf(conf.implicitlyWait), TimeUnit.SECONDS);
			driver.manage().window().maximize();
			// driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.get(url);
			return true;
		} catch (Exception te) {
			 log.warn("******************本次启动WebDriver异常挂起******************");			
			return false;
		}
	}

	// 实现多次reload browser
	public void driverStart(String url, int repeatTimes) {
		int index = 0;
		boolean suspended = true;
		while (index < repeatTimes && suspended) {
			if (index != 0) {
				 log.info("******************Reload!!!******************");			
			}
			suspended = !hasLoadPageSucceeded(url);
			index++;
		}
		if (index == repeatTimes && suspended) {
			throw new RuntimeException(
					"can not start webdriver successfully, it's suspended!");
		}
	}

	// 比较SPU详情页右侧价格的顺序是否按从小打到排列，如果不是，则断言失败，并且截图
	public void SpuPrice(String snapshot) {
		boolean b = true;
		try {
			List<WebElement> list = driver.findElements(By
					.className("spu-sku-source-price"));
			for (int i = 1; i < list.size(); i++) {
				if (StringToFloat(list.get(0).getText()) > StringToFloat(list
						.get(i).getText())) {
					Snapshot(snapshot);
					b = false;
				}
			}
		} catch (Exception e) {
			assertTrue("Iphone6s价格排序错误", b);
			e.printStackTrace();
		}
	}

	public void PageVerify(String snapshot){
		try{
			driver.findElement(By.xpath("//*[@id='buyForm']/div/div[6]/a[1]/span")).click();
		} catch (Exception e){
			Snapshot(snapshot);
			assertTrue("商品已下架或者属性缺失", false);
			e.printStackTrace();
		}
	}	
}


