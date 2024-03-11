package OOPS.OOPS_static;

class StaticTwo {
    static int i;
    static{
        System.out.println(i);
    }
    public static void main(String[] args) {
        int j = 10;
        System.out.println(j);
    }
}
