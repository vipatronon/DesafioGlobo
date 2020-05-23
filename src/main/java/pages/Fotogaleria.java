package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.Config;

public class Fotogaleria {
	private String ID_NOTIFICACAO_NAO_OBRIGADO = "onesignal-popover-cancel-button";
	private String CLASS_AREA_RECOMENDADAS = "recommended";
	private String CLASS_AREA_MAIS_VISTAS = "popular";
	private String ID_AREA_ULTIMAS_DE = "listaConteudosMobi";
	private String ID_SELECT_EDICAO = "selectEditorias";
	
	/**getBotaoNotificacaoNaoObrigado
	 * : getter
	 * @return
	 */
	public WebElement getBotaoNotificacaoNaoObrigado(){
		return Config.getWebDriverMobile().findElement(By.id(ID_NOTIFICACAO_NAO_OBRIGADO));
	}
	
	/**getAreaRecomendadas
	 * : getter
	 * @return
	 */
	public WebElement getAreaRecomendadas(){
		return Config.getWebDriverMobile().findElement(By.className(CLASS_AREA_RECOMENDADAS));
	}
	
	/**getAreaMaisVistas
	 * : getter
	 * @return
	 */
	public WebElement getAreaMaisVistas(){
		return Config.getWebDriverMobile().findElement(By.className(CLASS_AREA_MAIS_VISTAS));
	}
	
	/**getAreaUltimasDe
	 * : getter
	 * @return
	 */
	public WebElement getAreaUltimasDe(){
		return Config.getWebDriverMobile().findElement(By.id(ID_AREA_ULTIMAS_DE));
	}
	
	/**getSelectEdicao
	 * : getter
	 * @return
	 */
	public WebElement getSelectEdicao (){
		return Config.getWebDriverMobile().findElement(By.id(ID_SELECT_EDICAO));
	}
	
	/**clickBotaoNotificacaoNaoObrigado
	 * : click
	 * @return
	 */
	public void clickBotaoNotificacaoNaoObrigado(){
		getBotaoNotificacaoNaoObrigado().click();
	}
}