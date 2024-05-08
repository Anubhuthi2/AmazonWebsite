package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.qa.base.TestBase;

public class ProductListPage extends TestBase {
	
	@FindBy(xpath= "//span[contains(@class ,'a-size-base-plus a-color-base') and text() = 'boAt'][1]")
	WebElement BoAtWatch;
	
	@FindBy(xpath="//span[contains(@class ,'a-size-base-plus a-color-base') and text() = 'boAt'][1]/following::span[contains(text() ,'boAt Xtend Smart Watch with Alexa Built-in, 1.69” HD Display, Multiple Watch Faces, Stress Monitor, Heart & SpO2 Monitoring, 14 Sports Modes, Sleep Monitor, 5 ATM & 7 Days Battery(Pitch Black)')]")
    WebElement BoAtWatchClickableElement;	
	
	public ProductListPage(WebDriver driver ,WebDriverWait wait) {
		this.driver = driver;
		this.wait= wait;
		PageFactory.initElements(driver, this);
	}
		
	public void Ex_Wait(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
		
	public ProductPage findingParticularProduct(String brand) {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", BoAtWatch);
		BoAtWatchClickableElement.click();
		return new ProductPage();
	}
		
		
}
