package Abstract;

abstract class Test {
    abstract void m1();
    abstract void m2();
    abstract void m3();
    void m4(){
        System.out.println("m4 is nor Abstract");
    }
}
abstract class A extends Test{
    void m1(){
        System.out.println("m1 is Abstract");
    }
}
abstract class B extends A{
    void m2(){
        System.out.println("m2 is Abstract");
    }
}
abstract class C extends B{
    void m3(){
        System.out.println("m3 is Abstract");
    }
}

class AbstractTwo extends C
{
    public static void main(String[] args) {
        AbstractTwo o = new AbstractTwo();
        o.m1(); o.m2(); o.m3(); o.m4();
    }
}