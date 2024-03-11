package OOPS.OOPS_static.ThisKeyword;

class ThisTwo {
    int a;
    int b;

    ThisTwo(){
        this(40,80);
    }
    ThisTwo(int x, int y)
    {
        a = x;
        b = y;
    }
    public void show()
    {
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    public static void main(String[] args) {
        ThisTwo t1 = new ThisTwo();
        ThisTwo t2 = new ThisTwo(100,120);

        t1.show();
        t2.show();
    }
}