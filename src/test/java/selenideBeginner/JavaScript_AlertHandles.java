package selenideBeginner;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class JavaScript_AlertHandles {

	@Test
	public void popup() {
		
		open("https://mail.rediff.com/cgi-bin/login.cgi");
		$("input[name='proceed']").click();
		
//		WebDriverRunner.getWebDriver().switchTo().alert();
	System.out.println(switchTo().alert().getText());
	Assert.assertEquals(switchTo().alert().getText(), "Please enter a valid user name");
	switchTo().alert().accept();
//		switchTo().alert().dismiss();
//		switchTo().alert().sendKeys("charan");
		
	}
}
