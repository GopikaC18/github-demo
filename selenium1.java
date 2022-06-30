package com.mindtree.seleniumclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://www.amazon.in/ref=nav_logo");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("Refrigerator");
     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
     driver.get("https://www.amazon.in/Samsung-Direct-Refrigerator-RR19A241BGS-NL/dp/B08SC2ZTDP/ref=sr_1_3?keywords=Refrigerator&qid=1655992857&sr=8-3");
     WebElement price1=driver.findElement(By.xpath("//span[@class='a-offscreen']"));
     String pri=price1.getText();
     WebElement price2=driver.findElement(By.xpath("//span[@class='a-price-symbol']"));
     String prinext=price1.getText();
     System.out.println("Compare the prices of refrigerator in two tabs");
     if(prinext.equals(pri))
     {
    	 System.out.println("Same price");
     }
     else
     {
    	 System.out.println("Not same");
     }
     System.out.println("Weight of the item");
     WebElement weight=driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[79]"));
     System.out.println(weight.getText());
     
	}
   }