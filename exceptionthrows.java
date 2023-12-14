import java.io.IOException;
class exceptionthrows
{
    void m() throws IOException
    {
        throw new IOException("Device Error");
    }
    void n() throws IOException
    {
        m();
    }
    void p()
    {
        try 
        {
            n();
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled");
        }
    }
    public static void main(String args[])
    {
        exceptionthrows ob = new exceptionthrows();
        ob.p();
        System.out.println("Normal Flow"); 
    }
}