package com.shininghub.seattle.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.shininghub.seattle.beans.PictureLib;
import com.shininghub.seattle.service.PictureLibService;
@Service
public class PictureLibServiceImpl implements PictureLibService {
	/*@Autowired
	private PictureLibMapper pictureLibMapper;*/
	@Override
	public PictureLib load(Integer id) {
		
		//return pictureLibMapper.load(id);
		PictureLib p=new PictureLib();
		p.setCtime(new Date());
		return p;
	}
	
}
