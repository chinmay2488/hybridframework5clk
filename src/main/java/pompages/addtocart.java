package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocart {
	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement cartbtn;
	
	public addtocart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void addtocartbtn() {
		cartbtn.click();
		
	}
	public WebElement getAddbtn() {
		return addbtn;
	}

}
