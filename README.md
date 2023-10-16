# Observer-Design-Patterns

# Observer Design Pattern Example

This is an example implementation of the Observer Design Pattern in Java. It demonstrates how to create a simple observable system using the `Observable` interface.

## Overview

The Observer Design Pattern is a behavioral design pattern that allows an object, called the subject or observable, to maintain a list of its dependents, called observers, and notify them automatically of any state changes. It promotes loose coupling between the subject and observers, enabling a flexible and maintainable design.

In this example, we have defined an `Observable` interface that provides methods for attaching observers, detaching observers, notifying all observers of changes, and manipulating items. The observers are notified when items are added or deleted from the system.

## Usage

To use the Observer Design Pattern in your own code, follow these steps:

1. Define the `Observable` interface: Create an interface that declares methods for attaching observers, detaching observers, notifying observers, and manipulating the subject's state.

2. Implement the `Observable` interface: Create a concrete class that implements the `Observable` interface. This class will be the subject that the observers will observe. Implement the methods to manage the observers and notify them of changes.

3. Define the `Observer` interface: Create an interface that declares a method to be called when the subject's state changes. This method will be implemented by the observers.

4. Implement the `Observer` interface: Create concrete classes that implement the `Observer` interface. These classes will define the behavior of the observers when they receive updates from the subject.

5. Use the Observer Design Pattern: Create instances of the subject and observer classes, attach the observers to the subject, and manipulate the subject's state. The observers will be automatically notified of any state changes.

## Example

In this example, we have defined the `Observable` interface and provided an example implementation of a shopping cart system. The `Observable` interface declares methods for attaching observers, detaching observers, notifying all observers, adding items to the cart, and deleting items from the cart.

To use the shopping cart system, follow these steps:

1. Create observers: Implement the `Observer` interface and define the behavior of the observers when they receive updates from the cart.

2. Use the shopping cart: Create an instance of the shopping cart class that implements the `Observable` interface. Create instances of the observers and attach them to the cart. Manipulate the cart by adding or deleting items. The observers will be notified of any changes in the cart's state.

```java
// Create observers
Observer observer1 = new ObserverImpl();
Observer observer2 = new ObserverImpl();

// Create shopping cart
Observable cart = new ShoppingCart();

// Attach observers to the cart
cart.attach(observer1);
cart.attach(observer2);

// Manipulate the cart
Item item1 = new Item("Product 1", 10.0);
Item item2 = new Item("Product 2", 20.0);

cart.addItem(item1);
cart.addItem(item2);

cart.deleteItem(item1);

// Detach an observer
cart.detach(observer2);
