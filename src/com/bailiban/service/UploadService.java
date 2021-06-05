package com.bailiban.service;

import java.util.List;

import com.bailiban.domin.Upload;

public interface UploadService {
	int insert(int uid,String newName,String oldName,String contentType);
List<Upload> selUploadInfoService();
}
