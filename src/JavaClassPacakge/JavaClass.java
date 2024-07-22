package JavaClassPacakge;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaClass {

	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest 
	
	public void BeforeTesting () {
		String URL = "https://smartbuy-me.com/smartbuystore/en/login";
		driver.get(URL);
		driver.manage().window().maximize();
		
	

				
	}
	
	@Test
	public void Test() {
		
		WebElement Tittle = driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[1]/div[1]/div/div/div/button"));
		
			WebElement FirstName = driver.findElement(By.id("register.firstName"));
			WebElement  LastName = driver.findElement(By.id("register.lastName"));
			WebElement Gender= driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[2]/div[1]/div/div/div/button"));
			WebElement ChooseGender = driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[2]/div[1]/div/div/div/div/ul/li[3]"));
			WebElement DateOfBirth = driver.findElement(By.id("dateOfBirth"));
			WebElement Code = driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[3]/div/div/div/button"));
			WebElement Mobile = driver.findElement(By.id("mobileNumber"));
			WebElement Email = driver.findElement(By.id("register.email"));
			WebElement Nationailty = driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[7]/div/div/div/button"));
			WebElement Passward = driver.findElement(By.id("password"));
			WebElement ConfirmPassward = driver.findElement(By.id("register.checkPwd"));


			
		
			
		FirstName.sendKeys("Muna");
		LastName.sendKeys("Jebril");
		Tittle.click();
		driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[1]/div[1]/div/div/div/div/ul/li[2]")).click();
		ChooseGender.click();
	
		System.out.println(FirstName);
	
		
		
	}
	
	
	
}
