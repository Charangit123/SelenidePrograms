package selenideBeginner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class MouseActions {

	@Test
	public void mouse() throws Exception {

		open("https://www.spicejet.com/");
		SelenideElement addon=$(By.xpath(" //div[text()='Add-ons']"));
		actions().moveToElement(addon).build().perform();
		
		SelenideElement ele2 = $(By.xpath(" //div[text()='Visa Services']"));
//		actions().moveToElement(ele2).build().perform();
		ele2.click();
		Thread.sleep(6000);
	}
	@Test
	public void DragAndDrop() throws Exception {
		open("https://jqueryui.com/droppable/");
		
		switchTo().frame($(By.cssSelector("iframe.demo-frame")));
		SelenideElement drag =$(By.id("draggable"));
		SelenideElement drop =$(By.id("droppable"));
//		
//		actions()
//			.clickAndHold(drag)
//				.moveToElement(drop)
//					.release()
//						.build()
//							.perform();
		actions().dragAndDrop(drag, drop).build().perform();
		Thread.sleep(5000);
		
	}
	@Test
	public void ContextClick() throws Exception {
		open("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		SelenideElement rightclick=$(By.xpath("//span[.='right click me']"));
		actions().contextClick(rightclick).build().perform();
//		actions().contextClick().build().perform(); //performs right on somewhere on page
		Thread.sleep(4000);
	}
}
