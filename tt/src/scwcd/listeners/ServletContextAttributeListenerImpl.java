/**
 * 
 */
package scwcd.listeners;

import javax.servlet.*;

/**
 * @author Juan Pedro Dominguez Soberanes
 * 
 */
public final class ServletContextAttributeListenerImpl implements ServletContextAttributeListener {


	public void attributeAdded(ServletContextAttributeEvent arg0) {
		
		System.out.println("attributeAdded : " + arg0.getName());	
	}

	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("attributeRemoved");
	}

	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("attributeReplaced");
	}

	
}
