# Overview
Software engineering design principles are a set of guidelines that help software engineers create high-quality, maintainable, and scalable software systems.

# SOLID-Principles

## S - Single Responsibility Principle
A class should have one and only one reason to change, meaning that a class should have only one job.

### Before
![alt text](https://github.com/nadisha/SOLID-principles/blob/main/srp-incorrect.png?raw=true)

### After
![alt text](https://github.com/nadisha/SOLID-principles/blob/main/srp-correct.png?raw=true)

## O - Open & Closed Principle
Objects or entities should be open for extension but closed for modification
<br/>
Avoid tight coupling, use of if-else/switch-case logic. 

### Before
![alt text](https://github.com/nadisha/SOLID-principles/blob/main/ocp-incorrect.png?raw=true)

### After
![alt text](https://github.com/nadisha/SOLID-principles/blob/main/ocp-correct.png?raw=true)

## L - Liskov's Substitution Principle
Subclasses should be substitutable for their base classes. In simple terms, objects of a superclass should be replaceable with objects of its subclasses without breaking the application.

### Before
![alt text](https://github.com/nadisha/SOLID-principles/blob/main/isp-incorrect.png?raw=true)

### After
![alt text](https://github.com/nadisha/SOLID-principles/blob/main/isp-correct.png?raw=true)

## I - Interface Segregation Principle
Separating the interfaces. Many client-specific interfaces are better than once general-purpose interface. Client should not be forced to implement a function they do no need.

### Before
![alt text](https://github.com/nadisha/SOLID-principles/blob/main/lsp-incorrect.png?raw=true)

### After
![alt text](https://github.com/nadisha/SOLID-principles/blob/main/lsp-correct.png?raw=true)

## D - Dependency Inversion Principle
Entities must depend on abstractions, not on concretions. The high-level module must not depend on the low-level module, but both should depend on abstractions.

### Before
![alt text](https://github.com/nadisha/SOLID-principles/blob/main/dip-incorrect.png?raw=true)

### After
![alt text](https://github.com/nadisha/SOLID-principles/blob/main/dip-correct.png?raw=true)


# Other Design Principles
## DRY Principle
The DRY (Don't Repeat Yourself) principle states that every piece of knowledge in a software system should have a single, unambiguous representation. This helps to avoid duplication of code and makes maintenance easier.

## KISS Principle
The KISS (Keep It Simple, Stupid) principle states that software systems should be simple and easy to understand. This helps to minimize complexity and reduce the risk of bugs.

## YAGNI Principle
The YAGNI (You Ain't Gonna Need It) principle states that software engineers should only implement features that are actually needed, rather than adding features that might be useful in the future. This helps to minimize unnecessary complexity and reduce development time.

## Separation of Concerns
The separation of concerns principle states that different parts of a software system should be separated based on their functionalities. This helps to make the code more modular and easier to maintain.

## Modularity
Modularity refers to the practice of breaking down a software system into smaller, self-contained components. This helps to make the code more reusable and easier to maintain.

## Abstraction
Abstraction is the process of hiding implementation details and exposing only the necessary information. This helps to make the code more maintainable and easier to understand.

## Encapsulation
Encapsulation is the practice of wrapping data and functions within a single unit. This helps to protect the internal data of an object from being modified by external code.

## Loose Coupling
Loose coupling refers to the degree to which a software system is independent of other systems. Systems with loose coupling are more flexible and easier to maintain than systems with tight coupling.

## High Cohesion
High cohesion refers to the degree to which the elements of a system are related to each other. Systems with high cohesion are more maintainable and easier to understand than systems with low cohesion.