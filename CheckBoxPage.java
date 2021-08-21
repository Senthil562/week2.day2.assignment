		package week2.day2.assignment;

		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Dimension;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class CheckBoxPage {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				//
				WebDriverManager.chromedriver().setup();
				//
				ChromeDriver driver = new ChromeDriver();
				//
				driver.manage().window().maximize();
				//
				driver.get("http://leafground.com/pages/checkbox.html");
				//
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//
				//driver.findElement(By.xpath("(//input)[1]")).click();
				String[] languages = {"Java","VB","C","Naveen"};
				for(int i=0;i<languages.length;i++) {
					if(languages[i]=="Java") {
						driver.findElement(By.xpath("(//input)[1]")).click();
						System.out.println(languages[i] + " is selected as known language");
					}
					else if(languages[i]=="VB") {
						driver.findElement(By.xpath("(//input)[2]")).click();
						System.out.println(languages[i] + " is selected as known language");
					}
					else if(languages[i]=="SQL") {
						driver.findElement(By.xpath("(//input)[3]")).click();
						System.out.println(languages[i] + " is selected as known language");
					}
					else if(languages[i]=="C") {
						driver.findElement(By.xpath("(//input)[4]")).click();
						System.out.println(languages[i] + " is selected as known language");
					}
					else if(languages[i]=="C++") {
						driver.findElement(By.xpath("(//input)[5]")).click();
						System.out.println(languages[i] + " is selected as known language");
					}
					else {
						System.out.println("The give value is not listed in the language list");
					}
				}
				//
				boolean seleniumSelect = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']//following::input")).isSelected();
				if(seleniumSelect=true) {
					System.out.println("Selenium is checked");
				}
				else {
					System.out.println("Selenium is not checked");
				}
			}
		}