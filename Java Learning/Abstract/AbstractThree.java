package Abstract;

abstract class Test {
    Test(){
        System.out.println("Abstract Class Constructor");
    }
}
class AbstractThree extends Test{
    AbstractThree(){
        System.out.println("Normal Class Constructor");
    }

    public static void main(String[] args) {
        new AbstractThree();
    }
}