import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckGiPages {
	public static void main(String[] args) throws IOException, InterruptedException {
		String URL = "https://stage.tamm.abudhabi/";
		System.setProperty("webdriver.chrome.driver", "/Users/sakshigupta/Documents/ChromeDriver/chromedriver_102");
		WebDriver driver = new ChromeDriver();

		try {
			driver.get(URL);
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String text = driver.findElement(By.className("TPN-explore__btns")).getText();

		System.out.println(text);

	}

}
