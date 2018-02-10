package com.esen.dqy.action;

import java.io.File;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

public class BaseController {
	
	/**
	 * 保存文件到WEB-INF目录下
	 * @param request
	 * @param file
	 * @return
	 * @throws Exception
	 */
	protected String savafile(HttpServletRequest request, MultipartFile file, String dir) throws Exception {
		//IMG_20180210_153500_OriginalFilename
		Date date = new Date();
		StringBuffer newfilename = new StringBuffer("IMG_");
		newfilename.append(DateFormatUtils.format(date, "yyyyMMdd")).append("_");
		newfilename.append(DateFormatUtils.format(date, "HHmmss")).append("_");
		newfilename.append(file.getOriginalFilename());
		
		//如果用的是Tomcat服务器，则文件会上传到\\%TOMCAT_HOME%\\webapps\\YourWebProject\\WEB-INF\\upload\\文件夹中
		String realPath = request.getSession().getServletContext().getRealPath("/WEB-INF/upload" + (dir == null ? "" : dir));
		//这里不必处理IO流关闭的问题，因为FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉，我是看它的源码才知道的
		FileUtils.copyInputStreamToFile(file.getInputStream(), new File(realPath, newfilename.toString()));
		return newfilename.toString();
	}
}
