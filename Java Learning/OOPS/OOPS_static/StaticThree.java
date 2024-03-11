package OOPS.OOPS_static;

class StaticThree {
    static int n;
    static{
        n++;
    }
    public static void main(String[] args) {
        n++;
        System.out.println(n);
    }
}
