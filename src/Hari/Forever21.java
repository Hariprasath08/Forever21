package Hari;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forever21 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hariprasath\\eclipse-workspace\\Sample1\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.forever21.in/");
		driver.findElement(By.xpath("//*[@id=\"headerSearch\"]")).sendKeys("sneakers");
		Thread.sleep(3000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id=\"divF21ProductList\"]/div[1]/div[1]/a/ul/li[1]/div/img")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//a[@value='8']")).click();
	driver.findElement(By.xpath("//button[@id='add_to_cart']")).click();
	 String value1 = driver.findElement(By.xpath("//*[@id=\"product_infodet\"]/div/h2")).getText();
	 System.out.println(value1);
	 String value2 = driver.findElement(By.xpath("//*[@id=\"final_change_price\"]")).getText();
	 System.out.println(value2);
	 
	

	
	
	
	
	  
}
}
