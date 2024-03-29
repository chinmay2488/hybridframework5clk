package chinmaykulkarni;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class webdriverutilites {
	 
	public void dropdown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
		
	}

	public void mousehover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void doubleclick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void rightclick(WebDriver driver,WebElement source,WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
		
	}
	
	public void switchrames(WebDriver driver) {
		driver.switchTo().frame(0);
		
	}
	
	public void switchbackframes(WebDriver driver) {
		driver.switchTo().defaultContent();
		
	}
	
	public void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
		
		
		
	}
	
	public void Switchingtabs(WebDriver driver) {
		 Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
	}
	
	public void scrollbar(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollby("+x+","+y+")");
		
	}
}

