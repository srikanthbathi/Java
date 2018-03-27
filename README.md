https://orga.cat/posts/most-useful-git-commands

**Immutable Class** -- A class is said to be immutable if the state of the  class cannot be modified once created.

**Steps to create Immutable Class** -
1. Class should be final, if a class declared as final cannot be inherited.
2. Set the access specifier of the variable to final so that once declared cannot be changed.
3. initialize the private variable using public parameterized constructor.
4. No setter methods should be there so that the private instance variables cannot be changed.


Points to be noted while creating private final variables --  IF we declare an object as final means it holds reference to an object, then the state of the object may be changed by operations on the object, but the variable will always refer to same object. 

Example- 

**final Class ImmutableClass{
private final String str;

**public ImmutableClass(String str){
this.str = str;
}
public String getString(){
return str;
**}
**}**
