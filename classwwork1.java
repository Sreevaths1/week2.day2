package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

//import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class classwwork1
	
	{
		public static void main(String[] args)
		{
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input [@id='username']")).sendKeys("DemoSalesManager");
			driver.findElement(By.xpath("//input [@id='password']")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input [@value='Login']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
			
			driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
			driver.findElement(By.xpath("//input [@id='createLeadForm_companyName']")).sendKeys("Ez");
			driver.findElement(By.xpath("//input [@id='createLeadForm_firstName']")).sendKeys("Sreevathsav");
			driver.findElement(By.xpath("//input [@id='createLeadForm_lastName']")).sendKeys("Ammayappan");
			driver.findElement(By.xpath("//input [@name='submitButton']")).click();
		}
	}

	


