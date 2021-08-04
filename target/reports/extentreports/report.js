$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("comprarCursoPOEN.feature");
formatter.feature({
  "line": 1,
  "name": "Comprar Curso POEN",
  "description": "",
  "id": "comprar-curso-poen",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Pesquisar Curso com Clique e Incluir no Carrinho POEN",
  "description": "",
  "id": "comprar-curso-poen;pesquisar-curso-com-clique-e-incluir-no-carrinho-poen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "que acesso o site da Iterasys  POEN",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "pesquiso por \"Mantis\" POEN",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "clico na Lupa POEN",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "vejo a lista de resultados para o curso \"Mantis\" POEN",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "clico em Matricule-se POEN",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "confirmo o nome do curso como \"Mantis\" e o preco de \"R$ 49,99\" POEN",
  "keyword": "Then "
});
formatter.match({
  "location": "comprarCursoPOEN.queAcessoOSiteDaIterasysPO()"
});
formatter.result({
  "duration": 70851800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mantis",
      "offset": 14
    }
  ],
  "location": "comprarCursoPOEN.pesquisoPorPO(String)"
});
formatter.result({
  "duration": 1674500,
  "status": "passed"
});
formatter.match({
  "location": "comprarCursoPOEN.clicoNaLupaPO()"
});
formatter.result({
  "duration": 83000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mantis",
      "offset": 41
    }
  ],
  "location": "comprarCursoPOEN.vejoAListaDeResultadosParaOCursoPO(String)"
});
formatter.result({
  "duration": 159400,
  "status": "passed"
});
formatter.match({
  "location": "comprarCursoPOEN.clicoEmMatriculeSePO()"
});
formatter.result({
  "duration": 105700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mantis",
      "offset": 31
    },
    {
      "val": "R$ 49,99",
      "offset": 53
    }
  ],
  "location": "comprarCursoPOEN.confirmoONomeDoCursoComoEOPrecoDePO(String,String)"
});
formatter.result({
  "duration": 124000,
  "status": "passed"
});
});