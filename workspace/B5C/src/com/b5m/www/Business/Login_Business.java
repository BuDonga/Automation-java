package com.b5m.www.Business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.b5m.www.Elements.Globel_Element;
import com.b5m.www.Elements.Login_Elements;
import com.b5m.www.Elements.Mainpage_Elements;
import com.b5m.www.Function.Mainpage_Function;
import com.b5m.www.Testcase.Test;

public class Login_Business {
	WebDriver driver;
	private String loginUrl = "http://www.b5cai.com/login.html?back=http%3A%2F%2Fwww.b5cai.com%2Findex.html";
	String guohuai_account = "13801926461";
	String guohuai_password = "a111111";
	static Logger log = Logger.getLogger(Test.class);		
	public Login_Business(WebDriver driver){
			this.driver = driver;			
	}
	
//���Ĭ��ҳ���Ƿ��Ѿ���¼������Ѿ���¼�����˳�
public boolean IsLogin(){	
	Login_Elements le = new Login_Elements(driver);	
	try {
		if (le.log().isEnabled()){
			log.info("��ǰ�û���" + le.log().getText() + "���ڵ�¼");
			le.log().click();
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
	Login_Elements le = new Login_Elements(driver);	
	Mainpage_Function mf = new Mainpage_Function(driver);
	String a;
	le.loginBtn().click();
	Thread.sleep(5000);
	if(!(a = driver.getCurrentUrl()).equals(loginUrl)){
		mf.Snapshot("LoginTest1");
		log.warn("û����ת����¼ҳ�棬��ǰҳ���ǣ�"+ a);
		log.warn("�����ĵ�¼ҳ���ǣ�" + loginUrl);
	}
	assertEquals("ҳ����ת����ȷ",driver.getCurrentUrl(),loginUrl);	
	log.info("�ѽ����¼����");
	le.account().sendKeys(account);
	log.info("������˺��ǣ�" + account);
	le.password().sendKeys(password);
	log.info("����������ǣ�" + password);
	le.account().submit();	
	}

//��huohuai�˺ŵ�¼���˺�����д��
public void Login_Guohuai(){
	Login_Elements le = new Login_Elements(driver);
	Mainpage_Function mf = new Mainpage_Function(driver);
	IsLogin();
	try{
	login(guohuai_account,guohuai_password, loginUrl);
		if (!le.loginBtn().isEnabled()){
			mf.Snapshot("LoginTest1_��¼δ�ɹ�");
			log.info("δ��¼�ɹ�");
		}
	}catch (Exception e){
		mf.Snapshot("LoginTest1_��¼δ�ɹ�");
		log.info("δ��¼�ɹ�,�����˺������Ƿ���ȷ");
	}finally{
		assertTrue("û�гɹ���¼", le.loginBtn().isEnabled());	
		}
	log.info("��¼�ɹ�");		
	}
}




