package com.b5m.www.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.b5m.www.Elements.Mainpage_Element;
import com.b5m.www.Elements.Mainpage_Element_FastSearch;
import com.b5m.www.Elements.SPU_Element;

public class Mainpage_ElementsFind {	
	WebDriver driver;
	Mainpage_Function mf = new Mainpage_Function(driver);
	public Mainpage_ElementsFind(WebDriver driver) {
		this.driver = driver;
	} 
	
	public WebElement FastSearch1(){
		WebElement fs = driver.findElement(By.xpath(Mainpage_Element_FastSearch.FastSearch_line1));
		return fs;
	}
	
	public WebElement FastSearch2(){
		WebElement fs = driver.findElement(By.xpath(Mainpage_Element_FastSearch.FastSearch_line2));
		return fs;
	}
	
	public WebElement FastSearch3(){
		WebElement fs = driver.findElement(By.xpath(Mainpage_Element_FastSearch.FastSearch_line3));
		return fs;
	}
	
	public WebElement FastSearch4(){
		WebElement fs = driver.findElement(By.xpath(Mainpage_Element_FastSearch.FastSearch_line4));
		return fs;
	}
	
	public WebElement FastSearch5(){
		WebElement fs = driver.findElement(By.xpath(Mainpage_Element_FastSearch.FastSearch_line5));
		return fs;
	}
	
	public WebElement FastSearch6(){
		WebElement fs = driver.findElement(By.xpath(Mainpage_Element_FastSearch.FastSearch_line6));
		return fs;
	}
	
	public WebElement FastSearch7(){
		WebElement fs = driver.findElement(By.xpath(Mainpage_Element_FastSearch.FastSearch_line7));
		return fs;
	}
	
	public WebElement FastSearch8(){
		WebElement fs = driver.findElement(By.xpath(Mainpage_Element_FastSearch.FastSearch_line8));
		return fs;
	}
	
	
	public WebElement SearchLine(String element){
		WebElement element_searchline = driver.findElement(By.xpath(Mainpage_Element.XPath_SearchBox));
		element_searchline.sendKeys(element);
		return element_searchline;
	}
	
	public WebElement Submit(){
		WebElement element_submit = driver.findElement(By.xpath(Mainpage_Element.XPath_SearchButton));
		element_submit.click();
		return element_submit;
	}
	
	public WebElement TotalAmount(){
		WebElement search_result = driver.findElement(By.className(Mainpage_Element.Result));
		return search_result;
	}
	
	
	
	//SPU Iphone6s
	
	public WebElement AdClosed(){
		WebElement element = driver.findElement(By.className(Mainpage_Element.AdClosed));
		return element;
	}
	
	public WebElement Iphone6s_JingDong(){
		WebElement element = driver.findElement(By.xpath(Mainpage_Element.JingDong));
		return element;
	}
	
	public WebElement Iphone6s_DangDang(){
		WebElement element = driver.findElement(By.xpath(Mainpage_Element.DangDang));
		return element;
	}
	
	public WebElement Iphone6s_YiHaoDian(){
		WebElement element = driver.findElement(By.xpath(Mainpage_Element.YiHaoDian));
		return element;
	}
	
	public WebElement Iphone6s_TianMao(){
		WebElement element = driver.findElement(By.xpath(Mainpage_Element.TianMao));
		return element;
	}
	
	public WebElement Iphone6s_SuNing(){
		WebElement element = driver.findElement(By.xpath(Mainpage_Element.SuNing));
		return element;
	}
	
	public WebElement Iphone6s_YiXun(){
		WebElement element = driver.findElement(By.xpath(Mainpage_Element.YiXun));
		return element;
	}
	
	public WebElement Iphone6s_GuoMei(){
		WebElement element = driver.findElement(By.xpath(Mainpage_Element.GuoMei));
		return element;
	}
	
	public WebElement SPU_Iphone6s (){
		WebElement element = driver.findElement(By.xpath(Mainpage_Element.Iphone6s));		
		return element;
	}
	
	
	//SPU Iphone6s_Plus
	public WebElement Iphone6s_Plus_JingDong(){
		WebElement element = driver.findElement(By.xpath(Mainpage_Element.JingDong_Plus));
		return element;
	}
	
	public WebElement Iphone6s_Plus_DangDang(){
		WebElement element = driver.findElement(By.xpath(Mainpage_Element.DangDang_Plus));
		return element;
	}
	
	public WebElement Iphone6s_Plus_YiHaoDian(){
		WebElement element = driver.findElement(By.xpath(Mainpage_Element.YiHaoDian_Plus));
		return element;
	}
	
	public WebElement Iphone6s_Plus_TianMao(){
		WebElement element = driver.findElement(By.xpath(Mainpage_Element.TianMao_Plus));
		return element;
	}
	
	public WebElement Iphone6s_Plus_SuNing(){
		WebElement element = driver.findElement(By.xpath(Mainpage_Element.SuNing_Plus));
		return element;
	}
	
	public WebElement Iphone6s_Plus_YiXun(){
		WebElement element = driver.findElement(By.xpath(Mainpage_Element.YiXun_Plus));
		return element;
	}
	
	public WebElement Iphone6s_Plus_GuoMei(){
		WebElement element = driver.findElement(By.xpath(Mainpage_Element.GuoMei_Plus));
		return element;
	}
	

	public WebElement SPU_Iphone6s_Plus (){
		WebElement element = driver.findElement(By.xpath(Mainpage_Element.Iphone6s_Plus));
		return element;
	}
	
	
}
