package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MotorCyclePg1 extends BasePage{
	
	public MotorCyclePg1(WebDriver driver)
	{
		super(driver);
	}
	

    @FindBy(xpath="//select[@id='make']") WebElement SelectCompany;
    @FindBy(xpath="//select[@id='model']") WebElement SelectModel;
    @FindBy(xpath="//input[@id='cylindercapacity']") WebElement cylinderCapacity;
    @FindBy(xpath="//input[@id='engineperformance']") WebElement EnginePerf;
    @FindBy(xpath="//input[@id='dateofmanufacture']") WebElement DateOM;
    @FindBy(xpath="//select[@id='numberofseatsmotorcycle']") WebElement NoOfSeat;
    @FindBy(xpath="//input[@id='listprice']") WebElement listPrice;
    @FindBy(xpath="//input[@id='annualmileage']") WebElement annualMileage;
    @FindBy(xpath="//button[@id='nextenterinsurantdata']") WebElement next;
	
    
    public void selectCompany(String Cname) 
    {
    	Select drpcompany=new Select(SelectCompany);
    	drpcompany.selectByValue(Cname);
    }
    
    public void selectModel(String Vmodel) 
    {
    	Select drpModel=new Select(SelectModel);
    	drpModel.selectByValue(Vmodel);
    }
    
    public void txtCC(String CC) 
    {
    	cylinderCapacity.sendKeys(CC);
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
    	Select drpNOS=new Select(NoOfSeat);
    	drpNOS.selectByIndex(NOS);
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
