package Com.demo;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.math.Quantiles.Scale;

public class SwiggieTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rutik\\Desktop\\eclipse\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(1000);
//		driver.findElement(By.className("r2iyh")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("mobile")).sendKeys("7666363958");
//        Thread.sleep(1000);	
//		driver.findElement(By.id("name")).sendKeys("Rutik Patil");
//		Thread.sleep(1000);	
//		driver.findElement(By.id("email")).sendKeys("rutikpatilrp3596@gmail.com");
//		Thread.sleep(1000);
//		driver.findElement(By.className("a-ayg")).click();
		driver.findElement(By.className("x4bK8")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("mobile")).sendKeys("9422911104");
		Thread.sleep(1000);
		driver.findElement(By.className("a-ayg")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Rishi Patil");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("rutikpatil9612@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.className("a-ayg")).click();
		System.out.print("Enter the OTP :-456123");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("otp")).sendKeys("456123");
		Thread.sleep(1000);
		driver.findElement(By.className("a-ayg")).click();		
		}

}
