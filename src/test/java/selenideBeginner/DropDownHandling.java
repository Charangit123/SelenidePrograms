package selenideBeginner;

import javax.management.openmbean.OpenDataException;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class DropDownHandling {

	@Test
	public void selectbox() throws Exception {

		open("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// select html tag
		$(By.id("Form_submitForm_Country")).selectOption(2);
		Thread.sleep(3000);
		$(By.id("Form_submitForm_Country")).selectOption("India");
		Thread.sleep(3000);

		$(By.id("Form_submitForm_Country")).selectOptionByValue("France");
		Thread.sleep(3000);

		// without selectOption
		ElementsCollection dropdownvalues = $$(By.cssSelector(" select#Form_submitForm_Country option"));
		System.out.println(dropdownvalues.size());
		dropdownvalues.forEach(e -> System.out.println(e.getText()));

		System.out.println("----------");

		for (SelenideElement ele : dropdownvalues) {
			String value = ele.getText();
			if (value.equals("Angola")) {
				ele.click();
				System.out.println(value);
				break;
			}
		}
	}
}
