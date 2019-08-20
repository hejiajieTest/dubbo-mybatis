package cn.ffcs.tsp.util.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServletBeanContext {

	//单例模式
	private static ServletBeanContext context ;
	
	private static ApplicationContext ctx ;
	//单例特点
	private ServletBeanContext(){}
	public static ServletBeanContext getInstance(){
		
		if(context == null){
			context = new ServletBeanContext() ;
		}
		return context;
	}
	
	public void loadPath(String path){
		ctx =new ClassPathXmlApplicationContext(path) ;
	}
	
	public Object getBean(String bean){
		return ctx.getBean(bean) ;
	}
	
}
