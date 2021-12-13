package main.compnents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Call_Ob_Divi {
	private static WebElement element = null;

	public static WebElement division(WebDriver driver) {
		driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();// 4
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();// 0
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();// 0
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();// 0

		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[4]")).click();// div

		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();// 2
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();// 0
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();// 0
		// element = driver.findElement(By.xpath("//div[@id=\"sciOutPut\"]"));
		element = driver
				.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[1]/td/div/div[2]"));

		return element;
	}

}
