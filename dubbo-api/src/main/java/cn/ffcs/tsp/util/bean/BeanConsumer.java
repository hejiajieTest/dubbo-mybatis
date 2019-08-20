package cn.ffcs.tsp.util.bean;


import cn.ffcs.tsp.dubboservice.logWarning.ILogWarningDubboService;
import cn.ffcs.tsp.dubboservice.manualInfo.IManualInfoDubboService;

public class BeanConsumer {

	static{
		ServletBeanContext.getInstance().loadPath("classpath:dubbo-consumer.xml");
	}
	
	public static IManualInfoDubboService getManualInfoDubboBean(){
		return (IManualInfoDubboService) 	ServletBeanContext.getInstance().getBean("manualInfoDubboService");
	}
	
	public static ILogWarningDubboService getLogWarningBean(){
		return (ILogWarningDubboService)  ServletBeanContext.getInstance().getBean("logWarningDubboService");
	}
}
