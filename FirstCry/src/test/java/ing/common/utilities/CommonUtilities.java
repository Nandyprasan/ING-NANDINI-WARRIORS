package ing.common.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Attributes;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import glueStepdef.StepDefinition;

public class CommonUtilities {
	public WebDriverWait wait;
	public WebElement element;
	public StepDefinition step;
	
	public void implicitwait(){
		step.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
	}
	
	public void explicitwait(By locator){
		wait=new WebDriverWait(step.driver, 2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void actionclass(){
		Actions action = new Actions(step.driver);
			
	}

	public void elementtobeclickable(WebElement element){
		if(element!=null){
			element.click();
		}
	}
}
