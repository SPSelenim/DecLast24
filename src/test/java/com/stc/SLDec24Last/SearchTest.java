package com.stc.SLDec24Last;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SearchTest {
public WebDriver driver=null;
	@BeforeSuite
public void tearUp()
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");		
driver.manage().window().maximize();
}

	
	@Test
  public void f() {
try
{
		System.out.println("***************** My FRAMEWORK Program ***************** ");
		Search ss=new Search(driver);
		ss.EnterFName("XX");
		ss.EnterLName("xxx");
		ss.ClickQA();
		
}
catch(Exception e)
{
	System.out.println(e.getMessage());
}
}

	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
