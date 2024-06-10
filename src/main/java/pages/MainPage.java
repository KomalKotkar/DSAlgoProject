package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	
	public static WebDriver driver;
  
	private By getStartedBtn = By.xpath("//button[text()='Get Started']");
	private By mainPageHeader = By.xpath("//h1");
	private By mainPageSubHeader = By.xpath("//p[contains(text(),'You are at the')]");
	
	public MainPage(WebDriver driver) {
		
		this.driver= driver;
		
		
	}
	public String mainPageTitle() {
		return driver.getTitle();
	}
	public boolean isDisplayedGetStartedBtn() {
		return driver.findElement(getStartedBtn).isDisplayed();
		
	}
	public void clickOnGetStartedBtn() {
		driver.findElement(getStartedBtn).click();
	}
	public String isDisplayedMainPageHeader() {
		return driver.findElement(mainPageHeader).getText();
	}
	public String isDisplayedMainPageSubHeader() {
		return driver.findElement(mainPageSubHeader).getText();
	}
}
