package pageFactoryPack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePack.BaseClass;

public class MyAccountScreenPageFactory extends BaseClass{
	@FindBy(xpath="//a[text()='My account']")
	public static WebElement lnk_Myaccount;
	
	@FindBy(xpath="//h1[text()='Welcome, Please Sign In!']")
	public static WebElement txt_MyaccountPageHeading;
	
	@FindBy(id="Email")
	public static WebElement txt_email;

	@FindBy(id="Password")
	public static WebElement txt_Password;

	@FindBy(id="RememberMe")
	public static WebElement cbk_RememberMe;
	
	@FindBy(xpath="//a[text()='Forgot password?']")
	public static WebElement lnk_ForgotPassword;
	
	@FindBy(xpath="//button[contains(@class,'login-button')]")
	public static WebElement btn_login;
	
	@FindBy(id="Email-error")
	public static WebElement txt_emailErrorMsg;
	
	@FindBy(xpath="//div[@class='message-error validation-summary-errors']")
	public static WebElement txt_ErrorMessage;
}
