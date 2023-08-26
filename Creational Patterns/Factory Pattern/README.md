# Factory Method Design Pattern 🏭

<p align="center">
  <img src="https://refactoring.guru/images/patterns/content/factory-method/factory-method-en.png" alt="Factory Method Design Pattern Illustration" width="400">
</p>

The Factory Method design pattern provides an interface for creating objects in a super class, but allows subclasses to alter the type of objects that will be created. It's like having a factory for producing different types of products, tailored to your needs.

## 🔧 Key Principles

🏗️ **Abstract Creator:** The super class (abstract creator) defines the factory method, which returns an object of the product class.

🔧 **Concrete Creators:** Subclasses (concrete creators) implement the factory method, creating instances of different products.

📦 **Abstract Product:** The product classes implement a common interface, defining the methods that all products must have.

📦 **Concrete Products:** Different subclasses of products are created by concrete creators, each tailored for specific use.

## 🚀 Pros

📦 **Flexibility:** You can add new products and creators without modifying existing code.

🔌 **Loose Coupling:** The client code is decoupled from the concrete product classes.

🎉 **Open-Closed Principle:** You can extend the code without modifying existing classes.

## 🛑 Cons

💥 **Complexity:** Introduces extra layers of abstraction, which can be overkill for simpler scenarios.

🔧 **Class Explosion:** As the number of products and creators grow, it might lead to a large number of classes.

## 🎮 Real-World Analogy

Think of a pizza restaurant: the PizzaStore (abstract creator) defines a method for creating pizzas. The specific branches of the restaurant (concrete creators) implement the method, creating different types of pizzas (concrete products).

## 💼 Real-World Example

Consider a GUI framework that needs to create different UI elements like buttons, checkboxes, and text fields. The framework would provide a factory method for creating these elements, allowing different UI themes (concrete creators) to produce consistent elements (concrete products).

## 🤔 When to Use

Use the Factory Method pattern when you want to:

- Create objects with common interfaces but varying implementations.
- Encapsulate the object creation process.
- Provide a framework for customization by subclasses.

## 🤓 Interview Questions

1. **What's the Factory Method design pattern?**
   It defines an interface for creating objects but delegates the responsibility of instantiation to subclasses.

2. **Why use Factory Method?**
   It helps create objects with different implementations while keeping the code flexible and maintainable.

3. **What's the difference between Factory Method and Singleton?**
   Singleton ensures a single instance of a class, while Factory Method focuses on creating different objects with common interfaces.

## 🚀 Conclusion

The Factory Method pattern is your customizable assembly line for producing different types of products. It provides a structured way to create objects and manage their variations, ensuring a clean and maintainable codebase.
