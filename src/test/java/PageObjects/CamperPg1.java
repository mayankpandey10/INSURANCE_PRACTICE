package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CamperPg1 extends BasePage {
	
	public CamperPg1(WebDriver driver)
	{
		super(driver);
	}

    @FindBy(xpath="//select[@id='make']") WebElement SelectCompany;
    @FindBy(xpath="//input[@id='engineperformance']") WebElement EnginePerf;
    @FindBy(xpath="//input[@id='dateofmanufacture']") WebElement DateOM;
    @FindBy(xpath="//select[@id='numberofseats']") WebElement NumberOfSeat;
    @FindBy(xpath="//select[@id='fuel']") WebElement FuelType;
    @FindBy(xpath="//input[@id='payload']") WebElement payload;
    @FindBy(xpath="//input[@id='totalweight']") WebElement totalWeight;
    @FindBy(xpath="//input[@id='listprice']") WebElement listPrice;
    @FindBy(xpath="//input[@id='annualmileage']") WebElement annualMileage;
    @FindBy(xpath="//button[@id='nextenterinsurantdata']") WebElement next;
    
    
    public void selectCompany(String CName) 
    {
    	Select drpcountry=new Select(SelectCompany);
    	drpcountry.selectByValue(CName);
    }
	
    public void txtEnginePerf(String EP) 
    {
    	EnginePerf.sendKeys(EP);
    }
    
    public void intDOM(String DOM) 
    {
    	DateOM.sendKeys(DOM);
    }
    
    public void selectNoOfSeat(int NOS) 
    {
    	Select drpseat=new Select(NumberOfSeat);
    	drpseat.selectByIndex(NOS);
    }
    
    public void selectFuelType(String FT) 
    {
    	Select drpFT=new Select(FuelType);
    	drpFT.selectByValue(FT);
    }
    
    public void txtpayload(String PL) 
    {
    	payload.sendKeys(PL);
    }
    
    public void TxtVechicalWeight(String VW) 
    {
    	totalWeight.sendKeys(VW);
    }
    
    public void txtListPrice(String LP) 
    {
    	listPrice.sendKeys(LP);
    }
    
    public void txtAnnualMilage(String AM) 
    {
    	annualMileage.sendKeys(AM);
    }
    
    public void clickNXT() 
    {
    	next.click();
    }
}
