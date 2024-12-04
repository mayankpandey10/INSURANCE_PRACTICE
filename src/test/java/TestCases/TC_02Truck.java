package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CommonPage2;
import PageObjects.CommonPage3;
import PageObjects.HomePage;
import PageObjects.TruckPg1;
import TestBase.BaseClass;

public class TC_02Truck extends BaseClass
{
	@Test
	public void Truckinsurance()
	{
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickTruch();
		
		TruckPg1 tp=new TruckPg1(driver);
		
		tp.selectCompany("Volvo");
		tp.txtEnginePerf("1500");
		tp.intDOM("12/12/2020");
		tp.selectNoOfSeat(3);
		tp.selectFuelType("Diesel");
		tp.txtpayload("6000");
		tp.TxtVechicalWeight("30000");
		tp.txtListPrice("90000");
		tp.txtAnnualMilage("60000");
		tp.clickNXT();
		
		CommonPage2 cp2=new CommonPage2(driver);
		
		cp2.txtFstName("David");
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
