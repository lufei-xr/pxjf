package com.bailiban.domin;

public class Upload {
	private int upid;
	private int uid;
	private String oldName;
	private String newname;
	private String contentType;
	private String uploadTime;
	public Upload() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Upload(int upid, int uid, String oldName, String newname, String contentType, String uploadTime) {
		super();
		this.upid = upid;
		this.uid = uid;
		this.oldName = oldName;
		this.newname = newname;
		this.contentType = contentType;
		this.uploadTime = uploadTime;
	}
	@Override
	public String toString() {
		return "Upload [upid=" + upid + ", uid=" + uid + ", oldName=" + oldName + ", newname=" + newname
				+ ", contentType=" + contentType + ", uploadTime=" + uploadTime + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contentType == null) ? 0 : contentType.hashCode());
		result = prime * result + ((newname == null) ? 0 : newname.hashCode());
		result = prime * result + ((oldName == null) ? 0 : oldName.hashCode());
		result = prime * result + uid;
		result = prime * result + upid;
		result = prime * result + ((uploadTime == null) ? 0 : uploadTime.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Upload other = (Upload) obj;
		if (contentType == null) {
			if (other.contentType != null)
				return false;
		} else if (!contentType.equals(other.contentType))
			return false;
		if (newname == null) {
			if (other.newname != null)
				return false;
		} else if (!newname.equals(other.newname))
			return false;
		if (oldName == null) {
			if (other.oldName != null)
				return false;
		} else if (!oldName.equals(other.oldName))
			return false;
		if (uid != other.uid)
			return false;
		if (upid != other.upid)
			return false;
		if (uploadTime == null) {
			if (other.uploadTime != null)
				return false;
		} else if (!uploadTime.equals(other.uploadTime))
			return false;
		return true;
	}
	public int getUpid() {
		return upid;
	}
	public void setUpid(int upid) {
		this.upid = upid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getOldName() {
		return oldName;
	}
	public void setOldName(String oldName) {
		this.oldName = oldName;
	}
	public String getNewname() {
		return newname;
	}
	public void setNewname(String newname) {
		this.newname = newname;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}
	
	

}
