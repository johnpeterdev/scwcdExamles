/**
 * 
 */
package scwcd.listeners;


import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
/**
 * @author Juan Pedro Dominguez Soberanes
 * 
 */
public final class ServletRequestListenerImpl implements ServletRequestListener {


	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("requestDestroyed");	
	}

	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("requestInitialized");	
	}

}
