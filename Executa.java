package executa;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import driver.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/feature",
		glue = "teste",
		tags = "@teste2",
		plugin = {"pretty","html:target/report-cucumber.html"},
		monochrome = true,
		dryRun = true,
		snippets = SnippetType.CAMELCASE
	
		)

public class Executa extends Driver {

	public static void abrirNavegador() {

		String site = "https://www.correios.com.br/";
		WebDriverManager.chromedriver().setup();

		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("star-maximized");

		driver = new ChromeDriver(chromeoptions);
		driver.get(site);

	}
	
	public static void fecharNavegador() {
		
		driver.quit();
		
	}
	public static void evidencia(String evidencias) throws IOException {
		
		TakesScreenshot scrshot = (TakesScreenshot) driver;
		File scrfile = scrshot.getScreenshotAs(OutputType.FILE);
		File destfile = new File ("./evidencia/"+ evidencias +".png");
		FileUtils.copyFile(scrfile, destfile);
	}
}
