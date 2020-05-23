package funcionalidades;

import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pages.Fotogaleria;

public class FotogaleriaFuncionalidade {
	Fotogaleria fotogaleria = new Fotogaleria();
	
	/**negoSolicitacaoDeEnvioDeNotificacoes
	 * : Metodo responsável por clicar no botão "Não, Obrigado" no dialogo push da página
	 */
	public void negoSolicitacaoDeEnvioDeNotificacoes(){
		fotogaleria.clickBotaoNotificacaoNaoObrigado();
	}
	
	/**naSessaoRECOMENDADASSaoExibidasSeisFotogalerias
	 * : Metodo responsavem por validar a quantidade de fotogalerias dentro da area "Recomendadas"
	 */
	public void naSessaoRECOMENDADASSaoExibidasSeisFotogalerias(){
		WebElement areaRecomendadas = fotogaleria.getAreaRecomendadas();
		List<WebElement> materias = getChildrenLIElements(areaRecomendadas);
		validarQuantidadeFotogalerias(materias, 6, "Recomendadas");
	}
	
	/**naSessaoMAISVISTASSaoExibidasSeisFotogalerias
	 * : Metodo responsavem por validar a quantidade de fotogalerias dentro da area "Mais Vistas"
	 */
	public void naSessaoMAISVISTASSaoExibidasSeisFotogalerias(){
		WebElement areaMaisVistas = fotogaleria.getAreaMaisVistas();
		List<WebElement> materias = getChildrenLIElements(areaMaisVistas);
		validarQuantidadeFotogalerias(materias, 6, "Mais Vistas");
	}
	
	/**aOpcaoDefaultEhExibidaNoSelect
	 * : Metodo responsavel por validar a opção default do select na area "Ultimas De"
	 */
	public void aOpcaoDefaultEhExibidaNoSelect(){
		System.out.println("\n\n-------------------------------\nInicio da validacao\n--------------------------\n\n");
		WebElement select = fotogaleria.getSelectEdicao();
		Select combo = new Select(select);
		String opcaoSelecionada = combo.getFirstSelectedOption().getText();
		String mensagem = "";
		if (opcaoSelecionada.equals("Todas")){
			mensagem = "A opção selecionada por default é igual a esperada!";
			Assert.assertTrue(mensagem, true);
		}
		else{
			mensagem = "A opção selecionada por default NÃO é igual a esperada! Obtida: \"" + opcaoSelecionada + "\" esperada: \"Todas\"";
			Assert.fail(mensagem);
		}
		System.out.println("\n\n" + mensagem + "\n\n-------------------------------\nFim da validacao\n--------------------------\n\n");
	}
	
	/**selecionarQualquerOpcaoQueNaoSejaADefaultNoSelectDaSessaoULTIMASDE
	 * Metodo responsavel por selecionar de forma randomica qualquer opcao dentro do select da area "Ultimas De", exceto a opção default
	 * @throws InterruptedException
	 */
	public void selecionarQualquerOpcaoQueNaoSejaADefaultNoSelectDaSessaoULTIMASDE () throws InterruptedException{
		WebElement select = fotogaleria.getSelectEdicao();
		Select combo = new Select(select);
		int numeroOpcoes = combo.getOptions().size();
		int opcaoSelecionar = gerarNumeroRandomico(1, numeroOpcoes-1);
		combo.selectByIndex(opcaoSelecionar);		
		Thread.sleep(2500);
	}
	
	/**naSessaoULTIMASDESaoExibidasTresFotogalerias
	 * : Metodo responsavem por validar a quantidade de fotogalerias dentro da area "Ultimas De"
	 */
	public void naSessaoULTIMASDESaoExibidasTresFotogalerias(){
		WebElement areaUltimasDe = fotogaleria.getAreaUltimasDe();
		List<WebElement> materias = getChildrenLIElements(areaUltimasDe);
		validarQuantidadeFotogalerias(materias, 3, "Ultimas De");
	}
	
	/**gerarNumeroRandomico
	 * : Metodo responsavel por gerar um numero randomico entre 'a' e 'b' 
	 * @param a :inicio do intervalo
	 * @param b :fim do intervalo
	 * @return numero randomico gerado
	 */
	private int gerarNumeroRandomico(int a, int b){
		Random random = new Random();
		return random.nextInt((b-a)+1)+a;
	}
	
	/**validarQuantidadeFotogalerias
	 * : metodo responsavel por validar a quantidade de fotogalerias presentes em uma determinada area
	 * @param materias :fotogalerias já mapeadas
	 * @param quantidadeEsperada :quantidade esperada de elementos
	 * @param area :area de validacao
	 */
	private void validarQuantidadeFotogalerias(List<WebElement> materias, int quantidadeEsperada, String area){
		System.out.println("\n\n-------------------------------\nInicio da validacao\n--------------------------\n\n");
		String mensagem = "";
		if (materias.size() == quantidadeEsperada){
			mensagem = "Existem " + quantidadeEsperada + " materias na área \"" + area + "\" dentro da Fotogaleria";
			Assert.assertTrue(mensagem, true);
		}
		else{
			mensagem = "NÃO existem " + quantidadeEsperada + " materias na área \"" + area + "\" dentro da Fotogaleria. Quantidade encontrada: " + materias.size();
			Assert.fail(mensagem);
		}
		System.out.println("\n\n" + mensagem + "\n\n-------------------------------\nFim da validacao\n--------------------------\n\n");
	}
	
	/**getChildrenLIElements
	 * : metodo responsavel por capturar os elementos LI filhos de um determidado elemento raiz
	 * @param rootElement :elemento pai
	 * @return
	 */
	private List<WebElement> getChildrenLIElements(WebElement rootElement){
		return rootElement.findElements(By.xpath(".//li"));
	}

}
