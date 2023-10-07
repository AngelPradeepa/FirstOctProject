package basePack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	
	public static void initializeDriver() {
		String browsername = "chrome";
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
		
	}
	
	
	public static void driverClose() {
		
		driver.quit();
	}
	
	
	public static void browserlaunch(String url) {
		
		driver.get(url); 
	}
	
	public static void clickMethod(WebElement element) {
		
		element.click();
	}
	
	public static void sendKeys(WebElement element,String values) {
		
		element.sendKeys(values);
	}
	
	public static void getTextMethod(WebElement element) {
		
		element.getText();
	}
	
	public static boolean isDisplayedMethod(WebElement element) {
		
		return element.isDisplayed();
	}
	
	public static String getCssValue(WebElement element,String cssproperty) {
		
		String cssValue = element.getCssValue(cssproperty);
		return cssValue;
	}
	
	
	public static void selectByIndexmethod(WebElement element, int index) {
		
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void selectByvisibleTextmethod(WebElement element, String text) {
		
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	

	
	
	
	public static void getScreenShot(String screenShotName) throws IOException {
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		String dest = "";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		
	}
	
	
	public static void scrollByElement(WebElement element)  {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		
	}	
}