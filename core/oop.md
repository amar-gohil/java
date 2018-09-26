### Overriding

1. Argument list in overridden and overriding methods must be exactly same.
2. Return type of overriding method can be child class of return type declared in overridden method.
3. Private, static and final methods can not be overridden.
4. Overriding method can not throw checked Exception higher in hierarchy.
5. Overriding method can not reduce the access scope of overridden method.

### Abstract Class

1. An abstract class must be declared with an abstract keyword.
2. It can have abstract and non-abstract methods, final, static private method.
3. It cannot be instantiated.
4. It can have constructors.
5. If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make      this class abstract.

   # Use 
    1.
   # Example
    1. AbstractMap
    2. HttpServlet
