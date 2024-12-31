package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//input[@id='input-firstname']")
WebElement txtFirstname;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement txtlastname;

@FindBy(xpath="//input[@id='input-email']")
WebElement txtEmail;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement txttelephone;

@FindBy(xpath="//input[@id='input-password']")
WebElement txtpassword;

@FindBy(xpath="//input[@id='input-confirm']")
WebElement txtconfirmpassword;

@FindBy(xpath="//input[@name='agree']")
WebElement chckdPolicy;

@FindBy(xpath="//input[@value='Continue']")
WebElement btnContinue;

@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
WebElement msgConfirmation;

public void setFirstName(String fname) {
	txtFirstname.sendKeys(fname);
}

public void setLastName(String lname) {
	txtlastname.sendKeys(lname);
}

public void setEmail(String email) {
	txtEmail.sendKeys(email);
}


public void setTelephone(String tel) {
	txttelephone.sendKeys(tel);
}

public void setPassword(String password) {
	txtpassword.sendKeys(password);
}

public void setconfirmPassword(String password) {
	txtconfirmpassword.sendKeys(password);
}


public void setPrivacyPolicy() {
	chckdPolicy.click();
}


public void clickContinue() {
	btnContinue.click();
}	
	
	
	
	public String getConfirmationMsg(){
		try
		{
			return (msgConfirmation.getText());
			
		}catch (Exception e) {
		return (e.getMessage());
	}
	
	}
	
	
	
	

}
