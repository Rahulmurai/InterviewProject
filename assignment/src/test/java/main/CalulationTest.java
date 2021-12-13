package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.compnents.Cal_Ob;
import main.compnents.Cal_ob_Add;
import main.compnents.Call_Ob_Divi;
import main.compnents.Call_ob_sub;

public class CalulationTest {
	WebDriver driver = null;

	WebDriver browseropen() {

		String url = "https://www.calculator.net/";
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.navigate().to(url);

		return driver;
	}

	void closeBrowser(WebDriver driver) {
		driver.close();
	}

	@Test
	public void Multi_function() {
		browseropen();
		String result = Cal_Ob.multiplication(driver).getText();
		closeBrowser(driver);
		Assert.assertEquals(result, " 222075");

		System.out.println("Multiplication result :" + result);
	}

	@Test
	public void divis_function() {
		browseropen();
		String divresult = Call_Ob_Divi.division(driver).getText();
		closeBrowser(driver);
		Assert.assertEquals(divresult, " 20");
		System.out.println("Division result:" + divresult);
	}

	@Test
	public void addition_function() {
		browseropen();
		String addResult = Cal_ob_Add.addition(driver).getText();
		closeBrowser(driver);
		Assert.assertEquals(addResult, " 111111");
		System.out.println("addition result :" + addResult);

	}

	@Test
	public void sub_function() {
		browseropen();
		String subresult = Call_ob_sub.substraction(driver).getText();
		closeBrowser(driver);
		Assert.assertEquals(subresult, " 23329646");
		System.out.println("substrsction result:" + subresult);
	}

}