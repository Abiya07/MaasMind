package p1;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

public class ExampleTag extends SimpleTagSupport {
	public void doTag()throws JspException,IOException{
		JspWriter out = getJspContext().getOut();
		out.print("<h1>Hellow World<h1>");
	}

}
