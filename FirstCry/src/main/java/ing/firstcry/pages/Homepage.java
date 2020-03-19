package ing.firstcry.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

import javax.xml.xpath.XPath;

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
	
	
	@FindBy (xpath="//li[@class='B14_42 allcat']/a[@href='/']")
	private WebElement allcategorieslink;
	
	@FindBy(css="button#deny")
	private WebElement homepopup;
	
	@FindBy(xpath="//a[text()='STORES & PLAYSCHOOLS']")
	private WebElement storeandplayschool;
	
	public void mouseoverallcateglink(String Linktoclick){
		if (Linktoclick.equalsIgnoreCase("All Categories")){
			{
				Actions action = new Actions(step.driver);
   			action.moveToElement(allcategorieslink).perform();
			}
		}
		Set<String> setpopup =step.driver.getWindowHandles();
		Iterator<String> iterator=setpopup.iterator();
		for(String id:setpopup){
			iterator.next();
		}
		
		
		commonUtilities.implicitwait();
		homepopup.click();
	}	
	
	public void mouseoverstoreandplayschool(String Storesandplayschools){
		if(Storesandplayschools.equalsIgnoreCase("STORES & PLAYSCHOOLS")){
		Actions action = new Actions(step.driver);
		action.moveToElement(storeandplayschool).perform();
		}
	}
}
