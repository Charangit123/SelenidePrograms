package selenideBeginner;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import java.net.URL;
public class AuthPOPupHandle {

	@Test
	public void popauth() throws Exception {
		
//		open("https://the-internet.herokuapp.com/basic_auth");
//		$(By.xpath("//a[contains(text(),'Basic Auth')]")).click();
		Configuration.browser="firefox";
		open(new URL("https://the-internet.herokuapp.com/basic_auth"),"","admin","admin");
		Thread.sleep(3000);
		String name = $(By.cssSelector("div.example")).getText();
		System.out.println(name);
		Assert.assertTrue(name.contains("Congratulations! You must have the proper credentials."));
	}
}
