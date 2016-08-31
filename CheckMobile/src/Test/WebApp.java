package Test;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class WebApp {
	AppiumDriver d;

	@Test
	public void webapptest() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
     capabilities.setCapability("automationName", "Appium");
     capabilities.setCapability("deviceName","NP-DEV-galaxys5");
     capabilities.setCapability("platformVersion", "5.0.2");
     capabilities.setCapability("platformName","Android");
     capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
      d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
      d.get("https://bingo.vernons.com/");
	}


}
