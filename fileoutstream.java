import java.io.*;
class fileoutstream
{
    public static void main(String args[]) throws IOException
    {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String source = "Now this is the time";
        FileOutputStream f1 = new FileOutputStream("file1.txt");
        for(int i=0; i<byte.length; i=i+2)
        {
            f1.write(buf[i]);
        }
        f1.close();
        FileOutputStream f2 = new FileOutputStream("file2.txt");
        f2.write(buf);
        f2.close();
        FileOutputStream f3 = new FileOutputStream("file3.txt");
        f3.write(buf, buf.length- buf.length/4, buf.length/4);
        f3.close();
    }
}