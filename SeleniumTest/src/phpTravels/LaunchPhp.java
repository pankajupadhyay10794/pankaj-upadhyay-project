package phpTravels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchPhp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String setProperty = System.setProperty("webdriver.chrome.driver", "C:\\Projects\\eclipse\\myPractice\\SeleniumTest\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.phptravels.net/home");
        driver.manage().window().maximize();
	}

}
