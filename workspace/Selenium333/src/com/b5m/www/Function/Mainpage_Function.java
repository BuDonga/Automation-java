package com.b5m.www.Function;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mainpage_Function {
	WebDriver driver;

	public Mainpage_Function(WebDriver driver) {
		this.driver = driver;
	}

	// �л����½��Ĵ���
	public String GoToNewWindow() {
		String[] handles = new String[driver.getWindowHandles().size()];
		driver.getWindowHandles().toArray(handles);
		driver.switchTo().window(handles[handles.length - 1]);
		return driver.getCurrentUrl();
	}

	// ���ַ�������ȡ��С��������֣����ҷ���
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

	// ��������
	public void Snapshot(String ScirptName) {
		try {
			File screenshot = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			String f1 = ScirptName + "_" + dateFormat.format(now) + ".jpg";
			FileUtils.copyFile(screenshot, new File(
					"E:\\Work\\SVN\\10.Product Mng\\20.PPG\\30.Development Mng\\60.Automation\\workspace\\Selenium333\\snapshot\\" + f1));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// �ж���Ʒ��Դ����Ժ���Ʒ��Դ��ǩ�᲻����ʧ����ʧ����0
	public int SourceExists(String Source) {
		int i = 0;
		driver.get("http://s.b5m.com/s/Search?key=�ֻ�&sources=" + Source);
		List<WebElement> e = driver.findElements(By.tagName("dt"));
		for (WebElement ee : e) {
			// System.out.println(ee.getText());
			if (ee.getText().equals("��Ʒ��Դ:")) {
				i++;
			}
		}
		return i;
	}

	// ��ʼ�������ҵ�¼url
	public boolean hasLoadPageSucceeded(String url) {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			// driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.get(url);
			return true;
		} catch (Exception te) {
			// log.warn("******************��������WebDriver�쳣����******************");
			System.out
					.println("******************��������WebDriver�쳣����******************");
			return false;
		}
	}

	// ʵ�ֶ��reload browser
	public void driverStart(String url, int repeatTimes) {
		int index = 0;
		boolean suspended = true;
		while (index < repeatTimes && suspended) {
			if (index != 0) {
				// log.info("******************Reload!!!******************");
				System.out
						.println("******************Reload!!!******************");
			}
			suspended = !hasLoadPageSucceeded(url);
			index++;
		}
		if (index == repeatTimes && suspended) {
			throw new RuntimeException(
					"can not start webdriver successfully, it's suspended!");
		}
	}

	// �Ƚ�SPU����ҳ�Ҳ�۸��˳���Ƿ񰴴�С�����У�������ǣ������ʧ�ܣ����ҽ�ͼ
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
			assertTrue("Iphone6s�۸��������", b);
			e.printStackTrace();
		}
	}

	public void PageVerify(String snapshot){
		try{
			driver.findElement(By.xpath("//*[@id='buyForm']/div/div[6]/a[1]/span")).click();
		} catch (Exception e){
			Snapshot(snapshot);
			assertTrue("��Ʒ���¼ܻ�������ȱʧ", false);
			e.printStackTrace();
		}
	}
	
	//��ȡCSV�е��ļ�
		public static Collection<String[]> getTestData(String path){
		List<String[]> records = new ArrayList<String[]>();
		String row;
		try {
		BufferedReader br = new BufferedReader(new FileReader(path));
		while ((row = br.readLine())!=null) {
		String fields[] = row.split(",");
		records.add(fields);
		}
		br.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		return records;
		}
	
}