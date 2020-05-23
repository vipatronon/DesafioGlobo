package funcionalidades;

import config.Config;

public class LoginFuncionalidade {
		
	/**queEstouNaPaginaMobileDeFotogalerias
	 * : metodo responsavel por acessar a pagina de fotogaleria
	 */
	public void queEstouNaPaginaMobileDeFotogalerias(){
		Config.getWebDriverMobile().get("https://m.oglobo.globo.com/fotogalerias/");
	}
}