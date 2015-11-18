/**
 * 
 */
package scwcd.listeners;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;


/**
 * @author Juan Pedro Dominguez Soberanes
 * 
 */
public final class HttpSessionBindingListenerImpl implements HttpSessionBindingListener {


	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("valueBound");	
	}


	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("valueUnbound");	
	}





}
