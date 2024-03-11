class A {
    public void showA(){
        System.out.println("Class A");
    }
}
class B extends A {
    public void showB(){
        System.out.println("Class B");
    }
}
class C extends A{
    public void showC(){
        System.out.println("Class C");
    }
}
class D extends A{
    public void showD(){
        System.out.println("Class D");
    }
}

class Hierarichal
{
    public static void main(String[] args) {
        D obj = new D();

        obj.showA();
        obj.showD();
    }
}