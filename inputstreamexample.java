import java.io.*;

public class inputstreamexample 
{
    public static void main(String[] args){
        InputStream input = null;

        try{
            input = new FileInputStream("sample.txt");

            System.out.println("Char - "+(char)input.read());
            System.out.println("Char - "+(char)input.read());
        }

        catch(Exception ex){
            System.out.println(ex);
        }

        finally{
            input.close();
        }
    }
}
