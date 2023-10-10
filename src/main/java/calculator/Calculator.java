package calculator;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

 public class Calculator {
 AppiumDriver driver;
	public static void main(String[] args) {
		

	}
	
	public static void openCalculator() {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Samsung F23");
		cap.setCapability("UDID", "RZCT92584AT");
		cap.setCapability("PlatformName", "Android ");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("appPackage", "");
		cap.setCapability("appActivity", "Samsung F23");
		
	}

}
