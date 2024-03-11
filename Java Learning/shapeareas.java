class shapeareas {
        public void areaRectangle(){
            int l=2, b=5;
            double r_area=l*b;
            System.out.println("Area of Rectangle = "+r_area);
        }
        public void periRectangle(){
            int l=2, b=5;
            double r_peri=2*(b-l);
            System.out.println("Perimeter of Rectangle = "+r_peri);
        }
        public void areaSquare(){
            int s=4;
            double s_area=s*s;
            System.out.println("Area of Square = "+s_area);
        }
        public void periSquare(){
            int s=4;
            double s_peri=4*s;
            System.out.println("perimeter of Square = "+s_peri);
        }
        public void areaCircle(){
            int r=5;
            double c_area=3.14*r*r;
            System.out.println("Area of Circle = "+c_area);
        }
        public void cirCircle(){
            int r=5;
            double c_cir=2*3.14*r;
            System.out.println("Circumference of Circle = "+c_cir);
        }
}
class rectangle {
    public static void main(String[] args) {
        shapeareas a=new shapeareas();
        a.areaRectangle();
        a.periRectangle();
        a.areaSquare();
        a.periSquare();
        a.areaCircle();
        a.cirCircle();
    }
}