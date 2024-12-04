package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CommonPage2;
import PageObjects.CommonPage3;
import PageObjects.HomePage;
import PageObjects.MotorCyclePg1;
import TestBase.BaseClass;

public class TC_03Motorcycle extends BaseClass
{
	@Test
	public void Motorinsurance()
	{
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMoterCycle();
		
		MotorCyclePg1 mc=new MotorCyclePg1(driver);
		
		mc.selectCompany("BMW");
		mc.selectModel("Motorcycle");
		mc.txtCC("1500");
		mc.txtEnginePerf("1234");
		mc.intDOM("01/03/2021");
		mc.selectNoOfSeat(2);
		mc.txtListPrice("55000");
		mc.txtAnnualMilage("76500");
		mc.clickNXT();
		
		
		CommonPage2 cp2=new CommonPage2(driver);
		
		cp2.txtFstName("John");
		cp2.txtlstName("Cooper");
		cp2.EnterBirthDOB("12/07/1994");
		cp2.drpCountry("United States");
		cp2.txtZipcode("234501");
		cp2.Occupation("Employee");
		cp2.selecthobbies();
		cp2.clickNXt();
		
		CommonPage3 cp3=new CommonPage3(driver);
				
		cp3.txtstartdate("12/01/2025");
		cp3.drpinsuranceS(8);
		cp3.drpDI(3);
		cp3.optionalprotection();
		cp3.clicknext();
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
	}
}
