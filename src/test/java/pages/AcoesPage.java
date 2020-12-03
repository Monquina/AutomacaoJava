package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Driver;

public class AcoesPage {
	
	public void preenchePequisa(CharSequence... valores) {

		String inpPesquisa = "input[title='Pesquisar']";
		WebElement pesquisar;
		
		pesquisar = Driver.driver.findElement(By.cssSelector(inpPesquisa));
		pesquisar.sendKeys(valores);	
}
	
	public String getValorAcao() {
		String spValor = "span[jsname ='vWLAgc']";
		String valor = Driver.driver.findElement(By.cssSelector(spValor)).getText();
		return valor;
	}
	
}

