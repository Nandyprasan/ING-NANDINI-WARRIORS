package ing.firstcry.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.sun.tools.internal.xjc.Driver;

import glueStepdef.StepDefinition;
import ing.common.utilities.CommonUtilities;

public class Homepage {
	StepDefinition step;
	CommonUtilities commonUtilities=new CommonUtilities();
	Actions action = new Actions(step.driver);
	
	@FindBy (id="deny")
	private WebElement homepopup;
	
	@FindBy(tagName="iframe")
	private WebElement framepopup;
	
	@FindBy (xpath="//li[@class='B14_42 allcat']/a[@href='/']")
	private WebElement allcategorieslink;
	
	@FindBy (xpath="//a[text()='All Categories']")
	private WebElement insideallcategorieslink;
	
	

	
	@FindBy(xpath="//a[text()='STORES & PLAYSCHOOLS']")
	private WebElement storeandplayschool;
	
	public void mouseoverallcateglink(String Linktoclick){
		commonUtilities.implicitwait();
//		step.driver.switchTo().frame(framepopup);
//		
//		System.out.println("switched to frame");
//		JavascriptExecutor exe = (JavascriptExecutor) step.driver;
//		exe.executeScript("document.getElementById('deny').click()");
	//	homepopup.click();
		step.driver.switchTo().defaultContent();
		if (Linktoclick.equalsIgnoreCase("All Categories")){
			{
   			action.moveToElement(allcategorieslink).perform();
   			action.sendKeys(Keys.PAGE_DOWN);
			}
		}
//		step.driver.switchTo().parentFrame();
		
		
	}	
	
	public void mouseoverstoreandplayschool(String Storesandplayschools){
if(insideallcategorieslink.isDisplayed()){
	action.moveToElement(insideallcategorieslink).perform();
	
	if(Storesandplayschools.equalsIgnoreCase("STORES & PLAYSCHOOLS")){
		action.moveToElement(storeandplayschool).perform();
		}

		}
			}
}
