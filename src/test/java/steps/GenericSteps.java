package steps;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;

public class GenericSteps {
	@Before
	
	public void abreNavegador() {
		Driver.abreNavegador();
	}
	
	@After
	public void fechaNavegador(Scenario cenario) {
		System.out.println(cenario.getName()+ " Status: "+ cenario.getStatus());
		
		Driver.fechaNavegador();
	}
	
	@Dado("que esteja na pagina {string}")
	public void queEstejaNaPagina(String url) throws InterruptedException{
		Driver.driver.get(url);
	}

	
	


}
