package cn.yi.day1.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class HelloController implements Controller {

	private static final Log logger = LogFactory.getLog(HelloController.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.
	 * servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.info("handleRequest������");
		// ����׼�����ص�ModelAndView���󣬸ö�������˷�����ͼ����ģ�͵����Ƽ�ģ�Ͷ���
		ModelAndView mv = new ModelAndView();
		// �������ģ�ͣ�����ʹ�����POJO����
		mv.addObject("message", "Hello World!");
		mv.setViewName("/WEB-INF/content/welcome.jsp");

		return mv;

	}

}
