package com.bailiban.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.bailiban.domin.Upload;

public interface UploadMapper {
	
	@Insert("insert into upload values(default,#{0},#{1},#{2},#{3},now())")
	int insUploadInfo(int uid,String olaName,String newname,String contentType);
//查询
	@Select("select * from upload")
	List<Upload> selUploadInfo();
}
