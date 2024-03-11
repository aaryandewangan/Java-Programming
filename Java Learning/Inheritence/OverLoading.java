class A{
    int x = 10;
    int y = 5;
    public void add()
    {
        int sum = x+y;
        System.out.println("Addition: "+sum);
    }
}
class B extends A{
    public void sub()
    {
            int sub = x-y;
            System.out.println("Subtraction: "+sub);
    }
}

class OverLoading{
    public static void main(String[] args) {
        B obj = new B();
        obj.add();
        obj.sub();
    }
}