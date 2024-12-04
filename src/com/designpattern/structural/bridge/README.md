# Bridge pattern.
![Interface Design Pattern Screenshot](../../../../../images/adapter-pattern.png)

### Overview
The bridge pattern is a structural pattern that is used to decouple abstraction from implementation

### Concepts
- Decouples abstraction from implementation of the interface with the client is using
- To achieve the decoupling you use encapsulation, composition, and inheritance
- The concept is that changes in abstraction will not affect the client. 
  - the client is unaware of the abstraction from the backend
- One of the reason for this pattern is because expectation is uncertain, details won't be right.
  - this help to proactively handle uncertainty. 
  - The bridge allows for a level of indirection that we add to our application 
  - if you are not sure of what the endpoint of what you are building will be, the bridge is a great pattern for such scenario


### Examples
- Drivers: JDBC 

### Design:
- Interface and abstract classes
- Composition over inheritance. It is more than composition
- Expect change from both sides
- Abstraction, Implementor, Refined Abstraction, Concrete Implementor