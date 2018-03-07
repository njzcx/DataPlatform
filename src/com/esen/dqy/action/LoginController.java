package com.esen.dqy.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.esen.dqy.entity.Login;

@Controller
@RequestMapping("/restful/login")
public class LoginController extends BaseController {
	
	/**
	 * 登录操作
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST)
	public String login(HttpServletRequest request, String id, String password) {
		Login login = (Login) request.getSession().getAttribute("esen-dqy-loginobj");
		if (login == null) {
			login = new Login();
		}
		//登录验证
		if (login.isLogined()) {
			return "redirect:/";
		}
		if (id.equals(password)) {
			login.setId(id);
			login.setLogined(true);
			request.getSession().setAttribute("esen-dqy-loginobj", login);
			System.out.println("登录成功");
			return "redirect:/";
		}
		System.out.println("登录失败");
		return null;
	}
	@RequestMapping(method=RequestMethod.GET)
	public String index() {
		return "/pages/sys/login";
	}
}
