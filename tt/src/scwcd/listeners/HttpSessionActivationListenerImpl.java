/**
 * 
 */
package scwcd.listeners;


import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * @author Juan Pedro Dominguez Soberanes
 * 
 */
public final class HttpSessionActivationListenerImpl implements HttpSessionActivationListener {


	public void sessionDidActivate(HttpSessionEvent arg0) {
		System.out.println("sessionDidActivate");	
	}


	public void sessionWillPassivate(HttpSessionEvent arg0) {
		System.out.println("sessionWillPassivate");	
	}



}
