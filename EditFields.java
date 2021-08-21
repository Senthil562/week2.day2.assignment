package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("Senthil");
		WebElement newfield= driver.findElement(By.xpath("(//div[@class='row'])[2]//input"));
		newfield.sendKeys("Kumar");
		newfield.sendKeys(Keys.TAB);
		String attribute = driver.findElement(By.xpath("(//div[@class='row'])[3]//input")).getAttribute("value");
		System.out.println("The attribute value is : "+attribute);
	
		driver.findElement(By.xpath("(//div[@class='row'])[4]//input")).clear();
		
		boolean enabled = driver.findElement(By.xpath("(//div[@class='row'])[5]//input")).isEnabled();
		if(enabled!=true) {
			System.out.println("Edit Field is disabled");
		}
		else {
			System.out.println("Edit Field is not disabled");
		}		
	}
}