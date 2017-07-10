package com.wd.oms;

import org.openqa.selenium.By;

public class Mainclass extends Openbrowser {
	
	public static void main(String[] args) {
		invokebrowser();
		driver.get("http://10.10.1.94:8080/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Mark.s@micr");
		driver.findElement(By.id("txtPassword")).sendKeys("Hari#123");
		driver.findElement(By.xpath("//*[@class='pull-right']")).click();
		
		
		
	}

}
