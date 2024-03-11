package OOPS.OOPS_static.ThisKeyword;

class Thisone {
    int a;
    int b;

    Thisone(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public void display()
        {
            System.out.println("a: "+a+"\n"+"b: "+b);
        }
        public static void main(String[] args) {
            Thisone obj = new Thisone(10, 20);
            obj.display();
        }
}
