# Mediator pattern.
![Interface Design Pattern Screenshot](../../../../../images/command-pattern.png)

### Overview
This is a behavioural pattern that refers to how objects interacts with one another without explicitly referring to each other

### Concepts
- To achieve loose coupling between objects
- it acts as a hub or router in your application
- Enables interactions between well-defined but complex object
- Makes reusable components possible


### Examples:
- java.util.Timer api : the time class mediate calls via its schedule method
- java.lang.reflect.Method#invoke()


### Design:
- Mediator design is interface based with a concrete class
- The mediator class knows about colleagues rather than colleagues knowing about each other