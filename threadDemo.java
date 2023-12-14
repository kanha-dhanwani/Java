class threadusinginterface implements Runnable
{
    Thread t;
    threadusinginterface()
    {
        t = new Thread(this , "Demo Thread");
        System.out.println("child Thread" + t);
        t.start();
    }
    public void run()
    {
        try
        {
            for(int i=5;i>0;i--)
            {
                System.out.println("child thread" + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("child interrupted");
        }
         System.out.println("exiting child");
    }
    }
    class threadDemo
    {
    public static void main(String args[])
    {
        new threadusinginterface();
        try{
             for(int i=5;i>0;i--)
            {
                System.out.println("main thread" + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("main thread interrupted");
        }
         System.out.println(" main exit");
    }
}