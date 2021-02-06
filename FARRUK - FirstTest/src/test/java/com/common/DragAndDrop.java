package com.common;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException, IOException{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
			//using WebDriverManager to manage our Browser Driver
		//System.setProperty("webdriver.chrome.driver", ".Browser/chromedriver.exe");
			//.Browser folder with paths of our browsers
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
			//opens Chrome > goes to url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Droppable")).click();
			//clicks on the Droppable link

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
			//switchTo focus on the iframe
		Actions a = new Actions(driver);
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(1000);	//2 seconds for From-To

		WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));

		a.dragAndDrop(from, to).build().perform();
		//ScreenShort.Screens(driver, "FA-DragDrop");

		driver.switchTo().parentFrame();	//switchTo parentFrame
		//driver.switchTo().defaultContent();	//switchTo the main web frame, similar to parentFrame

		driver.findElement(By.linkText("Resizable")).click();
		//ScreenShort.Screens(driver, "FA-Resize");	//for screenshot we call screenshot
		driver.close();
			
		}
	}


