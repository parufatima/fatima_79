package com.Utility.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	
	public BaseClass() {
		try {
			FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\com\\config\\qa\\ConfigFile.properties");
			
			 prop = new Properties();
			prop.load(fls);
		} catch (FileNotFoundException e) {
			System.out.println("Please check the code");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void initBrowser() {
		
		String Browserset = prop.getProperty("Browser1");
		
		if(Browserset.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestData.ImplicitlyWait));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestData.pageLoad));
			
			
				
			
		}
		else if(Browserset.equals("FireFox")) {
			
		}
		
	}

	public static void lunchURL(String URL) {
		driver.get(prop.getProperty("URL"));
		
	}
	
}
