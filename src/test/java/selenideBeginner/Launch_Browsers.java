package selenideBeginner;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

public class Launch_Browsers {
	
	@Test
	public void lauch() {
		//defaultbrowser is chrome
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user1\\Learning\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
//		System.setProperty("selenide.browserBinary","C:\\Users\\user1\\Learning\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
//		System.setProperty("selenide.browser","firefox");
//		mvn clean install -Dselenide.browser="firefox"
		Configuration.browser="firefox";
		Configuration.headless=false;
		Configuration.startMaximized = true;
		Configuration.screenshots=false;		
		Configuration.baseUrl="https://www.google.co.in/";
		open("");//open("search?q=dasari+saicharan");
		
		$(By.name("q")).setValue("Youtube");
		$(By.name("btnK")).click();
		$(By.id("logo")).shouldHave(Condition.appear);
		String textvalue = $(By.xpath("//h3/a[contains(text(),'Music')]")).getText();
		System.out.println(textvalue);
		Assert.assertEquals(textvalue,"Music");
	}

}
