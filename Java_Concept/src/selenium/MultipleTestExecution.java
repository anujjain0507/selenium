package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleTestExecution {
	
	WebDriver driver;
	
	
	
	@Test
	@Parameters("browser")
	
	
	public void verifypageTitle(String browser) {
        try {
            if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\jain.anuj\\workspace\\FreeCRM\\Driver\\geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\jain.anuj\\workspace\\FreeCRM\\Driver\\chromedriver.exe");
                driver = new ChromeDriver();
            }
        } catch (WebDriverException e) {
            System.out.println(e.getMessage());
        }
        driver.get("http://www.google.com");
        String title_name=driver.getTitle();
        System.out.println(title_name);
	}

}
