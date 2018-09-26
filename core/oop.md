** Overriding **
1. Argument list in overridden and overriding methods must be exactly same.
2. Return type of overriding method can be child class of return type declared in overridden method.

	public Number sum(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer sum(Integer a, Integer b) {      //Integer extends Number; so it's valid
        return a + b;
    }

    But Not Valid-----

    public Integer sum(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Number sum(Integer a, Integer b) {      //Integer extends Number; so it's NOT valid
        return a + b;
    }

3. Private, static and final methods can not be overridden.
4. Overriding method can not throw checked Exception higher in hierarchy.

	public Integer sum(Integer a, Integer b) throws IOException  {
        return a + b;
    }

    public Integer sum(Integer a, Integer b) throws FileNotFoundException { //valid FileNotFoundException extends IOException
        return a + b;
    }

    But Not Valid-----

    public Integer sum(Integer a, Integer b) throws FileNotFoundException  {
        return a + b;
    }

    public Integer sum(Integer a, Integer b) throws  IOException{ // Not valid IOException Not extends FileNotFoundException
        return a + b;
    }

5. Overriding method can not reduce the access scope of overridden method.

	protected Integer sum(Integer a, Integer b) {
        return a + b;
    }

    public Integer sum(Integer a, Integer b)  {   
        return a + b;
    }

    But Not Valid-----

    protected Integer sum(Integer a, Integer b) {
        return a + b;
    }

    private Integer sum(Integer a, Integer b)  {   
        return a + b;
    }