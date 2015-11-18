/**
 * 
 */
package scwcd.listeners;

import javax.servlet.*;

/**
 * @author Juan Pedro Dominguez Soberanes
 * 
 */
public final class ServletRequestAttributeListenerImpl implements ServletRequestAttributeListener {


	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		System.out.println("attributeAdded : " + arg0.getName());	
	}


	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println("attributeRemoved : " + arg0.getName());	
	}


	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("attributeReplaced : " + arg0.getName());	
	}



	
}
