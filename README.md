https://orga.cat/posts/most-useful-git-commands

**Immutable Class** -- A class is said to be immutable if the state of the  class cannot be modified once created.

**Steps to create Immutable Class** -
1. Class should be final, if a class declared as final cannot be inherited.
**If we allow the class to inherit, there will be a chance of changing the state of final variable refering to some object and also it** **allows subclasses to override method implementations, so best approach to make a class immutable is by declaring it final**
**Or make all the methods and variables as final**
2. Set the access specifier of the variable to final so that once declared cannot be changed.
3. initialize the private variable using public parameterized constructor.
4. No setter methods should be there so that the private instance variables cannot be changed.


Points to be noted while creating private final variables --  IF we declare an object as final means it holds reference to an object, then the state of the object may be changed by operations on the object, but the variable will always refer to same object. 

**An instance of immutable class can be considerd as final object i.e the state cannot be changed** 


Example- 

final Class ImmutableClass{
private final String str;

public ImmutableClass(String str){
this.str = str;
}
public String getString(){
return str;
}
}

**when you pass object reference to the immutable class constructior while intansiating please make sure to clone the reference passed inside constructor while assigning to final object reference variable and return the cloned object in getter**

**final keyword** -- The final keyword is a modifier used to restrict the user. The final keyword can be used in different contexts.

final means we cannot change the value once assigned but the reference value that pointing to an object state can be muted.

**when we talk in terms of variables and objects, final modifier is applicable for variables but not for objects where as immutability is applicable for only objects.** 

1. Variable - stop value change 
2. Method - Stop method overridding
3. Class - Stop Inheritance
