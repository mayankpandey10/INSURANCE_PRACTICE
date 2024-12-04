package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AutomobilePg1;
import PageObjects.CommonPage2;
import PageObjects.CommonPage3;
import PageObjects.HomePage;
import TestBase.BaseClass;

public class TC_01Automobile extends BaseClass
{
	
	@Test
	public void AutoInsurance()
	{
				
		try
		{
		
		HomePage hp=new HomePage(driver);
		hp.clickAutomobile();
				
		AutomobilePg1 am=new AutomobilePg1(driver);
				
		am.typeEnginePerfo("1500");
		am.typelistprice("250000");
		am.typeAnualMileage("10000");
		am.selectDateofManu("12/07/2022");
		am.drpSelectMake("Ford");
		am.drpSelectSeat(7);
		am.drpSelectfueltype("Petrol");
		am.ClickNext();
			
		CommonPage2 cp2=new CommonPage2(driver);
				
		cp2.txtFstName("John");
		cp2.txtlstName("Esclape");
		cp2.EnterBirthDOB("12/07/1994");
		cp2.drpCountry("United States");
		cp2.txtZipcode("234501");
		cp2.Occupation("Employee");
		cp2.selecthobbies();
		cp2.clickNXt();
		
		CommonPage3 cp3=new CommonPage3(driver);
				
		cp3.txtstartdate("12/01/2025");
		cp3.drpinsuranceS(8);
		cp3.drpMeritR(1);
		cp3.drpDI(3);
		cp3.optionalprotection();
		cp3.drpcountesycar(2);
		cp3.clicknext();
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
	}
	
}
