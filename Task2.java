package Homeworkoct15;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import test.utilities.BrowserUtils;
import test.utilities.ConfigurationReader;
import test.utilities.Driver;

public class Task2 {
	 
	@Before
	
	 	public void beforeMethod() { 
			 
			
	 
	 
	 		Driver.getDriver().get(ConfigurationReader.getProperty("part2")); 
	 		Driver.getDriver().manage().window().maximize(); 
			BrowserUtils.waitFor(3); 


}
	@Test 
	 	public void clickMethod() { 
			 
	 		 
 		Driver.getDriver().findElement(By.xpath("//*[@id=\"ShopifyMainNav\"]/ul[1]/li[1]/a")).click(); 
 		Driver.getDriver().findElement(By.xpath("//*[@id=\"Main\"]/section[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[3]")).isDisplayed(); 
 		 		 
 	 		 
 	Driver.getDriver().findElement(By.xpath("//*[@id=\"Main\"]/section[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/a/small")).click(); 
 				 


	
	
	
	}
}