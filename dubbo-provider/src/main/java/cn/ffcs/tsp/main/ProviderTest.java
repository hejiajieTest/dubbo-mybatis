package cn.ffcs.tsp.main;

import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ffcs.tsp.dubboService.impl.manualInfo.ManualInfoDubboImpl;
import cn.ffcs.tsp.dubboservice.manualInfo.IManualInfoDubboService;
import cn.ffcs.tsp.entity.manualInfo.ManualInfo;

public class ProviderTest {

	public static void main(String[] args) throws IOException {
//		ApplicationContext ds = new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
//	    // 阻塞当前进程，否则程序会直接停止
//	    try {
//			System.in.read();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:configs/applicationContext.xml");
//		ctx.start();
//        System.out.println(ctx);
//        //查询所有
//		ManualInfoDubboImpl ds = (ManualInfoDubboImpl) ctx.getBean("manualInfoDubboImpl",ManualInfoDubboImpl.class);
//        List<ManualInfo> list = ds.findAll();
//        System.out.println(list.size());
        //System.in.read();
        StartJetty.getInstance().startJetty();
	}
}
