package cn.ffcs.tsp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ffcs.tsp.controller.logWarning.LogWarningController;
import cn.ffcs.tsp.entity.logWarning.LogWarning;
import cn.ffcs.tsp.main.StartJetty;
public class CustomerTest {

	public static void main(String[] args) {
//	    ApplicationContext context 
//	        = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//	   // IManualInfoDubboService manualInfoService = (IManualInfoDubboService) context.getBean("manualInfoDubboService",IManualInfoDubboService.class);
//	    //demoService.test();
//	   // List<ManualInfo> list = manualInfoService.findAll();
//	    
//	    ManualInfoController manualInfoController = (ManualInfoController) context.getBean("manualInfoController",ManualInfoController.class);
//	    //demoService.test();
//	    //List<ManualInfo> list = manualInfoController.getBean().findAll();
//	    List<ManualInfo> list = manualInfoController.findAll();
//	    System.out.println(list.size());
//	    
//	    LogWarningController logWarningController = (LogWarningController) context.getBean("logWarningController",LogWarningController.class);
//	    System.out.println(context);		
	    //demoService.test();
//	    List<LogWarning> logWarningList = logWarningController.getBean().findAll();
//	    List<LogWarning> logWarningList = logWarningController.findAll();
//	    System.out.println(logWarningList.size());
		StartJetty.getInstance().startJetty();
	}
}
