package com.esen.dqy.action;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.esen.dqy.entity.CompanyInfo;
import com.esen.dqy.service.IUserInfoMgr;

@Controller
@RequestMapping("/restful/companyinfo")
public class CompanyController extends BaseController {
	
	Logger logger = LoggerFactory.getLogger(CompanyController.class);
	
	@Autowired
	@Qualifier("COMPANYINFOMGR")
	IUserInfoMgr<CompanyInfo> userinfomgr;
	
	@RequestMapping(value="/index")
	public String index() {
		return "/pages/company";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/test.do")
	public void test() {
		System.out.println("test");
	}
	
	/**
	 * 如果只是上传一个文件，则只需要MultipartFile类型接收文件即可，而且无需显式指定@RequestParam注解
	 * 如果想上传多个文件，那么这里就要用MultipartFile[]类型来接收文件，并且还要指定@RequestParam注解
	 * 并且上传多个文件时，前台表单中的所有<input type="file"/>的name都应该是myfiles，否则参数里的myfiles无法获取到所有上传的文件
	 * @param request
	 * @param company
	 * @param file
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public String add(HttpServletRequest request, @ModelAttribute CompanyInfo company, MultipartFile file) throws Exception {
		logger.debug("add:" + company.toString());
		String newfilename = savafile(request, file, "/companyinfo");
		company.setFilename(newfilename);
		userinfomgr.add(company);
		return "index";
	}
	@RequestMapping(method=RequestMethod.GET)
	public void list() {
		System.out.println("list");
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public void delete(@PathVariable("id") String id) {
		System.out.println("delete:" + id);
	}
	@RequestMapping(method=RequestMethod.GET,value="/{id}")
	public String query(@PathVariable("id") String id) {
		System.out.println("query:" + id);
		return "success";
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/{id}")
	public void update(@PathVariable("id") String id) {
		System.out.println("update:" + id);
	}
}
