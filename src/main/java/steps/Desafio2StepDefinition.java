package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import funcionalidades.FotogaleriaFuncionalidade;

public class Desafio2StepDefinition {
	FotogaleriaFuncionalidade fotogaleria = new FotogaleriaFuncionalidade();
	
	@Dado("^nego a solicitacao de envio de notificacoes$")
	public void nego_a_solicitacao_de_envio_de_notificacoes() throws Throwable {
		fotogaleria.negoSolicitacaoDeEnvioDeNotificacoes();
	}

	@Entao("^na sessao 'RECOMENDADAS' sao exibidas seis fotogalerias$")
	public void na_sessao_RECOMENDADAS_sao_exibidas_seis_fotogalerias() throws Throwable {
		fotogaleria.naSessaoRECOMENDADASSaoExibidasSeisFotogalerias();
	}	

	@Entao("^na sessao 'MAIS VISTAS' sao exibidas seis fotogalerias$")
	public void na_sessao_MAIS_VISTAS_sao_exibidas_seis_fotogalerias() throws Throwable {
	    fotogaleria.naSessaoMAISVISTASSaoExibidasSeisFotogalerias();
	}

	@Entao("^a opcao default eh exibida no select$")
	public void a_opcao_default_eh_exibida_no_select() throws Throwable {
		fotogaleria.aOpcaoDefaultEhExibidaNoSelect();
	}

	@Quando("^selecionar qualquer opcao que nao seja a default no select da sessao 'ULTIMAS DE'$")
	public void selecionar_qualquer_opcao_que_nao_seja_a_default_no_select_da_sessao_ULTIMAS_DE() throws Throwable {
	    fotogaleria.selecionarQualquerOpcaoQueNaoSejaADefaultNoSelectDaSessaoULTIMASDE();
	}

	@Entao("^na sessao 'ULTIMAS DE' sao exibidas tres fotogalerias$")
	public void na_sessao_ULTIMAS_DE_sao_exibidas_tres_fotogalerias() throws Throwable {
	    fotogaleria.naSessaoULTIMASDESaoExibidasTresFotogalerias();
	}
}