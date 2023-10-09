package runner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import basePack.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass{

	@Before
	public void before() {
		System.out.println("*******Before statement executed******");
	}
		
	@After
	public void after(Scenario scenario) {
		if(scenario.isFailed()) {
		TakesScreenshot tk = (TakesScreenshot)driver;
		byte[] failureScreenShotSource = tk.getScreenshotAs(OutputType.BYTES);
		scenario.attach(failureScreenShotSource, "image/png", scenario.getName());
		driver.quit();
	}
		driver.quit();
}
}
