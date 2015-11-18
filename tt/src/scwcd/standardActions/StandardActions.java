package scwcd.standardActions;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import scwcd.directives.BeanTO;

/**
 * Servlet implementation class StandardActions
 */
public class StandardActions extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StandardActions() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BeanTO bean =new BeanTO();
		bean.setNombre("ME OBTUVISTE DEL REQUEST");
		request.setAttribute("pruebaBeanRequestTO",bean) ;
		request.setAttribute("vengoenparametros", "valor de un parametro d el request");
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher( "standardActions/standardActions.jsp?parametro=valordeparametro&nombre2=nombre2conproperty*" );
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
