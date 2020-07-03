package phpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchPhp {

	public static void main(String[] args) throws InterruptedException {
		// Initializing Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\eclipse\\myPractice\\SeleniumTest\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        
        //launching the website
        driver.get("https://www.phptravels.net/home");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //perform operations on the site
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("imagelogo")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Got it!']")));
        driver.findElement(By.xpath("//button[text()='Got it!']")).click(); 
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Flights')]")));
        driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
        driver.findElement(By.xpath("//label[@for='flightSearchRadio-1']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("chosen-single")));
        driver.findElement(By.className("chosen-single")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Business')]")));
        driver.findElement(By.xpath("//li[contains(text(),'Business')]")).click();
        
        driver.findElement(By.id("s2id_location_from")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@class,'select2-input')])[6]")));
        driver.findElement(By.xpath("(//input[contains(@class,'select2-input')])[6]")).sendKeys("PNQ");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='PNQ']")));
        driver.findElement(By.xpath("//span[text()='PNQ']")).click();
        driver.findElement(By.id("s2id_location_to")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@class,'select2-input')])[6]")));
        driver.findElement(By.xpath("(//input[contains(@class,'select2-input')])[6]")).sendKeys("AMD");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'AMD')]")));
        driver.findElement(By.xpath("//span[contains(text(),'AMD')]")).click();
        driver.findElement(By.id("FlightsDateStart")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@data-action ='next'])[8]")));
        driver.findElement(By.xpath("(//div[@data-action ='next'])[8]")).click(); 
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@data-date='12'])[8]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@data-date='12'])[8]")));
        driver.findElement(By.xpath("(//div[@data-date='12'])[8]")).click();
        driver.findElement(By.id("FlightsDateEnd")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@data-action ='next'])[9]")));
        driver.findElement(By.xpath("(//div[@data-action ='next'])[9]")).click(); 
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@data-date='20'])[9]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@data-date='20'])[9]")));
        driver.findElement(By.xpath("(//div[@data-date='20'])[9]")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='fadults']/following::span[1]/button[2]")));
        driver.findElement(By.xpath("//input[@name='fadults']/following::span[1]/button[1]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='fchildren']/following::span[1]/button[2]")));
        driver.findElement(By.xpath("//input[@name='fchildren']/following::span[1]/button[1]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='finfant']/following::span[1]/button[2]")));
        driver.findElement(By.xpath("//input[@name='finfant']/following::span[1]/button[1]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='submit'])[2]")));
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        Thread.sleep(30000);
        driver.close();

        
	}

}
