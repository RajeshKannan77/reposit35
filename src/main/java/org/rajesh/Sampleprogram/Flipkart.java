package org.rajesh.Sampleprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\user\\Desktop\\workspace\\Seleniumprograms\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");

	// driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("hjgjhgvkbv");
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

	WebElement element = driver.findElement(By.xpath("//a[@title='TVs & Appliances']"));

	Actions act = new Actions(driver);

	act.moveToElement(element).build().perform();
	element.click();

	Thread.sleep(2000);

	WebElement element1 = driver.findElement(By.xpath("//span[text()='Washing Machine']"));

	act.moveToElement(element1).build().perform();
	// element1.click();

	WebElement element2 = driver.findElement(By.xpath("//span[text()='Fully Automatic Front Load']"));

	act.moveToElement(element2).build().perform();

	String h = element2.getText();

	System.out.println(h);

	WebElement element3 = driver.findElement(By.xpath("//span[text()='Refrigerators']"));

	act.moveToElement(element3).build().perform();

	WebElement element4 = driver.findElement(By.xpath("//span[text()='Single Door']"));

	act.moveToElement(element4).build().perform();

	String g = element4.getText();

	System.out.println(g);
}
}