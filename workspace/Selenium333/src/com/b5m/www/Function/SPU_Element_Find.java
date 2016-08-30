package com.b5m.www.Function;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.b5m.www.Elements.SPU_Element;

public class SPU_Element_Find {
	WebDriver driver;
	
	public SPU_Element_Find(WebDriver driver){
		this.driver = driver;
	}
	
	
	//搜索结果页点击spu链接进入,输入图片的链接，输出跳转的url
	public String SPU_Click(String url){
		WebElement abc = driver.findElement(By.className("spu-price-lists"));
		List<WebElement> list = abc.findElements(By.tagName("a"));		
		for (WebElement e: list){
			if(e.getAttribute("href").equals(url)){
				try{
					e.click();
				}catch(Exception g){
					g.printStackTrace();
					System.out.println("e is not clickable------");				
				}
			}
		}		
		return driver.getCurrentUrl();
	}
	
	//判断是否搜索页结果与目标一致，返回当前结果的数量，同时截屏。输入为期待的数量,以及截图的名字	
	public int ResultEqual(float amount, String snapshotName) throws InterruptedException{
		Mainpage_Function mf = new Mainpage_Function(driver);
		WebElement result = driver.findElement(By.className("spu-price-tit-l"));
		int a = (int) mf.StringToFloat(result.getText());
		//验证搜索结果是否只有amount个SPU结果
		if(!((int)mf.StringToFloat(result.getText()) == amount)){
			Thread.sleep(2000);
			mf.Snapshot(snapshotName);
		}
		return a;
	}
	
	
}
