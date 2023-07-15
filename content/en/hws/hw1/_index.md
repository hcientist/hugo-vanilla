---
title: "HW1: Duke-n-Donuts v1"
linkTitle: "HW1: Duke-n-Donuts v1"
categories: ["Homework"]
tags: [
    "Homework",
    "Homework1",
    "data types",
    "variables",
    "literals",
    "operators",
  ]
draft: true
type: docs
---
# Homework 1

![Duke-n-Donuts](Duke-n-Donuts_v1.png)

## Learning Objectives

This homework assignment is designed to help you learn several
things. First, it will help you learn about data types, variables,
literals, arithmetic operators, how utility classes are organized,
static attributes, and declaring static methods. Second, it will help
you become comfortable with some of the tools that you will be using
throughout the semester. Third, it will help you become comfortable
with the various policies (including submission policies) that you
must comply with while working on homework assignments and
programming assignments this semester.

## Overview

A group of former JMU students have decided to open a bakery called
*Duke-n-Donuts*. They have asked you to create a utility class named
`DonutPricer` that they can use to calculate the price of a particular
order. All types of donuts are priced the same way and all donuts are
"delivered" in a box (that may be full or partially full). The number
of donuts that fit in a full box is given by `BOX_SIZE`. The price of
a full box of donuts is given by `PRICE_PER_BOX` and the price of an
individual donut is given by `PRICE_PER_INDIVIDUAL`.


## The Class to be Written

You must write the `DonutPricer` class.

### The UML Class Diagram

The following UML class diagram provides an overview of the attributes
and methods in this class (which must be in the default package).

![Class Diagram](DonutPricer.png)

### Detailed Design Specifications

In addition to the specifications contained in the UML class diagram,
this class must conform to the following specifications.

1. All of the "constants" must be declared to be final.
2. All of the methods that are passed a number of donuts and return a number (wheter an `int` or a `double`) must return 0 when the number of donuts is less than or equal to 0. (Note: There is a method that is passed a number of donuts and returns a `boolean`. The specifications for that method are given below.)
3. `numberOfFullBoxes()` and `numberOfBoxes()` must return the number of full boxes and the total number of boxes required to hold the order. So, for example, an order of 98 donuts will require 8 full boxes and 9 boxes in total.
4. `numberOfExtras()` must return the number of donuts in the order that will be in a box that isn't full. So, for example, an order of 98 donuts will have 2 extras (since 96 of the donuts will be in full boxes).
5. `needAnExtraBox()` must return `true` if there are extra donuts in the order and must return `false` otherwise. This method must not use an `if` statement, loop, or ternary operator.
6. `priceFor()` must return the price of an order of the given size. When a customer orders less than a full box, they pay the individual price for each donut. So, for example, an order of 6 donuts will have a price of $5.94. When a customer orders a full box, they pay the price of a full box. For example, an order of 12 donuts will have a price of $9.99. Finally, when a customer orders more than a full box, they pay the price of however many full boxes there are plus the cost of the extras. For example, an order of 98 donuts will have a price of $81.90 (8 boxes at $9.99 plus 2 extras at $0.99 each).
7. Methods must not duplicate the code in other methods unless it is absolutely necessary (e.g., for parameter validation). Instead, methods must invoke each other as needed.



## An Existing Class

A main class (i.e., a class with a `main()` method) that you can use to test
the `DonutPricer` class has already been written. It is named
`DonutPricerTest` and the source code (i.e., the `.java` file) is
available at:

[`DonutPricerTest.java`](DonutPricerTest.java)


## Submission

You must submit (using Gradescope):

1. Your implementation of the `DonutPricer` class. Do not include the `DonutPricerTest` class.

There is no limit on the number of submissions and no penalty for excessive submissions. Note that your submission will not be graded if it does not comply with the specifications. So, if you do not complete the `DonutPricer` class your submission should include a stubbed-out version of all of the methods. This will allow you to potentially get credit for the methods that you do implement.

## Grading

Your code will first be graded by Gradescope and then by the Professor. The grade you receive from Gradescope is the maximum grade that you can receive on the assignment

### Gradescope Grading

Your code must compile (in Gradescope, this will be indicated in the section on "Does your code compile?") and all class names and method signatures must comply with the specifications (in Gradescope, this will be indicated in the section on "Do your class names, method signatures, etc. comply with the specifications?") for you to receive any points on this assignment. Gradescope will then grade your submission as follows:

| Criterion | Points | Details |
| --------- | ------ | ------- |
| Conformance to the Style Guide | 20 points | (Partial Credit Possible) |
| Correctness                    | 80 points | (Partial Credit Possible) |

Gradescope will provide you with hints, but may not completely identify the defects in your submission.

### Manual Grading

After the due date, the Professor may manually review your code. At this time, points may be deducted for inelegant code, inappropriate variable names, bad comments, etc.

## Recommended Process

Since nobody will be looking over your shoulder, you can use any process that you would like to use. However, it is strongly recommended that you use the process described here.

### Get Started

1. Read and understand the entire assignment.
2. Create a project for this assignment named `hw1`. (Remember, do not create a module and create separate folders for source and class files).
3. Activate Checkstyle for this assignment.
4. Download  `DonutPricerTest.java` to a directory outside of your Eclipse workspace (e.g., the `downloads` directory for this course).

### Understand the Test Cases

1. Read and understand the test cases in `DonutPricerTest.java`.
2. By hand (i.e., using pencil and paper), calculate the expected answer for each of the test cases in `DonutPricerTest.java`.

### Stub-Out `DonutPricer.java`

1. Create a version of the `DonutPricer` class that contains all of the methods (with appropriate signatures), each of which should return `0`, `0.0`, or `false` as appropriate. (Remember: All of the classes you write for this assignment must be in the default package. So, when you create a new class in Eclipse, make sure that the "Package" field is blank.)
2. Add the "javadoc" comments to the `DonutPricer` class and the methods in it. ([Help on "javadoc" comments](https://wiki.cs.jmu.edu/student/java/javadoc) is available on the Department's Wiki.)
3. Check the style of the `DonutPricer` class and make any necessary corrections.

### Add `DonutPricerTest.java` to the Project

1. Add `DonutPricerTest.java` to the project. ([Help on adding source files to a project](https://wiki.cs.jmu.edu/student/eclipse/help#adding_existing_source_files_to_a_project) is available on the Department's Wiki.)
2. Make sure there are no compile-time errors in `DonutPricerTest.java`. If there are, you probably need to fix the stubbed-out version of `DonutPricer.java` (since there should be no syntax errors in `DonutPricerTest.java`).


### Implement and Test the  `DonutPricer` Class

1. Add the "constants".
2. Add the `numberOfFullBoxes()` method.
3. Run the `DonutPricerTest` class and make sure that all of the answers returned by the `numberOfFullBoxes()` method are correct.
4. Debug `numberOfFullBoxes()` if necessary.
5. Add the `numberOfExtras()` method.
6. Run the `DonutPricerTest` class and make sure that all of the answers returned by the `numberOfExtras()` method are correct.
7. Debug `numberOfExtras()` if necessary.
8. Add the `needAnExtraBox()` method.
9. Run the `DonutPricerTest` class and make sure that all of the answers returned by the `needAnExtraBox()` method are correct.
10. Debug `needAnExtraBox()` if necessary.
11. Add the `numberOfBoxes()` method.
12. Run the `DonutPricerTest` class and make sure that all of the answers returned by the `numberOfBoxes()` method are correct.
13. Debug `numberOfBoxes()` if necessary.
14. Add the `priceFor()` method.
15. Run the `DonutPricerTest` class and make sure that all of the answers returned by the `priceFor()` method are correct.
16. Debug `priceFor()` if necessary.


## Help

[Help with Eclipse](https://wiki.cs.jmu.edu/student/eclipse/start) and [help with Gradescope](https://wiki.cs.jmu.edu/student/gradescope/start) are available on the Department's Wiki.

## Questions to Think About

You don't have to submit your answers to these questions, but you should try to answer them because they will help you determine whether or not you understand some of the important concepts covered in this assignment.

1. What compile-time errors (if any) do you get in `DonutPricer.java` class if you make the attributes non-static? Why?
2. What compile time errors (if any) do you get in `DonutPricer.java` if you make all of the methods non-static? Why?
3. What compile-time errors (if any) do you get in `DonutPricerTest.java` if you make the methods in `DonutPricer.java` non-static? Why?
4. Why does the recommended process have you test and debug each method immediately after you implement it?
5. Why does the recommended process have you implement the methods in the order it does? For example, why does it have you implement `numberOfBoxes()` after it has you implement `numberOfExtraBoxes()` and `needAnExtraBox()`?

