package Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MobileTesting {
	AppiumDriver dr;
	//WebDriver dr;
	@Test
	public void testApp() throws MalformedURLException, InterruptedException{
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
	       Thread.sleep(1000L);
	       dr.findElementByXPath("//*[@content-desc='Username']").click();
	       //Thread.sleep(3000L);
	       Thread.sleep(1000);
	      int s= dr.findElementsByClassName("android.widget.EditText").size();
	       System.out.println(s);
	       List<WebElement> Inputbox=dr.findElementsByClassName("android.widget.EditText");
	       Thread.sleep(2000);
	       System.out.println(Inputbox.get(0).getLocation().getX()+","+Inputbox.get(0).getLocation().getY());
	       Inputbox.get(0).sendKeys("noblebug1");
	       Thread.sleep(2000);
	       dr.findElementByXPath("//*[@content-desc='Password']").click();
	       Thread.sleep(2000);
	       Inputbox.get(1).sendKeys("bola1234");
	       Thread.sleep(2000);
	       dr.findElementByXPath("//*[@content-desc='Log in']").click();
	       Thread.sleep(3000);
	       dr.findElementByXPath("//*[@class='android.widget.Button']").click();
	       //int Y=dr.findElementsByClassName("android.widget.ListView").size();
	       //System.out.println(Y);
	    //List<WebElement>BarMenu=dr.findElementsByClassName("android.widget.ListView");
	    //System.out.println(BarMenu.get(0).getText());
	   //BarMenu.get(0).click();
	       
	      
	      
	  //System.out.println(PasswordTextBox.getLocation().getX()+","+PasswordTextBox.getLocation().getY())

	       
	       // code for identifying if the Apps is insstalled
	       //dr.isAppInstalled("com.whatsapp");
	       //System.out.println(dr.isAppInstalled("com.whatsapp"));
	       //dr.findElementByAndroidUIAutomator("UiSelector().text(\"Add Contact\")").click();;
	       //dr.findElement(MobileBy.AndroidUIAutomator("android.widget.Spinner")).sendKeys("MRS");
	       
	       Thread.sleep(3000L);
	     
	       // clicking
	       
	       	}
	
	@AfterTest
	public void quit(){
		if(dr!=null)
			dr.quit();
	
}

}
