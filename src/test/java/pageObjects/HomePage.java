package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement lnkMyAccount;

//@FindBy(xpath="//span[normalize-space()='Resiter']")
@FindBy(xpath="//a[normalize-space()='Register']")
WebElement lnkRegister;


public void clickMyaccount()
{
	lnkMyAccount.click();
}
	

public void lnkRegister()
{
	lnkRegister.click();
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
