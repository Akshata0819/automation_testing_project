package webFormSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_WebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("testing...");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement we = driver.findElement(By.xpath("//h1[@class='display-6']"));
		
		String first_name = we.getText();
		
		System.out.println(first_name);
		
		if(first_name.equals("Web form")) {
			
			
			System.out.println("Test case is pass!!");
		}
		
		else {
			
			System.out.println("test case is fail!!");
			
		}
		driver.findElement(By.id("my-text-id")).sendKeys("Hello");
		
		driver.findElement(By.name("my-password")).sendKeys("Hello123");
		
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Return to index")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("blank.html")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		WebElement we1 = driver.findElement(By.name("my-select"));
		
		Select sel = new Select(we1);
		sel.selectByValue("3");
		
		//sel.selectByVisibleText("Two");
		driver.findElement(By.name("my-file")).sendKeys("C:\\Users\\aksha\\OneDrive\\Desktop\\RegularV.pptx");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("my-check-1")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
}

}
