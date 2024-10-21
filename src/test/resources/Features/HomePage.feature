# Auteur: kawther
Feature: consultation de menu de home page

  Scenario Outline: acceder au chaque menu de la page daccueil
    Given utilisateur est  connecte avec le bon username "Admin" et le bon password "admin123"
    When utilisateur clique sur le "<menu>"
    Then la page de menu est affichee qui contient le nom de "<menu>"

    Examples: 
      | menu        |
      | PIM         |
      | Admin       |
      | Leave       |
      | Time        |
      | Recruitment |
      | My Info     |
      | Performance |
      | Dashboard   |
      | Directory   |
      | Maintenance |
      | Claim       |
      | Buzz        |
