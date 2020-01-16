package Hari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hariprasath\\eclipse-workspace\\Sample1\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.forever21.in/c/search?search_query=sneakers&page=1");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"divF21ProductList\"]/div[1]/div[1]/a/ul/li[1]/div/img")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@value='8']")).click();
		driver.findElement(By.xpath("//button[@id='add_to_cart']")).click();
		
	}

}
