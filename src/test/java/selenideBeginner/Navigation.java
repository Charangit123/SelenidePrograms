package selenideBeginner;
import static com.codeborne.selenide.Selenide.*;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;

public class Navigation {

	@Test
	public void navigate_simulations() throws Exception {
		
		open("https://www.google.co.in/");
		System.out.println(title());
		
		open("https://www.linkedin.com/signup");
		System.out.println(title());
		
		back();
		System.out.println(title());

		Thread.sleep(3000);
		refresh();
		Thread.sleep(5000);
		
		forward();
		System.out.println(title());
		
	}
}
