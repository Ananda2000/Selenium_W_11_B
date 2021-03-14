package march_6_2021_Saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExercise {

		public static void main(String [] args) {
			System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
			WebDriver webDrop= new ChromeDriver();
			webDrop.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_EAIaIQobChMI5Pqa-oab7wIVAUwrCh1a1Q4bEAAYASAAEgK7W_D_BwE_k_&ext_vrnc=hi&gclid=EAIaIQobChMI5Pqa-oab7wIVAUwrCh1a1Q4bEAAYASAAEgK7W_D_BwE");
			
			WebElement ele123 = webDrop.findElement(By.id("searchDropdownBox"));
		
			Select s1 = new Select(ele123);
			
			s1.selectByIndex(2);
			System.out.println("1st element - "+s1);
			s1.selectByValue("search-alias=amazon-devices");
			s1.selectByVisibleText("Amazon Fresh");
		
		}
}
