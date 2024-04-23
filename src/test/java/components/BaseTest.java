package components;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;



public class BaseTest {
	WebDriver driver;

	public  BaseTest(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "emailAddress")
	WebElement userEmail;
	
	@FindBy(id ="password")
	WebElement passwordEle;
	
	@FindBy(id = "confirmPassword")
	WebElement confirmPasswordEle;
	
	@FindBy(xpath = "//*[text()='Next']")
	WebElement next;
	
	@FindBy(id = "firstName")
	WebElement firstname;
	
	@FindBy(id = "lastName")
	WebElement lastname;
	
	@FindBy(id = "addressLine1")
	WebElement address1;
	
	@FindBy(id = "postcode")

	WebElement postalcode;
	
	@FindBy(id = "city")
	WebElement City;
	
	@FindBy(css = "[formcontrolname='state']")
	WebElement State;
	
	@FindBy(id = "cardHolderName")
	WebElement cardHolderField;
	
	@FindBy(id = "cardTypeMastercard")
	WebElement cardType;
	
	@FindBy(id = "cardNumber")
	WebElement cardNumberField;
	
	@FindBy(id = "cardCVV")
	WebElement cvvField;

	@FindBy(id = "cardExpiryMonth")
	WebElement expiryMonth;
	
	@FindBy(id = "cardExpiryYear")
	WebElement expiryYear;
	

    
  
	
	
	
	
	
//@BeforeTest(alwaysRun=true)
	public void goTo()

	{
	driver.manage().window().maximize();	
	driver.get("https://orikan-ui-automation-test.azurewebsites.net/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	public void registration(String username, String password, String confirmPassword)
	{
		userEmail.sendKeys(username);
		passwordEle.sendKeys(password);
		confirmPasswordEle.sendKeys(confirmPassword);
		next.click();
		
	}
	public void contactPage(String firstName, String lastName, String addressLine1, String postalCode, String city, String state)
	{
		firstname.sendKeys(firstName);
		lastname.sendKeys(lastName);
		address1.sendKeys(addressLine1);
		postalcode.sendKeys(postalCode);
		City.sendKeys(city);
		Select select = new Select(State);
		select.selectByVisibleText(state);
		next.click();
	}
	public void paymentPage(String CardHolder, String cardNumber, String cvv, String cardExpiryMonth, String cardExpiryYear)
	{
		  cardHolderField.sendKeys(CardHolder);
		  cardType.click();
		  cardNumberField.sendKeys(cardNumber);
		   cvvField.sendKeys(cvv);
		   Select selectMonth = new Select(expiryMonth);
		   selectMonth.selectByVisibleText(cardExpiryMonth);
		   expiryYear.sendKeys(cardExpiryYear);
		   next.click();
		   
	}
	
	
	
	
	private CharSequence ParseInt(int cardNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	@AfterTest(alwaysRun=true)
	public void tearDown()
	{
		driver.quit();
	}





}
