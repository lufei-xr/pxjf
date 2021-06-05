package com.bailiban.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.bailiban.domin.Upload;
import com.bailiban.service.UploadService;
import com.sun.accessibility.internal.resources.accessibility;

@Controller
public class MyConUpload {
	@Resource
	private UploadService uploadServiceImpl;
		
	
	@RequestMapping("upload")
	public String myUpload(int uid,String uname,MultipartFile photo,HttpServletRequest req) throws IllegalStateException, IOException {
		
		/*D:/images/a.jpg写死了
		 * File f= new File("D:/images/a.jpg"); 
		 * photo.transferTo(f);
		 */
		//获取文件后缀名photo.getOriginalFilename()原始文件名
		String suffixName = photo.getOriginalFilename().substring(photo.getOriginalFilename().lastIndexOf("."));
		//用后缀名校验文件类型
		if(!(".jpg".equals(suffixName))) {
			return "forwad:/error.jsp";
		}
		//文件前缀
		String name=UUID.randomUUID()+""+System.currentTimeMillis();
		
		//拼接新的名字
		String newName=name+suffixName;
		//动态获取存储路径
		String path = req.getServletContext().getRealPath("/images");
		File fpath=new File(path);
		//images文件夹不在动态创建文件夹
		if(!fpath.exists()) {
			fpath.mkdirs();
		}
		//拼接结对路径=存储路径+名字
		File f = new File(fpath, newName);
		photo.transferTo(f);
		//将上传数据存储到数据库中（用户id,原始名，新名，时间，文件类型）
		int i = uploadServiceImpl.insert(uid, photo.getOriginalFilename(), newName, photo.getContentType());
		if(i>0) {
			return "forward:/success";//跳转到getUplodeInfo方法
		}else {
			return "forward:/fail.jsp";
		}
		
		
	}
	//查询用户上传信息getUplodeInfo
	@RequestMapping("success")
	public String getUploadInfo(HttpServletRequest req) {
		List<Upload> list = uploadServiceImpl.selUploadInfoService();
		req.setAttribute("list", list);
		return "forward:/success.jsp";
		
	}
	

}
