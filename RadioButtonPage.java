package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("yes")).click();
		boolean unchecked = driver.findElement(By.xpath("//label[text()='Find default selected radio button']//following::input[1]")).isSelected();
		boolean checked = driver.findElement(By.xpath("//label[text()='Find default selected radio button']//following::input[2]")).isSelected();
		if(checked=true) {
			System.out.println("selected radio button value is checked by default ");
		}
		else if(unchecked=true) {
			System.out.println("selected radio button value is unchecked by default");
		}
		else {
			System.out.println("The radio button not checked any value");
		}
		boolean selected = driver.findElement(By.xpath("(//div[@class='row'])[3]//input[1]")).isSelected();
		boolean selected2 = driver.findElement(By.xpath("(//div[@class='row'])[3]//input[2]")).isSelected();
		boolean selected3 = driver.findElement(By.xpath("(//div[@class='row'])[3]//input[3]")).isSelected();
		if(selected||selected2||selected3==true) {
			System.out.println("By Default a value is selected");
		}
		else {
			driver.findElement(By.xpath("(//div[@class='row'])[3]//input[1]")).click();
		}
		
		
	}

}