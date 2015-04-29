import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.FileWriter;

public class Program {
    public static void main(String[] args) {
        System.out.println( "Heute ist : " + new java.util.Date().toString() );
        try {
            File file = new File( "datum.txt" );
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write( "Heute ist : " + new java.util.Date().toString() );
            output.close(); 
            
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }
}

