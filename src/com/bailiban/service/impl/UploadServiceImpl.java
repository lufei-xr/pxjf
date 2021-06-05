package com.bailiban.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bailiban.domin.Upload;
import com.bailiban.mapper.UploadMapper;
import com.bailiban.service.UploadService;
@Service
public class UploadServiceImpl  implements UploadService{
	@Resource
private UploadMapper uploadMapper;

	@Override
	public int insert(int uid, String newName, String oldName, String contentType) {
		return uploadMapper.insUploadInfo(uid, newName, oldName, contentType);
	}

	@Override
	public List<Upload> selUploadInfoService() {
		
		return uploadMapper.selUploadInfo();
	}
	

}
