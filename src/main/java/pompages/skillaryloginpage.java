package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillaryloginpage {
	@FindBy(xpath="//a[text()=\" GEARS \"]")
	private WebElement geras;
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	public skillaryloginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void gerasbutton() {
		geras.click();
	}
	public void skillraryDemoapp() {
		demoapp.click();
	}

}
