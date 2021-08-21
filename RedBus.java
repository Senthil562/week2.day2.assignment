package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        driver.findElementById("src").sendKeys("Chennai");
        Thread.sleep(2000);
        driver.findElementById("src").sendKeys(Keys.ENTER);
        driver.findElementById("dest").sendKeys("Bangalore");
        Thread.sleep(2000);
        driver.findElementById("dest").sendKeys(Keys.ENTER);
        driver.findElementById("onward_cal").click();
        driver.findElementByXPath("//td[@class='current day']/following-sibling::td[2]").click();
        driver.findElementByXPath("//button[text()='Search Buses']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//i[@class='icon icon-close c-fs']").click();
        String text = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
        System.out.println("There are " + text + " are Found");
        driver.findElementByXPath("//label[@for='bt_SLEEPER'][1]").click();
        String text1 = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
        System.out.println("There are " + text1 + " are Found");
        driver.findElementByXPath("//label[@for='bt_AC' and @class='cbox-label']").click();
        String text2 = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
        System.out.println("There are " + text2 + " are Found");
}
}