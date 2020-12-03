#language:pt

@exibirValoresAcoes
Funcionalidade: Exibir valores de acoes

	Contexto: 
			Dado que esteja na pagina "http://www.google.com.br"



			@buscaAcaoUnicoPasso
			Cenario: Buscar acao no google passo unico
			Quando pesquiso a acao "ITSA4", exibo e valido o resultado
			
			

	@buscaAcaoItau @buscaAcao
	Cenario: Buscar acao no google
	Quando preencho o campo pesquisa com "ITSA4" e envio a tecla Enter
	Entao exibe o valor da acao

  @buscaAcaoMovida @buscaAcao
	Cenario: Buscar acao no google
	Quando preencho o campo pesquisa com "MOVI3"
	E envio a tecla Enter
	Entao exibe o valor da acao
	
	@EsquemaAcoes
	Esquema do Cenario: <cenario>
	Quando preencho o campo pesquisa com "<acoes>"
	E envio a tecla Enter
	Entao exibe o valor da acao
	Exemplos:
	|cenario        |acoes|
	|buca acao ITSA4|ITSA4|
	|buca acao MOVI3|MOVI3|
	|buca acao OIBR3|OIBR3|
	|buca acao PETR3|PETR3|
	|buca acao MGLU3|MGLU3|
	
	



#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
