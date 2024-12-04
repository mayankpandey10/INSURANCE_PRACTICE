package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CamperPg1;
import PageObjects.CommonPage2;
import PageObjects.CommonPage3;
import PageObjects.HomePage;
import TestBase.BaseClass;

public class TC_04Camper extends BaseClass
{
	@Test
	public void Camperinsurance()
	{
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickCamper();
		
		CamperPg1 cp=new CamperPg1(driver);
		
		cp.selectCompany("Toyota");
		cp.txtEnginePerf("1800");
		cp.intDOM("12/03/2022");
		cp.selectNoOfSeat(8);
		cp.selectFuelType("Gas");
		cp.txtpayload("1000");
		cp.TxtVechicalWeight("43000");
		cp.txtListPrice("60000");
		cp.txtAnnualMilage("67000");
		cp.clickNXT();
		
		CommonPage2 cp2=new CommonPage2(driver);
		
		cp2.txtFstName("Scarllet");
		cp2.txtlstName("Babe");
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
