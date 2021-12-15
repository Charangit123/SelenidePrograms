package selenideBeginner;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.WebDriverRunner;

public class WebDriverRunner_Webdriver {

	@Test
	public void wedrvrinner() {
		open("https://opensource-demo.orangehrmlive.com/");
		
		WebDriverRunner.clearBrowserCache();
		System.out.println(WebDriverRunner.url());
		Assert.assertTrue(WebDriverRunner.url().contains("orange"));
		
//		System.out.println(WebDriverRunner.source());
		
		WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(WebDriverRunner.isChrome());
		
		
		if(WebDriverRunner.isChrome()) {
			System.out.println("chromedriver");
		}
		
		closeWindow();
		WebDriverRunner.getAndCheckWebDriver();
		System.out.println(WebDriverRunner.supportsJavascript());
		
		
		List<File> filelist =WebDriverRunner.getBrowserDownloadsFolder().files();
		System.out.println(filelist.size());
		Iterator<File> it =filelist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	} 
}
