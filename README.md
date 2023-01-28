
# Automation project using Serenity BDD with Cucumber and Screenplay pattern

## Serenity BDD
Serenity BDD is a Java library designed to make automated acceptance tests, it has potent and highly detailed reporting and documentation features.
Also has Selenium and Rest Assured for API testing support

## Cucumber
Cucumber is a tool that supports behavior-driven development. Use a language called Gherkin.
It allows expected software behaviors to be specified in a logical language that customers can understand, it uses the Given/When/Then structure to model the 
business rules

## Screenplay pattern

The Screenplay pattern describes tests in terms of actors and the tasks they perform
The screenplay is a design pattern that applies the SOLID principles that encourage the writing of high-quality, maintainable, and scalable code.

The SOLID principles applied in this project are:

### Single Responsibility Principle (SRP)

A class should have only one responsibility and therefore only one reason to change. To achieve this each class in the model package represents a function/method.

### Open-Closed Principle (OCP)

A class should be open for extension but closed for modification, which means is possible to extend behavior by writing a new class without changing the working code.

There is an important consideration, the class which holds the element locators are likely to get modification by updating the locator or when adding a new locator,
therefore this principle is compromised. However, as defined by the principle this class is extended when other classes need to use the elements to perform actions to them.




