# Overriding

1. Argument list in overridden and overriding methods must be exactly same.
2. Return type of overriding method can be child class of return type declared in overridden method.
3. Private, static and final methods can not be overridden.
4. Overriding method can not throw checked Exception higher in hierarchy.
5. Overriding method can not reduce the access scope of overridden method.

# Abstract Class

1. An abstract class must be declared with an abstract keyword.
2. Abstract classes are flexible in declaring the methods. You can define abstract methods with protected accessibility also.                Additionally, you can define static methods as well, provided they are not abstract. Non-abstract static methods are allowed.
3. It cannot be instantiated.
4. It can have constructors.
5. If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make      this class abstract.
6. A class can be abstract even without any abstract method.(there is no point doing it)

   ### Use 
    1. Factory method pattern
    2. Abstract class to write flexible code (You want to share code among several closely related classes)
    3. Achieve Abstraction (0 to 100%)
    4. More suited for code reuse and evolution perspective.
    
   ### Example
    1. AbstractMap
    2. HttpServlet
