import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Employee_Update
{
  public void updateFile(String s,String o,String n) throws IOException
  {
   File file = new File("file"+s+".txt");
   try (Scanner sc = new Scanner(file)) {
	String fileContext="";
	   while (sc.hasNextLine())
	       {
	         fileContext =fileContext+"\n"+sc.nextLine();
	       }
	   FileWriter myWriter = new FileWriter("file"+s+".txt");
	   fileContext = fileContext.replaceAll(o,n);
	   myWriter.write(fileContext);
	   myWriter.close();
}

  }
}
