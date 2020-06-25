# java101Inventory

Java 8 Inventory App

This is an inventory App intended to practice concepts of Object Oriented Programming. This app is taken from a course in preparation for the 1Z0-811: Java Foundations Exam. It employs core OOP concepts such as Encapsulation, Inheritance, Polymorphism as well as Abstraction. 

The architecture of the system is as follows:
Domain- Package containing all the classes for the inventory system:
  Product,
    Good,
      Liquid,
      Solid,
    Service,
  Order,
    Rushable.

Testing- Package containing four testing files for each aspect of the app:
  TestConversionService,
  TestGoods,
  TestMyDate,
  TestOrders.

Utils- Package containing two utility files used in the app:
  ConversionService,
  MyDate.

