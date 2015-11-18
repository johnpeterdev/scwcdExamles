package scwcd.listeners;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PruebaListeners extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public PruebaListeners() {
        super();

    }
	public void init(ServletConfig config) throws ServletException {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setAttribute("setAttribute", "setAttribute");
	request.setAttribute("setAttribute", "setAttribute");
	request.getAttribute("setAttribute");
	HttpSession oSession = request.getSession();

	oSession.setAttribute("Session.setAttribute",new HttpSessionBindingListenerImpl());
	oSession.getAttribute("Session.setAttribute");
	oSession.invalidate();
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
