package Abstract;

abstract class AbstractOne {
    abstract void m1();
    abstract void m2();
    abstract void m3();
    
    void m4()
    {
        System.out.println("m4 is not Abstract");
    }
}

class Test extends AbstractOne
{
    void m1()
    {
        System.out.println("m1 is Abstract");
    }
    void m2()
    {
        System.out.println("m2 is Abstract");
    }
    void m3()
    {
        System.out.println("m3 is Abstract");
    }
}

class Main
{
    public static void main(String[] args) {
        Test obj = new Test();

        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}