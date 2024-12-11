This my Java Generics 1 project.

The purpose of this project is to learn how to implement and use 
generics in Java to enhance type safety and flexibility in my code.

PART 1 of the PROJECT:
First we have a generic class Box, that can store any type of object. There
are getters and setter methods that allow you to modify or retrieve the value
from the box.

There is also a printBox method that allows you to print the value of the box. The
printBox method is capable of handing a Box containing any subtype of a specific
superclass.

There is also a generic class NumberBox that will only allow numeric types.

I also have a Processor interface which will accept an argument of the generic type
and return an object of the generic type.There is a StringProcessor that will take
in a string and reverse it.
--------------------------------------------------------------------------------------------

PART 2 of the PROJECT:
This is the application portion of my project. Here we have a Library generic
that is equipped to handle different types of Items, in our case CompactDisks (CD's)
and Books. There are functions implemented that will allow you to add items to the library,
remove them, and also find items by name.