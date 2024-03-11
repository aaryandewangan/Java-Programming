package OOPS.OOPS_static;

class StaticFour
{
    static{
        System.out.println("Static 1");
    }
    static{
        System.out.println("Static 2");
    }
    static{
        System.out.println("Static 3");
    }
    public static void main(String[] args) {
        System.out.println("Main Static");
    }
    static{
        System.out.println("Static 4");
    }
}