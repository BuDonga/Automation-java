package com.b5m.www.Function;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.b5m.www.Testcase.Test;

public class Configuration {
	public String browser;
	public String browser_path;
	public String implicitlyWait;
	public String snapshot_path;
	static Logger log = Logger.getLogger(Test.class);

	/**
	 * @param driver
	 * @throws IOException
	 *             读取配置文件下的值
	 */
	public Configuration(){
		try{
			Properties p = new Properties();
			InputStream in = new BufferedInputStream(new FileInputStream("src/sys.properties"));
				p.load(in);
			Iterator<String> it = p.stringPropertyNames().iterator();
			while (it.hasNext()) {
				String key = it.next();
				switch (key) {
				case "snapshot_path":
					snapshot_path = p.getProperty(key);
					break;
				case "browser":
					browser = p.getProperty(key);
					break;
				case "browser_path":
					browser_path = p.getProperty(key);
					break;
				case "implicitlyWait":
					implicitlyWait = p.getProperty(key);
					break;
				}
			}
			in.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
