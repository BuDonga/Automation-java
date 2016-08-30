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

//���Ĭ��ҳ���Ƿ��Ѿ���¼������Ѿ���¼�����˳�
public boolean IsLogin(){
	Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
	try {
		if (ef.log().isEnabled()){
			log.info("��ǰ�û���" + ef.log().getText() + "���ڵ�¼");
			ef.log().click();
			log.info("�û����˳�");		
			return true;
		}		
	}catch (Exception e){
		log.info("------------��ǰ���û���¼------------");
	}
	return false;		
}

//��¼����, loginUrl�ǵ�¼����ȷ�ϵ�url��������֤��ת�Ƿ���ȷ
public void login(String account, String password, String loginUrl) throws InterruptedException{
	String a;
	Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
	Mainpage_Function mf = new Mainpage_Function(driver);
	ef.loginInfo().click();
	Thread.sleep(5000);
	if(!(a = driver.getCurrentUrl()).equals(loginUrl)){
		mf.Snapshot("LoginTest1");
		log.warn("û����ת����¼ҳ�棬��ǰҳ���ǣ�"+ a);
		log.warn("�����ĵ�¼ҳ���ǣ�" + loginUrl);
	}
	assertEquals("ҳ����ת����ȷ",driver.getCurrentUrl(),loginUrl);	
	log.info("�Ѿ����¼����");
	ef.account().sendKeys(account);
	log.info("������˺��ǣ�" + account);
	ef.password().sendKeys(password);
	log.info("����������ǣ�" + password);
	ef.account().submit();
	log.info("�Ѿ���¼");
}

//��ҳ���ֱ��ҳ�����
public void zhicai(){
	driver.findElement(By.xpath("/html/body/div[1]/div/ul[1]/li[1]/a")).click();
}

}
