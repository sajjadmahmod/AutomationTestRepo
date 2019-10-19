package Homeworkoct15;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import test.utilities.BrowserUtils;
import test.utilities.ConfigurationReader;
import test.utilities.Driver;

public class automation {
	@Before
	public void beforeMethod() {

		Driver.getDriver().get(ConfigurationReader.getProperty("octofURL"));
				

		Driver.getDriver().manage().window().maximize();

	}
	
	@Test
	public void iFramePractice() {
		Driver.getDriver().get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
		Driver.getDriver().findElement(By.id("txtUsername")).sendKeys("opensourcecms");
		Driver.getDriver().findElement(By.id("txtPassword")).sendKeys("opensourcecms"); 
		  
		 		
		 		Driver.getDriver().findElement(By.id("btnLogin")).click();
		 		Driver.getDriver().findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).isDisplayed(); 
		 				BrowserUtils.waitFor(3); 
		 				
		 				Driver.getDriver().findElement(By.xpath("//*[@id=\"admin\"]/a/span")).click();
		 				BrowserUtils.waitFor(3); 
		 				 		Driver.getDriver().switchTo().frame("rightMenu"); 
		 						Assert.assertTrue(Driver.getDriver().findElement(By.xpath("\"//*[@id=\\\"genInfoHeading\\\"]\"))")).isDisplayed()); 
		 				 		BrowserUtils.waitFor(3); 
		 				 		 
		 			 		
		 				 		 
		 				 		 
		 				 		Driver.getDriver().navigate().back(); 
		 				 
		 					
		 				 
		 						Driver.getDriver().findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click(); 



	}

}
