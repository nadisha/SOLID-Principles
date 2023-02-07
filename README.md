# SOLID-Principles

## S - Single Responsibility Principle
A class should have one and only one reason to change, meaning that a class should have only one job.

### Before
![alt text](https://github.com/nadisha/SOLID-principles/blob/main/srp-incorrect.png?raw=true)

### After
![alt text](https://github.com/nadisha/SOLID-principles/blob/main/srp-correct.png?raw=true)

#O - Open & Closed Principle
Objects or entities should be open for extension but closed for modification

#L - Leskov's Substitution Principle
Subclasses should be substitutable for their base classes.

#I - Interface Segregation Principle
Separating the interfaces. Many client-specific interfaces are better than once general-purpose interface. Client should not be forced to implement a function they do no need.

#D - Dependency Inversion Principle
Entities must depend on abstractions, not on concretions. The high-level module must not depend on the low-level module, but both should depend on abstractions.