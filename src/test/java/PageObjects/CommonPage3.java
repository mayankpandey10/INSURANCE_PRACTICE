package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CommonPage3 extends BasePage {
	
	public CommonPage3(WebDriver driver)
	{
		super(driver);
	}
	

    @FindBy(xpath="//input[@id='startdate']") WebElement startDate;
    @FindBy(xpath="//select[@id='insurancesum']") WebElement insurancesum;
    @FindBy(xpath="//select[@id='meritrating']") WebElement MeritRating;
    @FindBy(xpath="//select[@id='damageinsurance']") WebElement Damageinsurance;
    @FindBy(xpath="//label[normalize-space()='Euro Protection']//span[@class='ideal-check']") WebElement Protection;
    @FindBy(xpath="//select[@id='courtesycar']") WebElement countesycar;
    @FindBy(xpath="//button[@id='nextselectpriceoption']") WebElement next;
    
    public void txtstartdate(String Date)
    {
    	startDate.sendKeys(Date);
    }
    
    public void drpinsuranceS(int ins)
    {
    	Select insuranceS=new Select(insurancesum);
    	insuranceS.selectByIndex(ins);
    }
    
    public void drpMeritR(int MR)
    {
    	Select Merit=new Select(MeritRating);
    	Merit.selectByIndex(MR);
    }
    
    public void drpDI(int DI)
    {
    	Select damageins=new Select(Damageinsurance);
    	damageins.selectByIndex(DI);
    }
    
    public void optionalprotection()
    {
    	Protection.click();
    }
	
    public void drpcountesycar(int CO)
    {
    	Select countsy=new Select(countesycar);
    	countsy.selectByIndex(CO);
    }
    
    public void clicknext()
    {
    	next.click();
    }
}
