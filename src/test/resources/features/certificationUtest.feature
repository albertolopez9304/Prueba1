# Autor: Luis Lopez
  @stories
  Feature: A user enters the Utest page to register
    @scenario1
    Scenario: Register user Luis on the utest page
      Given Luis will register on the Utest page
      When He completes the form on the page
      |firtsName|lastName|email                 |month    |day|year|city    |postalCode|country |password    |
      |Albert   |Lopez   |correo99999@correo.com|February |5  |1991|Monteria|0077145   |Colombia|*1993Alberto|
      Then He verifies the record with the message Welcome to the world's largest community of freelance software testers!