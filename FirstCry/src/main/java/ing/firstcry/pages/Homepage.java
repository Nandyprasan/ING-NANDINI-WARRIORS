package ing.firstcry.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import glueStepdef.StepDefinition;
import ing.common.utilities.CommonUtilities;

public class Homepage {
	StepDefinition step;
	@FindBy (xpath="//a[text()='All Categories']")
	private WebElement allcategorieslink;
	
	public void mouseoverallcateglink(){
		
		Actions action = new Actions(step.driver);
		action.moveToElement(allcategorieslink);
	}		
}
