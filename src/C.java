import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		System.out.println("loading url");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		driver.close();

}
}
