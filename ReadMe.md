## What's a design pattern?
Design patterns are typical solutions to commonly occurring problems in software design. They are like pre-made blueprints that you can customize to solve a recurring design problem in your code.

You can’t just find a pattern and copy it into your program, the way you can with off-the-shelf functions or libraries. The pattern is not a specific piece of code, but a general concept for solving a particular problem. You can follow the pattern details and implement a solution that suits the realities of your own program.

Patterns are often confused with algorithms, because both concepts describe typical solutions to some known problems. While an algorithm always defines a clear set of actions that can achieve some goal, a pattern is a more high-level description of a solution. The code of the same pattern applied to two different programs may be different.

An analogy to an algorithm is a cooking recipe: both have clear steps to achieve a goal. On the other hand, a pattern is more like a blueprint: you can see what the result and its features are, but the exact order of implementation is up to you.

## Why should I learn patterns?
Design patterns are a toolkit of tried and tested solutions to common problems in software design. Even if you never encounter these problems, knowing patterns is still useful because it teaches you how to solve all sorts of problems using principles of object-oriented design.

Design patterns define a common language that you and your teammates can use to communicate more efficiently. You can say, “Oh, just use a Singleton for that,” and everyone will understand the idea behind your suggestion. No need to explain what a singleton is if you know the pattern and its name.

## Classification of patterns
**Creational patterns** provide object creation mechanisms that increase flexibility and reuse of existing code.

**Structural patterns** explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient.

**Behavioral patterns** take care of effective communication and the assignment of responsibilities between objects.

## Design Principles
1) **Encapsulate What Varies**: from a class try to find behaviours which vary frequently with each new requirement. It is always better to separate these behaviours from behaviors which are static or does not change frequently. Having separate classes/methods for frequently changing helps us in maintaining code, making changes to these classes doesn't break the main class.
2) **Code to an interface/supertype, rather than concrete classes**: It's Always better to code to an interface. The point is to exploit polymorphism by programming to a supertype so that the actual runtime object isn't locked into the code.
3) **Favor composition over inheritance**: Has-A relationship is better than IS-A relationship. It helps to change the behavior of objects at runtime.
4) **Strive for loosely coupled designs between objects that interact**: Loosely coupled designs help us to build flexible OO design systems that can handle changes better since we have minimized the interdependency between the objects.

