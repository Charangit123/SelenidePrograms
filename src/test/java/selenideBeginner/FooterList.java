package selenideBeginner;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.ElementsCollection;

public class FooterList {

	@Test
	public void footerlist() {
	open("https://www.freshworks.com/");
	ElementsCollection links = $$(By.xpath("//footer//ul/li/a"));
	System.out.println(links.size());
	
	links.last(10).forEach(e -> System.out.println(e.getText()));
	links.first(5).forEach(e-> System.out.println(e.getText()));
	
	
//	links.stream().forEach(e -> System.out.println(e.getText()));
//	links.forEach(e -> System.out.println(e.getText()));
	List<String> footlist =links.texts();
	footlist.forEach(e-> System.out.println(e));
	}
}
