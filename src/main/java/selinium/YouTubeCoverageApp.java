package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class YouTubeCoverageApp {
	public WebDriver driver;
	
	public YouTubeCoverageApp() {
		WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
		this.driver = new ChromeDriver();
		this.driver.get("https://www.youtube.com/shorts/_U8JYKqKJ9s"); // Baby Shark
		this.driver.findElement(By.cssSelector("button[class='ytp-large-play-button ytp-button']"
				+ "[aria-label = 'Play']")).click();
}

	public void shutDown() throws InterruptedException  {
	    Thread.sleep(2000);  // Let the user actually see something!
	    this.driver.quit();
	}
	
}
