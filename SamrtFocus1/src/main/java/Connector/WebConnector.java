package Connector;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WebConnector  {
	Properties OR = null;
	Properties CONFIG=null;
	static WebDriver driver =null;
	WebDriver mozilla=null;
	WebDriver chrome=null;
	WebDriver ie=null;
	static WebConnector w;
private WebConnector(){
		
		if(OR==null){
			try{
				// initialize OR
				OR = new Properties();
				FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\test\\Config\\OR.Properties");
				OR.load(fs);
				
				// initialize CONFIG to corresponding env
				CONFIG= new Properties();
				fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\test\\Config\\config.Properties");
				CONFIG.load(fs);
				
				//System.out.println(OR.getProperty("loginusername"));
				System.out.println(CONFIG.getProperty("siteURL"));
				System.out.println(OR.getProperty("search_box"));
				
				
			}catch(Exception e){
				System.out.println("Error on intializing properties files");
			}
			
			
			
		}
		
	}
	
	/// ****************Application Independent functions************************ ///

	// opening the browser
	public void openBrowser(String browserType){
		//log("Opening browser "+browserType);
		if(browserType.equals("Mozilla") && mozilla==null){
			driver = new FirefoxDriver();
			mozilla=driver;
		}else if(browserType.equals("Mozilla") && mozilla!=null){
			driver=mozilla;
		}else if(browserType.equals("Chrome") && chrome==null){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chrome//chromedriver.exe");
			driver=new ChromeDriver();
			chrome=driver;
		}else if(browserType.equals("Chrome") && chrome==null){
			driver=chrome;
		}
		
		else if(browserType.equals("IE")){
			// set the IE server exe path and initialize
		}
		// max
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	// navigates to a URL
	public void navigate(String URL){
		//log("Navigating to "+CONFIG.getProperty(URL));
		driver.get(CONFIG.getProperty(URL));
	}
	// clicking on any object
	public void click(String objectName){
		//log("Clicking on " + objectName);
		driver.findElement(By.xpath(OR.getProperty(objectName))).click();
	}
	
	public void type(String text, String objectName){
		try{
		//log("Typing in " + objectName);
		if(objectName.endsWith("_xpath"))
		  driver.findElement(By.xpath(OR.getProperty(objectName))).sendKeys(text);
		else if(objectName.endsWith("_id"))
			driver.findElement(By.id(OR.getProperty(objectName))).sendKeys(text);
		else if(objectName.endsWith("_name"))
			driver.findElement(By.name(OR.getProperty(objectName))).sendKeys(text);
		else if(objectName.endsWith("_Selector"))
			driver.findElement(By.cssSelector(OR.getProperty(objectName))).sendKeys(text);
		}catch(NoSuchElementException e){
			Assert.fail("Element not found - "+objectName);
			//Utility.takeScreenshot(identifier);
		}
		
		
	}
	public void verifyTitle(){
		
	}
		 
	public boolean isElementPresent(String objectName){
		//log("Checking object presence "+ objectName);
		int count = driver.findElements(By.xpath(OR.getProperty(objectName))).size();
		if(count==0)
			return false;
		else
			return true;
	}

	
	
	
	
	/********Singleton**********/
	public static WebConnector getInstance(){
		if(w==null)
			w= new WebConnector();
		
		return w;
	}

	public WebElement PageElement2(String webElementName) {
		return driver.findElement(By.xpath(OR.getProperty(webElementName)));
	}

	
	 public static WebElement move(WebElement object){
		 Actions net= new Actions(driver);
		net.moveToElement(object).build().perform();
		return object;
		 
	 }
	}

	
	

	
	
	/**************Logging***************/
	
	
	
	
	
	
	
	
	
	




