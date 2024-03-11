package OOPS.OOPS_static;

class StaticSix {
    {
            System.out.println("Non Static");
    }
    static{
        System.out.println("Static");
    }

    public static void main(String[] args) {
        StaticSix s = new StaticSix();
        System.out.println("Main");
    }
}
