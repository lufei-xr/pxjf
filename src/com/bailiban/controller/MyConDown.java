package com.bailiban.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bailiban.service.UploadService;

@Controller
public class MyConDown {
	@Resource
	private UploadService uploadServiceImpl;
	private FileInputStream fileInputStream;
	@RequestMapping("down")
	public void down(String newname,String contentType,HttpServletRequest reqt,HttpServletResponse resp) throws IOException {
		resp.setContentType(contentType);
		resp.setHeader("Content-Disposition", "attachment;filename="+newname);
		String path=reqt.getServletContext().getRealPath("/images");
		//FileInputStream fs= new FileInputStream(new File(path,newname));
		ServletOutputStream os = resp.getOutputStream();
		os.write(FileUtils.readFileToByteArray(new File(path,newname)));
	}
		

}
