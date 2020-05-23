#language: pt
#Encoding: ISO-8859-1

Funcionalidade: Verificar o comportamento da Newsletter O Globo
  Objetivo: Verificar o comportamento da Newsletter de modo a garantir que o usuario
  tenha a experiencia desejada

  Contexto: 
    Dado que estou na pagina Newsletters O Globo

  @Banner
  Cenario: Verificar a exibicao do banner de anuncio
    Entao o banner de anuncio sera exibido

  @SelecaoEdicoes @SelecaoSimples @Critico
  Esquema do Cenario: Verificar a correta selecao das edicoes de preferencia
    Quando selecionar a edicao de preferencia "<edicao>"
    Entao a edicao de preferencia da newsletter eh selecionada com sucesso "<edicao>"
    Exemplos: 
      | edicao         |
      | Diarias        |
      | Gente do Globo |
      | Opiniao        |
      | Ela            |
      | Acervo         |

  @SelecaoEdicoes @SelecoesMultiplas
  Cenario: Verificar a multipla selecao de edicoes de preferencia
    Quando selecionar multiplas edicoes
    Entao todas as edicao de preferencia da newsletter serao selecionadas com sucesso

  @FluxoCompleto @CaptchaCorreto @EmailCorreto @ConfirmacaoCorreta @Critico
  Cenario: Verificar a inscricao na newsletter
    Quando selecionar a edicao de preferencia "<edicao>"
    E digitar o endereco de email "<email>"
    E confirmar o endereco de email "<emailConfirmacao>"
    E preencher o captcha corretamente
    E clicar no botao inscreva-se
    Entao a assinatura do newsletter eh concluida com sucesso
      | edicao  | email                   | emailConfirmacao        |
      | Diarias | teste@automatico.com.br | teste@automatico.com.br |

  @ConfirmacaoIncorreta @Critico
  Cenario: Verificar o correto preenchimento do endereco de email e sua incorreta confirmacao
    Quando selecionar a edicao de preferencia "<edicao>"
    E digitar o endereco de email "<email>"
    E confirmar o endereco de email "<emailConfirmacao>"
    E preencher o captcha corretamente
    E clicar no botao inscreva-se
    Entao a tela exibira a mensagem para verificar as informacoes preenchidas
      | edicao  | email                   | emailConfirmacao                |
      | Diarias | teste@automatico.com.br | testenegativo@automatico.com.br |

  @EmailIncorreto @Critico
  Cenario: Verificar o incorreto preenchimento do endereco de email e sua correta confirmacao
    Quando selecionar a edicao de preferencia "<edicao>"
    E digitar o endereco de email "<email>"
    E confirmar o endereco de email "<emailConfirmacao>"
    E preencher o captcha corretamente
    E clicar no botao inscreva-se
    Entao a tela exibira a mensagem para verificar as informacoes preenchidas
      | edicao  | email                           | emailConfirmacao        |
      | Diarias | testenegativo@automatico.com.br | teste@automatico.com.br |

  @EmailIncorreto @ConfirmacaoIncorreta @Critico
  Cenario: Verificar o incorreto preenchimento do endereco de email e sua incorreta confirmacao
    Quando selecionar a edicao de preferencia "<edicao>"
    E digitar o endereco de email "<email>"
    E confirmar o endereco de email "<emailConfirmacao>"
    E preencher o captcha corretamente
    E clicar no botao inscreva-se
    Entao a tela exibira a mensagem para verificar as informacoes preenchidas
      | edicao  | email                           | emailConfirmacao                        |
      | Diarias | testenegativo@automatico.com.br | testenegativo@automaticonegativo.com.br |

  @CaptchaIncorreto @Critico
  Cenario: Verificar o incorreto preenchimento do captcha
    Quando selecionar a edicao de preferencia "<edicao>"
    E digitar o endereco de email "<email>"
    E confirmar o endereco de email "<emailConfirmacao>"
    E preencher o captcha inorretamente
    E clicar no botao inscreva-se
    Entao a assinatura do newsletter eh concluida com sucesso
      | edicao  | email                   | emailConfirmacao        |
      | Diarias | teste@automatico.com.br | teste@automatico.com.br |
      
   @CaptchaTroca
   Cenario: Verificar a troca da imagem do captcha
   Quando trocar a imagem do captcha
   Entao uma nova imagem de captcha sera exibida
