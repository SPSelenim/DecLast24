package com.stc.SLDec24Last;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {

	public WebDriver driver=null;
	public String FName="fname";
	public String LName="lname";
	public String QA="//a[@name='QA']";
	
	public Search(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getFName()
	{
		WebElement WebEle=null;
		WebEle=driver.findElement(By.id(FName));
		return WebEle;
	}
	
	public WebElement getLName()
	{
		WebElement WebEle=null;
		WebEle=driver.findElement(By.id(LName));
		return WebEle;
	}
	
	public WebElement getQA()
	{
		WebElement WebEle=null;
		WebEle=driver.findElement(By.xpath(QA));
		return WebEle;
	}
	
	public void  EnterFName(String First)
	{
		getFName().sendKeys(First);
	}
	
	public void  EnterLName(String Last)
	{
	try
	{
		getLName().sendKeys(Last);
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}
	
	public void  ClickQA()
	{
		try
		{
					getQA().click();
					Thread.sleep(2000);

		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
	}
	
	
}
