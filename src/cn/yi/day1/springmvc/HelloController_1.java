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
		logger.info("hello����������");
		// ����׼�����ص�ModelAndView���󣬸ö�������˷�����ͼ����ģ�͵����Ƽ�ģ�Ͷ���
		ModelAndView mv = new ModelAndView();
		// �������ģ�ͣ�����ʹ�����POJO����
		mv.addObject("message", "Hello World!");
		mv.setViewName("/WEB-INF/content/welcome.jsp");
		return mv;
	}

	
}
