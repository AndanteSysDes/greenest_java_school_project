[Svenska README](README_SV.md)

# Greenest Plant Hotel 🌱

A Java application that helps the Greenest Plant Hotel calculate how much liquid each plant needs per day. This project was developed as an individual school assignment in object-oriented programming.

## Features

- Display the plants staying at the hotel: **Laura**, **Olof**, **Meatloaf**, and **Igge**.
- Let the user select a plant through a dialog box.
- Calculate and display the correct amount and type of liquid.
- Handle unknown names, empty input, and cancelled dialogs.

## Demo

### 1. Welcome message

![Welcome message](docs/images/01-welcome.png)

### 2. Select a plant

![Plant selection dialog](docs/images/02-plant-selection.png)

### 3. Result

![Water requirement for Laura](docs/images/03-result.png)

## UML Class Diagram

The diagram below illustrates the classes, interfaces, and relationships in the project.

![Greenest UML class diagram](docs/images/Greenest.jpg)

## Object-Oriented Design

The project demonstrates several object-oriented programming concepts:

- **Inheritance:** `Palm`, `Cactus`, and `CarnivorousPlants` extend the abstract `Plant` class.
- **Polymorphism:** Each plant type implements its own liquid requirement calculation.
- **Interface:** `LiquidCalculator` defines the contract for calculating liquid requirements.
- **Enum:** `Liquids` represents the available liquid types.
- **Encapsulation:** `GreenHotel` keeps its plant collection private and provides access through public methods.

## SOLID Principles and Responsibilities

The project was designed with the **SOLID principles** in mind, particularly the **Single Responsibility Principle (SRP)**. Each class has a clear, focused responsibility.

| Class / Type | Responsibility |
|---|---|
| `Main` | Starts the application. |
| `View` | Handles user interaction and dialog boxes. |
| `GreenHotel` | Stores the hotel's plants and provides information about them. |
| `Plant` | Defines properties and behavior shared by all plant types. |
| `Palm` | Calculates the liquid requirement for palms. |
| `Cactus` | Calculates the liquid requirement for cacti. |
| `CarnivorousPlants` | Calculates the liquid requirement for carnivorous plants. |
| `LiquidCalculator` | Defines the liquid calculation contract. |
| `Liquids` | Defines the available liquid types. |

This separation of responsibilities makes the code easier to understand, maintain, and extend.

## Technologies

- **Java 25**
- **Swing (`JOptionPane`)**
- **IntelliJ IDEA**

## How to Run

1. Open the project in **IntelliJ IDEA**.
2. Set **JDK 25** as the Project SDK.
3. Run the `Main` class.
