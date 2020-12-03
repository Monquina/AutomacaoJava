package steps;


import org.openqa.selenium.Keys;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.AcoesPage;

public class AcoesSteps {

		private String acao;
		private AcoesPage acoesPage = new AcoesPage();
		

		@Quando("preencho o campo pesquisa com {string}")
		public void preenchoOCampoPesquisaCom(String acao) {			
			this.acao = acao;		
			acoesPage.preenchePequisa(acao);				    
		}
		
		@Quando("envio a tecla Enter")
		public void envioATeclaEnter() {		    	
			acoesPage.preenchePequisa(Keys.ENTER);
		}
		
		@Então("exibe o valor da acao")
		public void exibeOValorDaAcao() {
			System.out.println(acao + "o valor atual: R$"+acoesPage.getValorAcao());	
			
		}
		
		@Quando("pesquiso a acao {string}, exibo e valido o resultado")
		public void pesquisoAAcaoExiboEValidoOResultado(String acao) {		    	
			preenchoOCampoPesquisaCom(acao);
			envioATeclaEnter();
			exibeOValorDaAcao();
		}

		@Quando("preencho o campo pesquisa com {string} e envio a tecla Enter")
		public void preenchoOCampoPesquisaEEnvioATeclaEnter(String acao) {			
					
			acoesPage.preenchePequisa(acao, Keys.ENTER);				    
		}
		

}
