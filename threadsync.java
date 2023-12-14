class callme
{
    void call(String message)
    {
        System.out.println("["+ message);
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
class caller implements Runnable
{
    String message;
    callme target;
    Thread t;
    public caller(callme targ, String s)
    {
        target = targ;
        message = s;
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
        Synchronised(target);
        target.call(message);
    }
}
class threadsync
{
    public static void main(String args[])
    {
        callme target = new callme();
        caller ob1 = new caller(target, "Hello");
        caller ob2 = new caller(target, "Synchronised");
        caller ob3 = new caller(target, "World");
        try 
        {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
    }
}