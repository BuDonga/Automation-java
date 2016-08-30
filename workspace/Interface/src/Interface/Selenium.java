package Interface;

//import org.apache.logging.log4j.Logger;

import org.apache.log4j.Logger;


public class Selenium {
	static Logger logger = Logger.getLogger(Selenium.class);
	
	public static void main(String[] args) {
		
		
		System.out.println("Log4j testing is start!!!!!!!");
		logger.info("This is info message~~~~~~~~~~~~~~~~~~");
		logger.debug("This is debug message~~~~~~~~~~");
		logger.error("This is error message~~~~~~~~");
		
		
	}

}
