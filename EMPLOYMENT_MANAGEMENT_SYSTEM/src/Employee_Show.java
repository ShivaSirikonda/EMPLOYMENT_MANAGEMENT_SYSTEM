import java.io.File;
import java.util.*;

class Employee_Show
{
  public void viewFile(String s) throws Exception
  {
    File file = new File("file"+s+".txt");
    try (Scanner sc = new Scanner(file)) {
		while (sc.hasNextLine())
		 {
		   System.out.println(sc.nextLine());
		 }
	}
   }
}
