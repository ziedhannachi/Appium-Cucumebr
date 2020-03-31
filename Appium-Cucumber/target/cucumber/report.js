$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/Accueil.feature");
formatter.feature({
  "line": 1,
  "name": "Seloger Mobile - Accueil",
  "description": "\r\nEn tant que Utilisateur \r\n\tje souhaite ouvrir l application Seloger mobile",
  "id": "seloger-mobile---accueil",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20834777375,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Seloger Mobile - Accueil",
  "description": "",
  "id": "seloger-mobile---accueil;seloger-mobile---accueil",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Connexion"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Ouvrir l application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Verifier la page Accueil",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Cliquer sur le bouton Acheter",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "la page s affiche",
  "keyword": "Then "
});
formatter.match({
  "location": "AccueilStepDefinition.ouvrir_l_application()"
});
formatter.result({
  "duration": 9851445335,
  "status": "passed"
});
formatter.match({
  "location": "AccueilStepDefinition.verifier_la_page_Accueil()"
});
formatter.result({
  "duration": 187997230,
  "status": "passed"
});
formatter.match({
  "location": "AccueilStepDefinition.cliquer_sur_le_bouton_Acheter()"
});
formatter.result({
  "duration": 5311714782,
  "status": "passed"
});
formatter.match({
  "location": "AccueilStepDefinition.la_page_s_affiche()"
});
formatter.result({
  "duration": 166265,
  "status": "passed"
});
formatter.after({
  "duration": 1708980074,
  "status": "passed"
});
});