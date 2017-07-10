package com.wd.oms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {
	public static WebDriver driver=null;
	public static void invokebrowser ()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harikrishna.s\\workspace\\Web browsers\\chromedriver.exe");
	     driver=new ChromeDriver();
	}
}
