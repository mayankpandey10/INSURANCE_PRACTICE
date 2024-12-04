package TestBase;

import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

public static WebDriver driver;	

    @BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
	}
    
    @AfterClass
    public void teardown()
    {
    	driver.quit();
    }
    
    // generate random email
 	public String generateRandomString() {
         String randomString = generateRandomEmail(5); // Generates a random string of length 5
         return randomString + "@gmail.com";
     }

     // Custom method to generate a random string
     public String generateRandomEmail(int length) {
         String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
         SecureRandom random = new SecureRandom();
         StringBuilder result = new StringBuilder(length);

         for (int i = 0; i < length; i++) {
             int index = random.nextInt(characters.length());
             result.append(characters.charAt(index));
         }
         return result.toString();
     }
 	
  // Generates a random number
     public String generateRandomNumber() {
         String randomNum = generateRandomphone(5); // Generates a random string of length 5
         return randomNum;
     }

     // Custom method to generate a random string
     public String generateRandomphone(int length) {
         String characters = "0123456789";
         SecureRandom random = new SecureRandom();
         StringBuilder result = new StringBuilder(length);

         for (int i = 0; i < length; i++) {
             int index = random.nextInt(characters.length());
             result.append(characters.charAt(index));
         }
         return result.toString();
     }
     
     public String captureScreen(String tname) throws IOException {
         String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
         TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
         File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

         // Create the screenshots directory if it doesn't exist
         File screenshotDir = new File(System.getProperty("user.dir"), "screenshots");
         if (!screenshotDir.exists()) {
             screenshotDir.mkdirs();
         }

         // Construct the target file path
         File targetFile = new File(screenshotDir, tname + "_" + timeStamp + ".png");

         // Copy the screenshot to the target location
         FileUtils.copyFile(sourceFile, targetFile);

         return targetFile.getAbsolutePath();
     }
	
}
