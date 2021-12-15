package selenideBeginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import java.util.concurrent.TimeUnit;

public class Frames {

	@Test
	public void frametest() throws Exception {
		open("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(5000);
		Configuration.startMaximized = true;
		
		$(By.id("name")).sendKeys("Charan");
//		WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		switchTo().frame("frm1");
		WebElement element = $(By.id("selectnav1"));
		Select select = new Select(element);
		select.selectByVisibleText("-- Automation Testing");
		Thread.sleep(3000);

		switchTo().defaultContent();
		$(By.id("name")).sendKeys("Charan");
		Thread.sleep(3000);

	}
}
