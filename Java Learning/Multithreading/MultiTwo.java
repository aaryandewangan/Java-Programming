package Multithreading;

class MultiTwo extends Thread {
    public void run()
    {
        System.out.println("Inside Run Method");
    }
    public static void main(String[] args) {
        MultiTwo t1 = new MultiTwo();
        MultiTwo t2 = new MultiTwo();
        MultiTwo t3 = new MultiTwo();

        System.out.println("t1 thread priority: "+t1.getPriority());
        System.out.println("t2 thread priority: "+t2.getPriority());
        System.out.println("t3 thread priority: "+t3.getPriority());
        
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        System.out.println("t1 thread priority: "+t1.getPriority());
        System.out.println("t2 thread priority: "+t2.getPriority());
        System.out.println("t3 thread priority: "+t3.getPriority());
    }
}