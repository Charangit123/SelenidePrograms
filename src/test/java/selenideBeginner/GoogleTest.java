package selenideBeginner;
import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Condition.*;
public class GoogleTest {

	@Test
	public void test1() {
		open("https://www.google.com/");
		$(By.name("q")).setValue("Saicharan Dasari");
		$(By.name("btnK")).click();
		$(By.id("logo")).shouldHave(Condition.appear);
		String textvalue = $(By.xpath("//h3[text()='Dasari Saicharan - Property Dealer in Hyderabad, Telangana']")).getText();
		System.out.println(textvalue);
		Assert.assertEquals(textvalue,"Dasari Saicharan - Property Dealer in Hyderabad, Telangana");
		int numStrings = $$(By.cssSelector("h3.LC20lb.MBeuO")).size();
		System.out.println(numStrings);
		
		$$(By.cssSelector("h3.LC20lb.MBeuO")).shouldHave(CollectionCondition.size(13));
		//inbulit assertions for cross checking don't have to use testng framework
	}
	
}
