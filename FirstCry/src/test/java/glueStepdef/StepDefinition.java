package glueStepdef;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ing.common.utilities.CommonUtilities;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class StepDefinition {
	public static WebDriver driver;
	public  Properties property;
	CommonUtilities commonUtilities=new CommonUtilities();
		
		
	@Given ("^Launch browser and pass first cry url$")
	public void launchbrowser(){
		String Browser="";
		if (property.getProperty("Browser").equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:/Users/nandinimallap.prasa/.m2/repository/Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","");
		}
		
		driver.get(property.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Before
	public Properties getproperty() throws IOException{
		FileInputStream fis=new FileInputStream("C:/Users/nandinimallap.prasa/workspace/FirstCry/src/main/resources/Config/Config.Properties");
		property=new Properties();
		property.load(fis);
		return property;
	}
}
