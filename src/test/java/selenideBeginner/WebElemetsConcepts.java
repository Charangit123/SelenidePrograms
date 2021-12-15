package selenideBeginner;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class WebElemetsConcepts {

	@Test
	public void elements() {
		
		open("https://www.amazon.in/");
		ElementsCollection links = $$(By.tagName("a"));
		System.out.println(links.size());
		
//		for(SelenideElement link: links) {
//			System.out.println(link.getText()+"-->"+link.getAttribute("href"));
//		}
		
		links.shouldHave(CollectionCondition.sizeLessThan(400));
//		links.forEach(e -> System.out.println(e.getText()));
//		links.stream().filter(e ->! e.getText().isEmpty()).forEach(e -> System.out.println(e.getText()));
		System.out.println("----------------");
		links.last(10).forEach(e -> System.out.println(e.getText()));
		
	}
}
