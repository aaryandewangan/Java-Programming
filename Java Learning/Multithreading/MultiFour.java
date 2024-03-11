package Multithreading;

class Test extends Thread {
    public void run()
    {
        try{
            for(int i =0; i<5; i++)
            {
                System.out.println("Child Thread");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Interrupted Exception has occured");
        }
    }
}

class MultiFour{
    public static void main(String[] args) throws InterruptedException {
        Test thread = new Test();
        thread.start();
        thread.interrupt();
        for(int i=0; i<10; i++)
        {
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
    }
}