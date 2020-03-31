Feature: Seloger Mobile - Accueil

  En tant que Utilisateur 
  	je souhaite ouvrir l application Seloger mobile

  @Connexion
  Scenario: Seloger Mobile - Accueil
  
    Given Ouvrir l application
    And   Verifier la page Accueil
    When  Cliquer sur le bouton Acheter
    Then  la page s affiche 
  

