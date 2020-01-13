package Hari;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forever21 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hariprasath\\eclipse-workspace\\Sample1\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.forever21.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"headerSearch\"]")).sendKeys("sneakers");
		Thread.sleep(3000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
    driver.findElement(By.xpath("//div[@class='productitem__slider']")).click();
}
}
