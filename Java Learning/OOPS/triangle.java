package OOPS;
import java.lang.Math;

class Triangle {
    int s1, s2, s3;
    public Triangle(){
        s1 = 4;
        s2 = 5;
        s3 = 6;
    }
    public void area()
    {
        double sp = (s1+s2+s3)/2;
        double area = sp*((sp-s1)*(sp-s2)*(sp-s3));
        area = Math.sqrt(area);
        System.out.println("Area: "+area);
    }
    public void perimeter()
    {
        int peri = s1+s2+s3;
        System.out.println("Perimeter: "+peri);
    }

    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.area();
        obj.perimeter();
    }
}
