package cn.yi.day1.springmvc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController_1 {
	private static final Log logger = LogFactory.getLog(HelloController.class);
	
	@RequestMapping(value="/hello")
	public ModelAndView hello(){
		logger.info("hello方法被调用");
		// 创建准备返回的ModelAndView对象，该对象包含了返回视图名、模型的名称及模型对象
		ModelAndView mv = new ModelAndView();
		// 添加数据模型，可以使任意的POJO对象
		mv.addObject("message", "Hello World!");
		mv.setViewName("/WEB-INF/content/welcome.jsp");
		return mv;
	}

	
}
