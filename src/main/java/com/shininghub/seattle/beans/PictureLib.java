package com.shininghub.seattle.beans;

import java.util.Date;

import com.shininghub.seattle.AbstractDO;


public class PictureLib extends AbstractDO {
	
	private static final long serialVersionUID = 5899201166567215214L;
	private Integer id;
	private Integer uid;
	private String img;// imgurl
	private Date ctime;// 创建时间
	private String note;// 备注
	private float size;// '大小',
	private String tag; // 'company_img,registered_file',
	private Integer picOrder; // '排序',
	private String title;
	private Integer isUpdate;
	private Integer imgMark;
	
	public Integer getImgMark() {
		return imgMark;
	}

	public void setImgMark(Integer imgMark) {
		this.imgMark = imgMark;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Integer getPicOrder() {
		return picOrder;
	}

	public void setPicOrder(Integer picOrder) {
		this.picOrder = picOrder;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getCtime() {
		return ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getIsUpdate() {
		return isUpdate;
	}

	public void setIsUpdate(Integer isUpdate) {
		this.isUpdate = isUpdate;
	}

	

}
