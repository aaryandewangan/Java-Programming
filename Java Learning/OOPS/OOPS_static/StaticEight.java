package OOPS.OOPS_static;

class StaticEight {
    public void show1()
    {
        System.out.println("Non Static Show 1");
    }
    public static void show2()
    {
        System.out.println("Static Show 2");
    }
    {
        show1();
    }
    static{
        show2();
    }

    public static void main(String[] args) {
        StaticEight s = new StaticEight();
        System.out.println("Main");
    }
}
