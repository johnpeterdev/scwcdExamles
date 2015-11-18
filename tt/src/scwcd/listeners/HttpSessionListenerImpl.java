/**
 * 
 */
package scwcd.listeners;


import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author Juan Pedro Dominguez Soberanes
 * 
 */
public final class HttpSessionListenerImpl implements HttpSessionListener {
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("sessionCreated");	
	}
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("sessionDestroyed");	
	}
}
