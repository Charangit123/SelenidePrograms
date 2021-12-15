package selenideBeginner;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class WindowHandle {

	@Test
	public void handle() throws Exception {
		open("https://opensource-demo.orangehrmlive.com/");
		System.out.println("main-->"+title());
		$("img[alt='OrangeHRM on youtube']").click();
		
		switchTo().window(1);
		System.out.println("youtube-->"+title());
		
		closeWindow();// driver.close();
		switchTo().window(0);
		$("img[alt='LinkedIn OrangeHRM group']").click();

		System.out.println("main-->"+title());
		switchTo().window(1);
	
		
		System.out.println("Linkdin-->"+title());
		Thread.sleep(3000);
		closeWebDriver();//driver.quit();
		
	}
}
