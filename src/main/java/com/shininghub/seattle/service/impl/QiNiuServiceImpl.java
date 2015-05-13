package com.shininghub.seattle.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.qiniu.util.Auth;
import com.shininghub.seattle.service.QiNiuService;

@Service("qiNiuService")
public class QiNiuServiceImpl implements QiNiuService {
	private static Logger LOGGER = Logger.getLogger(QiNiuServiceImpl.class);
	private String ACCESS_KEY;
	private String SECRET_KEY;
	public void setACCESS_KEY(String aCCESS_KEY) {
		ACCESS_KEY = aCCESS_KEY;
	}
	public void setSECRET_KEY(String sECRET_KEY) {
		SECRET_KEY = sECRET_KEY;
	}
	
	Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
	
	
}
