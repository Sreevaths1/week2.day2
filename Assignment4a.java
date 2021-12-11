package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4a {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("sreevath@gmail.com");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("sreevath@gmail.com", Keys.TAB);	
		String text = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	    Boolean test =	driver.findElement(By.xpath("//input[@disabled='true']")).isDisplayed();
	    System.out.println(test);
		
}
}

