import javax.servlet.http.HttpServletRequest;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

public class XPathInjection
{
	public static void doSomething(HttpServletRequest request) throws XPathExpressionException {
		XPathFactory factory = null;
		XPath xPath = factory.newXPath();
		String password = request.getParameter("Password");
		String expression = "/employees/employee[loginID/text()=' username ' and passwd/text()='" + password + "']";
		Object inputSource = new Object();
		xPath.evaluate(expression, inputSource, XPathConstants.NODESET);
	}
}