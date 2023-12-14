import java.io.*;
class readstr
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Enter the line of Text");
        System.out.println("Enter Stop to Quit");
        for(int i=0; i<100; i++)
        {
            str[i] = br.readLine();
            if(str[i].equals("Stop"))
            {
                break;

            }
            
        }
        System.out.println("Here is your File");
        for(int i=0; i<100; i++)
        {
            if(str[i].equals("Stop"))
            break;
            System.out.println(str[i]);
        }

    }
}