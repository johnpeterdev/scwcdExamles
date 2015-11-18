/**
 * 
 */
package scwcd.listeners;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


/**
 * @author Juan Pedro Dominguez Soberanes
 * 
 */
public final class HttpSessionBindingAttirbuteListenerImpl implements HttpSessionAttributeListener {


	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("attributeAdded");	
	}


	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("attributeRemoved");	
	}


	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("attributeReplaced");	
	}











}
