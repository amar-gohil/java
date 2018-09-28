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

# Interface

1. Interface all methods are public, abstract
2. Methods never final.
3. Declares only method headers.
4. Cannot be instantiated.
5. Can be implemented by a class, cannot extend a class, can extend several other interfaces.
6. An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both public, static and      final.
7. However you can implement more than one interfaces in your class.
8. An empty interface is known as tag or marker interface(Tag). For example Serializable, EventListener
9. An interface which is declared inside another interface or class is called nested interface. Entry interface inside Map.
10. Interface cannot be declared as private, protected or transient.
11. Interface variables must be initialized at the time of declaration.
12. Inside any implementation class, you cannot change the variables declared in interface because by default, they are public, static       and final. 
13. A class cannot implement two interfaces that have methods with same name but different return type.
14. Variable names conflicts can be resolved by interface name.
   ### Use
   1. Achieve Abstraction (100%)
