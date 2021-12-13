package main.compnents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cal_Ob {

	private static WebElement element = null;

	public static WebElement multiplication(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		driver.findElement(// 2
				By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[3]/span[2]"))
				.click();
		driver.findElement(// 3
				By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[3]/span[3]"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[3]/span[4]"))
				.click();// *

		driver.findElement(
				By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[2]/span[2]"))
				.click();// 5

		driver.findElement(// 2
				By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[3]/span[2]"))
				.click();
		driver.findElement(// 5
				By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[2]/span[2]"))
				.click();

		element = driver
				.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[1]/td/div/div[2]"));

		return element;
	}

}