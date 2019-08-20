package cn.ffcs.tsp.util.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import cn.ffcs.tsp.util.bean.ServletBeanContext;

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
	
	/*public void startJetty(){
		    Server server = new Server(1800);
	        WebAppContext webapp = new WebAppContext();
	        webapp.setContextPath(consumer);
	        webapp.setResourceBase(GisServiceBeanContext.getJettyProperties().get("server.resource"));
	        webapp.setDescriptor(GisServiceBeanContext.getJettyProperties().get("server.resource") + "/" + GisServiceBeanContext.getJettyProperties().get("server.descriptor"));
	        webapp.setParentLoaderPriority(true);
	        webapp.setClassLoader(Thread.currentThread().getContextClassLoader());
	        server.setHandler(webapp);
	        try {
	            System.out.println("===========================================================");
	            System.out.println("[" + DateUtil.getDateTime() + "] gisrest is starting......");
	            server.start();
	            System.out.println("[" + DateUtil.getDateTime() + "] gisrest has been started.");
	            System.out.println("[" + DateUtil.getDateTime() + "] Please visit: http://127.0.0.1" + ":" + GisServiceBeanContext.getJettyProperties().get("server.port") + GisServiceBeanContext.getJettyProperties().get("server.name"));
	            System.out.println("[" + DateUtil.getDateTime() + "] gisrest Start successfully.");
	            System.out.println("===========================================================");
	           // GisRestInit.ESInit();
	        } catch (Exception e) {
	            e.printStackTrace();
	}*/
}
