# CSC6301 Assignments 4 and 5

This repository contains my Assignment 4 and Assignment 5 projects for CSC6301 Software Engineering.

# Assignment 4 - Flexible Notification System

## Description
This project demonstrates the use of composition and interfaces in Java. The system allows different notification methods to be used without modifying the core AlertSystem class.

## Requirements
- Java JDK 25 (or compatible version)
- VS Code, Eclipse, IntelliJ, or another Java IDE

## Opening the Project

1. Download or clone the repository.
2. Navigate to the Assignment 4 project folder.
3. Open the folder in your preferred Java IDE.
4. Ensure all Java files are in the same project directory.

## Running the Project

Compile the files:

```bash
javac *.java
```

Run the program:

```bash
java AlertSystem
```

## Included Files

- AlertSystem.java
- NotificationMedium.java
- EmailService.java
- SMSService.java
- UML documentation
- JavaDocs (docs folder)

# Assignment 5 - WhatsApp Integration Enhancement

## Description

This project extends the Flexible Notification System by adding WhatsApp support while following the Open-Closed Principle and maintaining the original architecture.

## Requirements

- Java JDK 25 (or compatible version)
- VS Code, Eclipse, IntelliJ, or another Java IDE

## Opening the Project

1. Download or clone the repository.
2. Navigate to the Assignment 5 project folder.
3. Open the folder in your preferred Java IDE.
4. Ensure all Java files are located in the same project directory.

## Running the Project

Compile the files:

```bash
javac *.java
```

Run the program:

```bash
java AlertSystem
```

## Included Files

- AlertSystem.java
- NotificationMedium.java
- EmailService.java
- SMSService.java
- WhatsAppService.java
- UML documentation
- JavaDocs (docs folder)

# Notes

The projects were designed using interfaces and composition. Additional notification methods can be added by creating a new class that implements the `NotificationMedium` interface. The `AlertSystem` class does not need to be modified when adding new notification services.

Documentation generated through JavaDocs is included in the `docs` folder for future maintenance and development.
