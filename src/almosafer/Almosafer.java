package almosafer;

import java.sql.Date;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class Almosafer extends parameter {
	
	WebDriver driver=new ChromeDriver();
	@BeforeTest
	
	public void beforeAlmosfer() {
	
	}
	
	@Test()
	public void testOne() throws InterruptedException { 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get(website[Randomindex]); //to open the web English or Arabic
		
		
		
		driver.findElement(By.id("uncontrolled-tab-example-tab-hotels")).click();
//		Thread.sleep(3000);
		if(driver.getCurrentUrl().contains("ar")) {
			driver.findElement(By.className("AutoComplete__Input")).sendKeys(arabicCity[randomindexCity]);
			driver.findElement(By.cssSelector("[data-testid='HotelSearchBox__SearchButton']")).click();
			driver.findElement(By.cssSelector("[data-testid='HotelSearchResult__sort__LOWEST_PRICE']")).click();
			Thread.sleep(3000);
			WebElement DivOfPRICE =driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]"));
			
			List <WebElement> myList =DivOfPRICE.findElements(By.className("Price__Value"));
			
			for(int i=0;i<myList.size();i++ ) {
				
				System.out.println(myList.get(i).getText());
			}
			
		
			WebElement flightDate=driver.findElement(By.cssSelector("[data-testid=\'FlightSearchBox__FromDateButton\']"));
			
			WebElement returnDate=driver.findElement(By.cssSelector("[data-testid=\'FlightSearchBox__ToDateButton\']"));
			
			int actualFlightDate= Integer.parseInt(flightDate.getText());

			int actualReturnDate= Integer.parseInt(returnDate.getText());
			
			myAssert1.assertEquals(actualFlightDate, expectedFlight);
			myAssert1.assertEquals(actualReturnDate, expectedReturn);
			myAssert1.assertAll();
			
			
			
			
			
			
		}else {
			driver.findElement(By.className("AutoComplete__Input")).sendKeys(englishCity[randomindexCity]);
			driver.findElement(By.cssSelector("[data-testid='HotelSearchBox__SearchButton']")).click();

			driver.findElement(By.cssSelector("[data-testid='HotelSearchResult__sort__LOWEST_PRICE']")).click();
			Thread.sleep(3000);
	WebElement DivOfPRICE =driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]"));
			
			List <WebElement> myList =DivOfPRICE.findElements(By.className("Price__Value"));
			
			for(int i=0;i<myList.size();i++ ) {
				
				System.out.println(myList.get(i).getText());
			
		}}

		
		
//		driver.findElement(By.className("cta__saudi")).click();
//		language assertion**************
//		String url =driver.getCurrentUrl();
//		
		SoftAssert Assert=new SoftAssert();
		
//		boolean toCheckLanguage=url.contains("en");   //true
//		Assert.assertEquals(toCheckLanguage, true);
		//currency assertion************************

		String cur=driver.findElement(By.cssSelector("[data-testid='Header__CurrencySelector']")).getText();
//		System.out.println(cur);
		
		Assert.assertEquals(cur, "SAR");

		
        Assert.assertAll();		
	
        
	
	
	
	}
	
	
	@AfterTest
	public void afterAlmosafer() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.close();
		
	}
	
	

}
