package OOPS.OOPS_static;

class StaticSeven {
        public void show()
        {
            System.out.println("Non Static");
        }
        {
            show();
        }
        static
        {
            System.out.println("Static");
        }

        public static void main(String[] args) {
            StaticSeven s = new StaticSeven();
            System.out.println("Main"); 
        }
}