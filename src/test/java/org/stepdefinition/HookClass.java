package org.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utility.CommonClass;


import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends CommonClass {
	@Before
	public static void before() {
		browserName("chrome");
		impWait(20);

	}
	
	@After
	public static void after(Scenario s) {

		if(s.isFailed()) {
			TakesScreenshot tk=(TakesScreenshot)driver;
			byte[] bt = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(bt, "image/png");
		}
		quit();
	}

}
