package com.shininghub.test;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shininghub.seattle.beans.PictureLib;
import com.shininghub.seattle.mapper.PictureLibMapper;

public class PictureLibMapperTest extends BaseJunitCase{
	
	@Autowired
	private PictureLibMapper pictureLibMapper;
	
	@Test
	public void testLoad() {// 根据id查对象，返回单个对象
		PictureLib lib=pictureLibMapper.load(1);
//		pictureLibMapper.loadByUid(1);
		System.out.println(lib);
	}

	@Test
	public void testDelete() {// 根据id删除对象
		pictureLibMapper.delete(2);
	}

	@Test
	public void testInsert() {// 传入model，添加对象

		PictureLib model = new PictureLib();
		model.setCtime(new Date());
		model.setImg("d/d/d");
		model.setNote("qqqq");
		model.setUid(1);
		model.setPicOrder(0);
		model.setSize(0.0F);
		model.setTag("company_img");
		model.setTitle("title");
		pictureLibMapper.insert(model);
		//System.out.println(model.getId());
	}

	@Test
	public void testUpdateSelective() {// 根据model传入的参数，修改对象
		PictureLib model = new PictureLib();
		model.setCtime(new Date());
		model.setId(1);
		model.setImg("d/d/d");
		model.setNote("qqqq");
		model.setUid(1);
		model.setPicOrder(0);
		model.setSize(0.0F);
		model.setTag("company_img");
		model.setTitle("title");
		pictureLibMapper.updateSelective(model);

	}

	@Test
	public void testUpdate() {// 根据model，修改对象
		PictureLib model = pictureLibMapper.load(2);
		model.setCtime(new Date());
		model.setId(1);
		model.setImg("d/d/d");
		model.setNote("qqqq");
		model.setUid(1);
		model.setPicOrder(0);
		model.setSize(0.0F);
		model.setTag("company_img");
		model.setTitle("title");
		pictureLibMapper.update(model);
	}

	@Test
	public void testCountAll() {// 查询总记录数，返回int
		pictureLibMapper.countAll();
	}

	@Test
	public void testFindAll() {// 查询所有对象，返回List<Email>
		Map map = new HashMap();
		map.put("uid", 4);
		map.put("tag", "production");
	}

	
}
