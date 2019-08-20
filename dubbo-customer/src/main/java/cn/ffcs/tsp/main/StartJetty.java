package cn.ffcs.tsp.main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class StartJetty {

	private static StartJetty st = new StartJetty();
	
	private static boolean status = false;
	
	private StartJetty(){}
	
	static{
	}
	
	public static StartJetty getInstance(){
		return st ;
	}
	
	public static boolean getStatus(){
		return status ;
	}
	
	public void startJetty(){
		    Server server = new Server(1800);
	        WebAppContext webapp = new WebAppContext();
	        webapp.setContextPath("/consumer");
	        webapp.setResourceBase("D:/dubbotest/dubbo/dubbo-customer/WebContent/");
	        webapp.setDescriptor("D:/dubbotest/dubbo/dubbo-customer/WebContent/WEB-INF/web.xml");
	        webapp.setParentLoaderPriority(true);
	        webapp.setClassLoader(Thread.currentThread().getContextClassLoader());
	        server.setHandler(webapp);
	        try {
	            System.out.println("===========================================================");
	            server.start();
	            System.out.println("===========================================================");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
}
