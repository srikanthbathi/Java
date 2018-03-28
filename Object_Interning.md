**Object Interning** --

Object interning in java is storing only one copy, i.e immutable. It mainly helps in reducing the memory requirement.
Example of object interning is String objects, Java by default interns the string literals.
And also it is used to return from string pool when created with new keyword.


String s1 = "Test"; // Will create  a String object in string pool
String s2 = "Test"; // Will refer to the String object "Test" created previously
String s3 = new String("Test");// When we try create any string object with new keyword, the JVM will create the object in heap memory and also in String pool. In this the object is already created in string pool so only one instace will be created i.e in heap memory.
String s4 = s3.intern();  // **will return the String reference created in strin pool**

s1==s2 // true
s1==s3 // false
s1==s4 // true
s3==s4// false

**Integer interning** -- 

In case of Integer wrapper classes, this **object interning will happen for integers between the range of -128 to 127.**
Integer count = 973;
Integer test = 973;
System.out.println(count==test); **will return false because count and test variables has different references to integer due to reason of not interning**

Where as in the below example

Integer count = 20;
Integer test = 20;
System.out.println(count==test); // is true because these integeres objects are interned


**So Always use compareTo or equals method while comparing the instances of these wrapper classes.**

