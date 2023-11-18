package Utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericKeyword
{
	WebDriver driver;

	public void generickeyword(String browser)
	{

		if(browser.equals("Chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();

		}
		else if (browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}

	}

	public void enterUrl(String url)
	{
		driver.get(url);

	}
	public void enterData(String locater,String locatervalue,String data)
	{
		if(locater.equals("id"))
		{
			driver.findElement(By.id(locatervalue)).sendKeys(data);
		}
		else if(locater.equals("name"))
		{
			driver.findElement(By.name(locatervalue)).sendKeys(data);
		}
		else if(locater.equals("className"))
		{
			driver.findElement(By.className(locatervalue)).sendKeys(data);
		}
		else if(locater.equals("xPath"))
		{
			driver.findElement(By.xpath(locatervalue)).sendKeys(data);
		}
		else if(locater.equals("cssSelector"))
		{
			driver.findElement(By.cssSelector(locatervalue)).sendKeys(data);
		}
		else if(locater.equals("tagName"))
		{
			driver.findElement(By.tagName(locatervalue)).sendKeys(data);
		}
		else if(locater.equals("linkText"))
		{
			driver.findElement(By.linkText(locatervalue)).sendKeys(data);
		}
		else if(locater.equals("PartialLinkText"))
		{
			driver.findElement(By.partialLinkText(locatervalue)).sendKeys(data);
		}
	}
		public void clickonElement(String locater,String locatervalue)
		{
			if(locater.equals("id"))
			{
				driver.findElement(By.id(locatervalue)).click();
			}
			else if(locater.equals("name"))
			{
				driver.findElement(By.name(locatervalue)).click();
			}
			else if(locater.equals("className"))
			{
				driver.findElement(By.className(locatervalue)).click();
			}
			else if(locater.equals("xPath"))
			{
				driver.findElement(By.xpath(locatervalue)).click();
			}
			else if(locater.equals("cssSelector"))
			{
				driver.findElement(By.cssSelector(locatervalue)).click();
			}
			else if(locater.equals("tagName"))
			{
				driver.findElement(By.tagName(locatervalue)).click();
			}
			else if(locater.equals("linkText"))
			{
				driver.findElement(By.linkText(locatervalue)).click();
			}
			else if(locater.equals("PartialLinkText"))
			{
				driver.findElement(By.partialLinkText(locatervalue)).click();
			}
		}

		 public WebElement findElement(String locater,String locatervalue)
		 {
			 WebElement element = null;
			 if(locater.equals("id"))
			 {
				 element =driver.findElement(By.id(locatervalue));
			 }
			 else if(locater.equals("name"))
			 {
				 element=driver.findElement(By.name(locatervalue));
			 }
			 else if(locater.equals("className"))
			 {
				 element=driver.findElement(By.className(locatervalue));
			 }
			 else if(locater.equals("xPath"))
			 {
				 element=driver.findElement(By.xpath(locatervalue));
			 }
			 else if(locater.equals("cssSelector"))
			 {
				 element=driver.findElement(By.cssSelector(locatervalue));
			 }
			 else if(locater.equals("tagName"))
			 {
				 element=driver.findElement(By.tagName(locatervalue));
			 }
			 else if(locater.equals("linkText"))
			 {
				 element=driver.findElement(By.linkText(locatervalue));
			 }
			 else if(locater.equals("PartiallinkText"))
			 {
				 element=driver.findElement(By.partialLinkText(locatervalue));
			 }
			return element;
		 }
		 List<WebElement> elements = null;
		 public List<WebElement> findElements(String locater, String locatervalue)
		 {
			 if(locater.equals("id"))
			 {
				 elements =driver.findElements(By.id(locatervalue));
			 }
			 else if(locater.equals("name"))
			 {
				 elements=driver.findElements(By.name(locatervalue));
			 }
			 else if(locater.equals("className"))
			 {
				 elements=driver.findElements(By.className(locatervalue));
			 }
			 else if(locater.equals("xPath"))
			 {
				 elements=driver.findElements(By.xpath(locatervalue));
			 }
			 else if(locater.equals("cssSelector"))
			 {
				 elements=driver.findElements(By.cssSelector(locatervalue));
			 }
			 else if(locater.equals("tagName"))
			 {
				 elements=driver.findElements(By.tagName(locatervalue));
			 }
			 else if(locater.equals("linkText"))
			 {
				 elements=driver.findElements(By.linkText(locatervalue));
			 }
			 else if(locater.equals("PartiallinkText"))
			 {
				 elements=driver.findElements(By.partialLinkText(locatervalue));
				 
				 
			 }
			return elements;
		 }
		 public String pageTitle()
		 {
			String st =driver.getTitle();
			return st;
		 }
			 
		 }
			
			
		









	

