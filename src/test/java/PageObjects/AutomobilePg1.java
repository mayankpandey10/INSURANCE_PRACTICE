package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AutomobilePg1 extends BasePage{
	
	public AutomobilePg1(WebDriver driver)
	{
		super(driver);
	}
	
    @FindBy(xpath="//input[@id='engineperformance']") WebElement EnginePerformence;
    @FindBy(xpath="//input[@id='listprice']") WebElement listPrice;
    @FindBy(xpath="//input[@id='annualmileage']") WebElement annualMileage;
    @FindBy(xpath="//select[@id='make']") WebElement SelectCompany;
    @FindBy(xpath="//input[@id='dateofmanufacture']") WebElement SelectDOM;
    @FindBy(xpath="//select[@id='numberofseats']") WebElement SelectNoOfSeats;
    @FindBy(xpath="//select[@id='fuel']") WebElement SelectFuletype;
    @FindBy(xpath="//button[@id='nextenterinsurantdata']") WebElement Next;
    
    public void typeEnginePerfo(String EP)
	{
    	EnginePerformence.sendKeys(EP);
	}
    
    public void typelistprice(String LP)
	{
    	listPrice.sendKeys(LP);
	}
    
    public void typeAnualMileage(String AM)
	{
    	annualMileage.sendKeys(AM);
	}
    
    public void selectDateofManu(String DOM)
	{
    	SelectDOM.sendKeys(DOM);
	}
    
    public void drpSelectMake(String Cname)
	{
		Select drpcompany= new Select(SelectCompany);
		drpcompany.selectByValue(Cname);
	}
    
    public void drpSelectSeat(int seat)
	{
		Select drpNoSeat=new Select(SelectNoOfSeats);
		drpNoSeat.selectByIndex(seat);
	}
    
    public void drpSelectfueltype(String FT)
	{
		Select drpfueltype=new Select(SelectFuletype);
		drpfueltype.selectByValue(FT);
	}
    
    public void ClickNext()
	{
		Next.click();
	}
    
}
