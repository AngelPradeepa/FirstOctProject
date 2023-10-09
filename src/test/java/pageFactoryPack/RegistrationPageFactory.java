package pageFactoryPack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePack.BaseClass;

public class RegistrationPageFactory extends BaseClass {
	@FindBy(className="ico-register")
	public static WebElement register_link_clk;

	@FindBy(xpath="//h1[text()='Register']")
	public static WebElement register_text;

	@FindBy(xpath="//strong[text()='Your Personal Details']")
	public static WebElement personaldet_text;

	@FindBy(id="gender-female")
	public static WebElement radio_btn_chkbox;

	@FindBy(id="FirstName")
	public static WebElement first_nametextbox;

	@FindBy(id="LastName")
	public static WebElement last_nametextbox;

	@FindBy(name="DateOfBirthDay")
	public static WebElement birth_day;

	@FindBy(name="DateOfBirthMonth")
	public static WebElement birth_month;

	@FindBy(name="DateOfBirthYear")
	public static WebElement birth_year;

	@FindBy(id="Email")
	public static WebElement email_textbox;

	@FindBy(xpath="//strong[text()='Company Details']")
	public static WebElement comp_details_text;

	@FindBy(id="Company")
	public static WebElement company_txtbox;

	@FindBy(xpath="//strong[text()='Options']")
	public static WebElement options_text;

	@FindBy(xpath="//label[text()='Newsletter:']")
	public static WebElement newsletter_chkbox;

	@FindBy(xpath="//strong[text()='Your Password']")
	public static WebElement password_header;

	@FindBy(id="Password")
	public static WebElement pwd_txtbox;

	@FindBy(id="ConfirmPassword")
	public static WebElement confirm_txtbox;

	@FindBy(id="register-button")
	public static WebElement register_button;

	@FindBy(xpath="//h1[text()='Register']")
	public static WebElement reg_text;

	//	@FindBy(xpath="//div[@class='page-body']/div[@class='result']")
	//	public static WebElement reg_comp_text;

	@FindBy(xpath="//a[text()='Continue']")
	public static WebElement continue_button;

	@FindBy(id="small-searchterms")
	public static WebElement searchButton;

	@FindBy(xpath="(//h2[@class='product-title'])[3]")
	public static WebElement pdt_title;

	@FindBy(id="add-to-cart-button-6")
	public static WebElement add_to_cart_btn;








}
