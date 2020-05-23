$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/DesafioQualidade/src/main/resource/features/Desafio2.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#Encoding: ISO-8859-1"
    }
  ],
  "line": 5,
  "name": "Verificar o comportamento da Fotogaleria mobile do Jornal O Globo",
  "description": "Objetivo: Verificar o comportamento da Fotogaleria mobile do Jornal O Globo de modo a garantir\r\nque o usuario tenha a experiencia desejada",
  "id": "verificar-o-comportamento-da-fotogaleria-mobile-do-jornal-o-globo",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@Mobile"
    }
  ]
});
formatter.background({
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que estou na pagina mobile de Fotogalerias",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "nego a solicitacao de envio de notificacoes",
  "keyword": "E "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 14,
  "name": "Verificar que as sessoes exibidas na tela inicial possuem seis fotogalerias",
  "description": "",
  "id": "verificar-o-comportamento-da-fotogaleria-mobile-do-jornal-o-globo;verificar-que-as-sessoes-exibidas-na-tela-inicial-possuem-seis-fotogalerias",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 13,
      "name": "@Critico"
    },
    {
      "line": 13,
      "name": "@PontoAtencao4"
    },
    {
      "line": 13,
      "name": "@PontoAtencao5"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "na sessao \u0027RECOMENDADAS\u0027 sao exibidas seis fotogalerias",
  "keyword": "Entao "
});
formatter.step({
  "line": 16,
  "name": "na sessao \u0027MAIS VISTAS\u0027 sao exibidas seis fotogalerias",
  "keyword": "Entao "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que estou na pagina mobile de Fotogalerias",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "nego a solicitacao de envio de notificacoes",
  "keyword": "E "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 19,
  "name": "Verificar a opcao default no select da sessao \u0027ULTIMAS DE\u0027",
  "description": "",
  "id": "verificar-o-comportamento-da-fotogaleria-mobile-do-jornal-o-globo;verificar-a-opcao-default-no-select-da-sessao-\u0027ultimas-de\u0027",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 18,
      "name": "@PontoAtencao6"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "a opcao default eh exibida no select",
  "keyword": "Entao "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que estou na pagina mobile de Fotogalerias",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "nego a solicitacao de envio de notificacoes",
  "keyword": "E "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 23,
  "name": "Verificar a quantidade de fotogalerias exibidas ao selecionar qualquer opcao no select da sessao \u0027ULTIMAS DE\u0027",
  "description": "",
  "id": "verificar-o-comportamento-da-fotogaleria-mobile-do-jornal-o-globo;verificar-a-quantidade-de-fotogalerias-exibidas-ao-selecionar-qualquer-opcao-no-select-da-sessao-\u0027ultimas-de\u0027",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 22,
      "name": "@Critico"
    },
    {
      "line": 22,
      "name": "@PontoAtencao7"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "selecionar qualquer opcao que nao seja a default no select da sessao \u0027ULTIMAS DE\u0027",
  "keyword": "Quando "
});
formatter.step({
  "line": 25,
  "name": "na sessao \u0027ULTIMAS DE\u0027 sao exibidas tres fotogalerias",
  "keyword": "Entao "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});