package Keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Keyword1 {

	public static void openBrowser(String Browser) {
		switch (Browser) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\Testing Shastra\\JARs\\chromedriver.exe");
			Constants.driver = new ChromeDriver();
			break;
		case "FireFox":
			System.setProperty("webdriver.gecko.driver","D:\\Testing Shastra\\JARs\\geckodriver.exe");
			Constants.driver = new FirefoxDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver", "D:\\Testing Shastra\\JARs\\IEDriverServer.exe");
			Constants.driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("No such browser present....");
			break;
		}
	}


	public  static void maximiseWindow() {
		Constants.driver.manage().window().maximize();
	}
	
	public static void closeWindow() {
		Constants.driver.close();
	}
	
	public static void implicitelyWait() {
		Constants.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	
}