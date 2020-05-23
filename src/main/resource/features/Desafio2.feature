#language: pt
#Encoding: ISO-8859-1

@Mobile
Funcionalidade: Verificar o comportamento da Fotogaleria mobile do Jornal O Globo
  Objetivo: Verificar o comportamento da Fotogaleria mobile do Jornal O Globo de modo a garantir
  que o usuario tenha a experiencia desejada
  
  Contexto:
  	Dado que estou na pagina mobile de Fotogalerias
  	E nego a solicitacao de envio de notificacoes
  	
  	@Critico @PontoAtencao4 @PontoAtencao5
  	Cenario: Verificar que as sessoes exibidas na tela inicial possuem seis fotogalerias
  		Entao na sessao 'RECOMENDADAS' sao exibidas seis fotogalerias
  		Entao na sessao 'MAIS VISTAS' sao exibidas seis fotogalerias
  		
  	@PontoAtencao6
  	Cenario: Verificar a opcao default no select da sessao 'ULTIMAS DE'
  		Entao a opcao default eh exibida no select
  	
  	@Critico @PontoAtencao7
  	Cenario: Verificar a quantidade de fotogalerias exibidas ao selecionar qualquer opcao no select da sessao 'ULTIMAS DE'
  		Quando selecionar qualquer opcao que nao seja a default no select da sessao 'ULTIMAS DE'
  		Entao na sessao 'ULTIMAS DE' sao exibidas tres fotogalerias