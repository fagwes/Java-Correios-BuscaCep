package metodos;

import org.openqa.selenium.By;

import executa.Executa;

public class Metodos extends Executa {

	public static void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public static void clicar(By elemento) {

		driver.findElement(elemento).click();

	}

	public static void enter(By elemento) {
		driver.findElement(elemento).submit();
	}

	public static void maximiza() {
		driver.manage().window().maximize();

	}

}