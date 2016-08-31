package Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class join {
	AppiumDriver dr;	
	@Test
public void joinNowTest() throws MalformedURLException, InterruptedException{
		File app = new File("C:\\Users\\Solomon.adekunle\\Desktop\\For OneDrive\\workspace\\CheckMobile\\uk.co.titanbet.android.apk");
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	       // capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		 capabilities.setCapability("deviceName","NP-DEV-galaxys5");
		 capabilities.setCapability("platformVersion", "5.0.2");
		 capabilities.setCapability("platformName","Android");
		 	capabilities.setCapability("app", app.getAbsolutePath());

	      // capabilities.setCapability("appPackage", "com.whatsapp");
	       //capabilities.setCapability("appActivity", "com.whatsapp.Main");

	     //dr = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		 dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		  dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       dr.findElementByXPath("//*[@content-desc='LOG IN']").click();
	       Thread.sleep(4000);
	       dr.findElementByXPath("//*[@content-desc='Join Now']").click();
	       Thread.sleep(4000);
	       dr.findElementByXPath("//*[@content-desc='Title']").click();
	       dr.findElementByXPath("//*[@text='Mrs']").click();
	       dr.findElementByXPath("//*[@content-desc='First Name']").click();
	       dr.findElementByXPath("//*[@content-desc='First Name']").sendKeys("claire");
	       dr.findElementByXPath("//*[@content-desc='Last Name']").click();
	       dr.findElementByXPath("//*[@content-desc='Last Name']").sendKeys("Miller");
	       dr.findElementByXPath("//*[@content-desc='Date']").click();
	       dr.findElementByXPath("//*[@text='3']").click();
	       dr.findElementByXPath("//*[@content-desc='Month']").click();
	       dr.scrollTo("October");
	       dr.findElementByXPath("//*[@text='October']").click();
	       dr.findElementByXPath("//*[@content-desc='Year']").click();
	       dr.scrollTo("1980");
	       dr.findElementByXPath("//*[@text='1980']").click();
	       dr.findElementByXPath("//*[@content-desc='Postal Code']").click();
	       dr.findElementByXPath("//*[@content-desc='Postal Code']").sendKeys("SE26 5QU");
	       dr.findElementByXPath("//*[@content-desc='Address']").click();
	       dr.findElementByXPath("//*[@content-desc='Address']").sendKeys("fLAT 4");
	       dr.findElementByXPath("//*[@content-desc='City']").click();
	       dr.findElementByXPath("//*[@content-desc='City']").sendKeys("London");
	       dr.findElementByXPath("//*[@content-desc='Mobile Number']").click();
	       dr.findElementByXPath("//*[@content-desc='Mobile Number']").sendKeys("02072300200");
	       dr.findElementByXPath("//*[@class='android.view.View' and @index='1']").click();
	       dr.findElementByXPath("//*[@class='android.view.View' and @index='1']").sendKeys("adebi@yahoo.com");
	       dr.findElementByXPath("//*[@content-desc='Go to step 2']").click();
	      

		
	}
	@AfterTest
	public void quit(){
		if(dr!=null)
			dr.quit();
	
}
}
