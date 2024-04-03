package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//private By txt_present = By.xpath("//span[contains(text(), 'Your Pages and profiles')]");

public class HomePage_PageFactory {
	WebDriver driver = null;
	
	@FindBy(xpath = "//span[contains(text(), 'Your Pages and profiles')]")
	WebElement txt_present;
	
	
	public HomePage_PageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); 	//this = HomePage_PageFactory.class
	}
	
	public void showText() {
		txt_present.isDisplayed();
	}

}
