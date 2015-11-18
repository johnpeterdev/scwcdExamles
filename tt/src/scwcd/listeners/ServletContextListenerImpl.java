/**
 * 
 */
package scwcd.listeners;

import javax.servlet.*;

/**
 * @author Juan Pedro Dominguez Soberanes
 * 
 */
public final class ServletContextListenerImpl implements ServletContextListener {
		public void contextInitialized(ServletContextEvent servletContextEvent) {
			servletContextEvent.getServletContext();
			System.out.println("contextInitialized");
			ServletContext cont= servletContextEvent.getServletContext();
			cont.setAttribute("atributo context set", "atributo context set");
		}

		public void contextDestroyed(ServletContextEvent event) {
		}

	
}
