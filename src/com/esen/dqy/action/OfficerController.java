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

import com.esen.dqy.entity.OfficerInfo;
import com.esen.dqy.service.IUserInfoMgr;

@Controller
@RequestMapping("/restful/officerinfo")
public class OfficerController extends BaseController {
	
	Logger logger = LoggerFactory.getLogger(OfficerController.class);
	
	@Autowired
	@Qualifier("OFFICERINFOMGR")
	IUserInfoMgr<OfficerInfo> userinfomgr;
	
	@RequestMapping(value="/index")
	public String index() {
		return "/pages/officer";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/test.do")
	public void test() {
		System.out.println("test");
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public String add(HttpServletRequest request, @ModelAttribute OfficerInfo officer, MultipartFile file) throws Exception {
		logger.debug("add:" + officer.toString());
		String newfilename = savafile(request, file, "/officerinfo");
		officer.setFilename(newfilename);
		userinfomgr.add(officer);
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
