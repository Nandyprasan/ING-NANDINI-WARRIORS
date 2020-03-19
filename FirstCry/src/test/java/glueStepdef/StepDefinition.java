package glueStepdef;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import ing.common.utilities.CommonUtilities;
import ing.firstcry.pages.Homepage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

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
	
	@When("User to Mouse Hover on \"(.*)\" link")
	public void user_to_Mouse_Hover_on_All_categories_link(String Linktoclick) {
		Homepage home=PageFactory.initElements(driver,Homepage.class);
		home.mouseoverallcateglink();
	    	}
	
	@And("User to Navigate to Stores and playschools")
	public void user_to_Navigate_to_Stores_and_playschools() {
		Homepage home=PageFactory.initElements(driver,Homepage.class);
		home.mouseoverstoreandplayschool();
	}
	
	
}
