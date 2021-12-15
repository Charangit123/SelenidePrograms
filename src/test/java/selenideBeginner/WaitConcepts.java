package selenideBeginner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import java.time.Duration;

public class WaitConcepts {

	@Test
	public void Waits() throws Exception {
		
		open("https://cogmento.com/login.html");
		Configuration.timeout=6000;// default timeout is 4 seconds in selenide
		SelenideElement user = $(By.id("contact-name"));
		
		user.should(Condition.enabled,Duration.ofSeconds(20)).sendKeys("Charan");
		actions().moveToElement($(By.cssSelector("span.fa-facebook-f"))).click().build().perform();
		Thread.sleep(3000);
		
	}
}
