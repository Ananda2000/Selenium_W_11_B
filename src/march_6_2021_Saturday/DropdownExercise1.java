package march_6_2021_Saturday;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExercise1 {

	
	public static void main(String [] args) {
		
			
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver webDrop321= new ChromeDriver();
	
	webDrop321.get("https://demoapp.skillrary.com/");
	webDrop321.manage().window().maximize();
	WebElement ele1=webDrop321.findElement(By.id("cars"));
	
	Select s12 = new Select(ele1);
	
	List<WebElement> opti1234 = s12.getOptions();
	int size123 =opti1234.size();
	s12.selectByIndex(0);
	s12.selectByIndex(1);
	s12.selectByIndex(3);
	System.out.println("The list of elements in dropdonw"+size123);
	
	for (WebElement webElement1234: opti1234) {
		System.out.println("inside for each loop");
		System.out.println(webElement1234.getText());
		
	}
	
	
	List<WebElement> webDrop32123 = s12.getAllSelectedOptions();
			
			for (WebElement webElement_0987: webDrop32123) {
				
				System.out.println("list of all selected options"+webElement_0987.getText());			
			}
	
	
	System.out.println("Display the 1st selected options"+s12.getFirstSelectedOption().getText());
	
	if (s12.isMultiple()) {
		s12.deselectAll();
		
	}
	
	}
}
