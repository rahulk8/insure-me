/* package insuremeseleniumproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class insureMe {

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver","G:\\chrome-driver\\chromedriver.exe");
		 
		System.setProperty("webdriver.chrome.driver","//home//ubuntu//chromedriver-linux64//chromedriver");
		//System.setProperty("webdriver.chrome.driver","/var/lib/jenkins/chromedriver");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");
		chromeOptions.addArguments("--disable-dev-shm-usage");
		
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		//driver.get("http://localhost:8081/contact.html");
		driver.get("http://65.0.4.67:8084/contact.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("inputName")).sendKeys("Rahul Kumar");
		driver.findElement(By.id("inputNumber")).sendKeys("9711739491");
		driver.findElement(By.id("inputMail")).sendKeys("rahulpatna89@gmail.com");
		driver.findElement(By.id("inputMessage")).sendKeys("Hello Insurer");
		driver.findElement(By.id("my-button")).click();
		
		String message = driver.findElement(By.id("response")).getText();
		if(message.equals("Message Sent")) {
			System.out.println("Script Executed Successfully");
		} else 
		{
			System.out.println("Script Failed");
		}
		//take Screenshot of the result
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);
		//File destFile = new File ("C:\\chromedriver\\test-reports\\scr.png");
		File destFile = new File ("//home/ubuntu//scr.png");
		//File destFile = new File ("//var/lib/jenkins//scr.png");
		//File destFile = new File ("./scr.png");
		FileUtils.copyFile(screenShot, destFile);
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
} */
