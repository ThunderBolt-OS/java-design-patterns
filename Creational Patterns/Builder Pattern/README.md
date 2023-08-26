# Builder Design Pattern 🏗️

<p align="center">
  <img src="https://refactoring.guru/images/patterns/content/builder/builder-en.png" alt="Builder Design Pattern Illustration" width="400">
</p>

The Builder design pattern separates the construction of a complex object from its representation, allowing you to create different variations of the same object while keeping the construction process consistent. Imagine designing houses with different materials and styles, but following a unified construction process.

## 🔧 Key Principles

🏗️ **Product Class:** The product class represents the complex object you want to build. It contains attributes like foundation, walls, roof, windows, and doors.

🔧 **Builder Interface:** The abstract builder interface defines methods to build individual parts of the product. Each method corresponds to a part of the complex object. For example, `buildWalls()` constructs the walls.

🔨 **Concrete Builder:** The concrete builder class implements the builder interface. It provides specific implementations for building each part of the product. The concrete builder has a reference to the product being built.

👷 **Director:** The director class is optional and guides the construction process. It takes a concrete builder as input and orchestrates the order of method calls needed to construct the complete product.

## 🚀 Flow of Builder Pattern

1. **Create Product:** Define the product class with attributes representing different parts of the complex object.

2. **Create Builder Interface:** Define the builder interface with methods for building individual parts of the product.

3. **Create Concrete Builder:** Implement the concrete builder class by providing specific implementations for each method defined in the builder interface.

4. **Create Director (Optional):** If needed, create a director class that takes a concrete builder as input. The director orchestrates the construction process by calling builder methods in a specific order.

5. **Client Code:** Create an instance of the director and a concrete builder. Set the builder for the director and initiate the construction process. Retrieve the final product from the builder.

## 🌟 Pros

🛠️ **Flexible Construction:** You can construct complex objects with different variations, ensuring a consistent construction process.

💡 **Clear Object Creation:** The builder pattern separates the construction steps from the final product, making the code more understandable and maintainable.

👷 **Controlled Building:** The director (if used) provides a controlled and organized way to build the product.

## 🛑 Cons

🏢 **Additional Classes:** Introducing builder and director classes might increase the number of classes in your code.

🔌 **Complexity:** The pattern can become complex if the product has a large number of parts or if there are many variations.

## 🚀 Real-World Analogy

Consider building custom vehicles. The product is the vehicle itself, with parts like engine, wheels, seats, and windows. The builder interface defines methods to construct each part, while the concrete builder classes (e.g., CarBuilder, MotorcycleBuilder) provide specific implementations.

## 💼 Real-World Example

Imagine creating meal orders in a restaurant. The product is the meal, and the builder classes (e.g., VegMealBuilder, NonVegMealBuilder) define methods to construct different parts of the meal (e.g., main course, side dishes, drinks).

## 🤔 When to Use

Use the Builder pattern when you want to:

- Construct complex objects step by step with different variations.
- Avoid having multiple constructors with different parameter combinations.
- Separate the construction process from the final product representation.

## 🤓 Interview Questions

1. **What's the primary goal of the Builder design pattern?**
   It separates the construction of a complex object from its representation, allowing flexible creation with consistent steps.

2. **How does the builder pattern handle flexible construction?**
   By defining methods in the builder interface to construct different parts of the product, enabling various configurations.

3. **Why might you use a director class in the builder pattern?**
   A director class can orchestrate the order of builder method calls, ensuring a specific construction sequence.

4. **What are the key components of the builder pattern?**
   The main components are the product class, builder interface, concrete builder, and optionally, the director class.

5. **How does the builder pattern differ from the factory pattern?**
   The builder focuses on constructing complex objects with multiple parts, while the factory focuses on creating instances of classes.

6. **What are the potential drawbacks of the builder pattern?**
   It can introduce additional classes and complexity, which might be overkill for simpler scenarios.

## 🚀 Conclusion

The Builder pattern empowers you to construct complex objects while maintaining a clear and organized construction process. By separating construction from representation, you achieve flexibility and maintainability in your codebase, making it easier to create different variations of the same object.
