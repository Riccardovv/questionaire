package com.questionaire.quetionairebackend;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuetionairebackendApplicationTests {
	public static void main(String[] args) throws InterruptedException {

	}
	@Test
	void testLoginGoesToRightPage()throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:3000/");

		WebElement username= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));

		username.sendKeys("admin");
		password.sendKeys("admin");
		WebElement submitButton= driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/button"));
		submitButton.click();
		try {
			driver.wait(100);
		}catch (IllegalMonitorStateException e){
			System.out.print(e);
		}

		Assertions.assertEquals("http://localhost:3000/Questionaire",driver.getCurrentUrl());
	}

	@Test
	void testRegister()throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:3000/");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/div[3]/div/a")).click();

		WebElement fristname= driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		WebElement lastname= driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		WebElement email= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement pass= driver.findElement(By.xpath("//*[@id=\"password\"]"));

		fristname.sendKeys("testUser");
		lastname.sendKeys("testUser");
		email.sendKeys("testUser");
		pass.sendKeys("testUser");

		WebElement submitButton= driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/button"));
		submitButton.click();
		try {
			driver.wait(100);
		}catch (IllegalMonitorStateException e){
			System.out.print(e);
		}

		Assertions.assertEquals("http://localhost:3000/Questionaire",driver.getCurrentUrl());
	}

	@Test
	void testLogoutGoesToStarPage()throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:3000/");

		WebElement username= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));

		username.sendKeys("admin");
		password.sendKeys("admin");
		WebElement submitButton= driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/button"));
		submitButton.click();
		try {
			driver.wait(100);
		}catch (IllegalMonitorStateException e){
			System.out.print(e);
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/header/div/button")).click();

		Assertions.assertEquals("http://localhost:3000/",driver.getCurrentUrl());
	}

	@Test
	void testQuestionaireCompletion()throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:3000/");

		WebElement username= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));

		username.sendKeys("admin");
		password.sendKeys("admin");
		WebElement submitButton= driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/button"));
		submitButton.click();
		driver.findElement(By.xpath("//*[@id=\"demo-simple-select\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click();

		//next btn
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/form/div/button")).click();
		


	}


}