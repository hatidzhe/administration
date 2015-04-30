import java.io.*;
import java.util.regex.*;

class Count
{
public static void main(String args[]) throws Exception
{
FileReader fr=new FileReader("test.txt");
BufferedReader br =new BufferedReader(fr);
String str=null;
int count=0;
while((str=br.readLine())!=null)
{
Pattern pat=Pattern.compile("[ ]");
String str1[]=pat.split(str);
count=count+str1.length;
}
System.out.println("the number of the words in the file are "+count);
}
}
