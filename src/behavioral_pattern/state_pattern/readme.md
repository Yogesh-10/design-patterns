State design pattern is one of the behavioral design pattern. State design pattern is used when an Object change its behavior based on its internal state.

The main idea of State pattern is to allow the object for changing its behavior without changing its class. Also, by implementing it, the code should remain cleaner without many if/else statements.

Imagine we have a package which is sent to a post office, the package itself can be ordered, then delivered to a post office and finally received by a client. Now, depending on the actual state, we want to print its delivery status.

The simplest approach would be to add some boolean flags and apply simple if/else statements within each of our methods in the class. That won't complicate it much in a simple scenario. However, it might complicate and pollute our code when we'll get more states to process which will result in even more if/else statements.

Besides, all logic for each of the states would be spread across all methods. Now, this is where the State pattern might be considered to use. Thanks to the State design pattern, we can encapsulate the logic in dedicated classes, apply the Single Responsibility Principle and Open/Closed Principle, have cleaner and more maintainable code.

![](https://www.baeldung.com/wp-content/uploads/2018/08/State-1.png)

In the UML diagram, we see that Context class has an associated State which is going to change during program execution.

Our context is going to delegate the behavior to the state implementation. In other words, all incoming requests will be handled by the concrete implementation of the state.

We see that logic is separated and adding new states is simple – it comes down to adding another State implementation if needed.

* Context: Defines an interface for clients to interact. It maintains references to concrete state objects which may be used to define the current state of objects.
* State: Defines interface for declaring what each concrete state should do.
* ConcreteState: Provides the implementation for methods defined in State.


In our Code Example, Context is - Canvas class, State is - Tool interface, ConcreteSelectionA and ConcreteSelectionB are - SelectionTool and BrushTool

Resources:
1. https://refactoring.guru/design-patterns/state
2. https://www.baeldung.com/java-state-design-pattern
3. https://www.geeksforgeeks.org/state-design-pattern/