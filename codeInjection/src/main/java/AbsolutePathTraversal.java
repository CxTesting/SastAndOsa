import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AbsolutePathTraversal
{
	public static void doSomething(HttpServletRequest request) throws FileNotFoundException {
		String fileName = request.getParameter("FileName");
		FileReader fr = new FileReader(fileName);
	}
}