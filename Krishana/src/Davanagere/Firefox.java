package Davanagere;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Punitha/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Harisha");
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Harisha");
}
}
	
