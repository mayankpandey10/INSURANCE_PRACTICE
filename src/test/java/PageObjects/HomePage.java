package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='main-navigation']//a[@id='nav_automobile']") WebElement lnkAutomobile ;
	@FindBy(xpath="//div[@class='main-navigation']//a[@id='nav_truck']") WebElement lnkTruck ;
	@FindBy(xpath="//div[@class='main-navigation']//a[@id='nav_motorcycle']") WebElement lnkMoterCycle ;
	@FindBy(xpath="//div[@class='main-navigation']//a[@id='nav_camper']") WebElement lnkCamper ;
	
	public void clickAutomobile()
	{
		lnkAutomobile.click();
	}
	
	public void clickTruch()
	{
		lnkTruck.click();
	}
	
	public void clickMoterCycle()
	{
		lnkMoterCycle.click();
	}
	
	public void clickCamper()
	{
		lnkCamper.click();
	}
	
	
}
