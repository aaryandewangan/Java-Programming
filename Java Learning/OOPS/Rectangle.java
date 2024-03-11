package OOPS;

class Rectangle {
    public Rectangle(int l1, int l2, int b1, int b2)
    {
    }

    public int rec1(int l1, int b1)
    {
        int area1 = l1*b1;
        return area1;
    }
    public int rec2(int l2, int b2)
    {
        int area2 = l2*b2;
        return area2;
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle(4, 5, 5, 8);
        int ar1 = obj.rec1(4, 5);
        int ar2 = obj.rec1(5, 8);
        System.out.println("Area of Rectangle 1: "+ar1);
        System.out.println("Area of Rectangle 2: "+ar2);
    }
}