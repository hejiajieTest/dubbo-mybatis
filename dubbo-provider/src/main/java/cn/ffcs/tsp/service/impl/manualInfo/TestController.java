package cn.ffcs.tsp.service.impl.manualInfo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/test.do")
	public void test(){
		System.out.println("test");
	}
}
