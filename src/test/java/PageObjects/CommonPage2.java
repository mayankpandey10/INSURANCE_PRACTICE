package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CommonPage2 extends BasePage {
	
	public CommonPage2(WebDriver driver)
	{
		super(driver);
	}
	
    @FindBy(xpath="//input[@id='firstname']") WebElement firstName;
    @FindBy(xpath="//input[@id='lastname']") WebElement lastName;
    @FindBy(xpath="//input[@id='birthdate']") WebElement BirthDOB;
    @FindBy(xpath="//select[@id='country']") WebElement country;
    @FindBy(xpath="//input[@id='zipcode']")WebElement zipCode;
    @FindBy(xpath="//select[@id='occupation']") WebElement occupation;
    @FindBy(xpath="//label[normalize-space()='Speeding']//span[@class='ideal-check']")WebElement hobbies;
    @FindBy(xpath="//button[@id='nextenterproductdata']") WebElement next;
    
    public void txtFstName(String FN)
    {
    	firstName.sendKeys(FN);
    }
    
    public void txtlstName(String LN)
    {
    	lastName.sendKeys(LN);
    }
    
    public void EnterBirthDOB(String DOB)
    {
    	BirthDOB.sendKeys(DOB);
    }
    
    public void drpCountry(String COU)
    {
    	Select SelectC=new Select(country);
    	SelectC.selectByValue(COU);
    }
    
    public void txtZipcode(String ZC)
    {
    	zipCode.sendKeys(ZC);
    }
    
    public void Occupation(String occ)
    {
    	Select drpOcc=new Select(occupation);
    	drpOcc.selectByValue(occ);
    }
    
    public void selecthobbies()
    {
    	hobbies.click();
    }
    
    public void clickNXt()
    {
    	next.click();
    }
	
	
}
