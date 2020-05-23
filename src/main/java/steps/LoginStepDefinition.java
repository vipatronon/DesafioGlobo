package steps;

import cucumber.api.java.pt.Dado;
import funcionalidades.LoginFuncionalidade;

public class LoginStepDefinition {
	private LoginFuncionalidade login = new LoginFuncionalidade();
	
	@Dado("^que estou na pagina mobile de Fotogalerias$")
	public void que_estou_na_pagina_mobile_de_Fotogalerias() throws Throwable {
		login.queEstouNaPaginaMobileDeFotogalerias();
	}
}