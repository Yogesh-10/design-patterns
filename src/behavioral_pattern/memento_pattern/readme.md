Momento pattern is widely used for undo machanisms. It works on the principles of history and state management.

Memento pattern is used to restore state of an object to a previous state. Memento pattern falls under behavioral pattern category.

* originator : the object for which the state is to be saved. It creates the memento and uses it in future to undo.
<br>
* memento : the object that is going to maintain the state of originator. Its just a POJO.
<br>
* caretaker : the object that keeps track of multiple memento. Like maintaining savepoints.

In our example, originator is Editor, Memento is EditorState and CareTaker is History

Resources:
1. https://www.geeksforgeeks.org/memento-design-pattern/
2. https://www.tutorialspoint.com/design_pattern/memento_pattern.htm
3. https://refactoring.guru/design-patterns/memento