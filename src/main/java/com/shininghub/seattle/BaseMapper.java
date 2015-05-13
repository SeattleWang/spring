package com.shininghub.seattle;

import java.util.List;
import java.util.Map;


/**
 * <strong>BaseMapper</strong><br>
 * <strong>Create on : 2012-2-8<br></strong>
 * <strong>Copyright (C) Ecointel Software Co.,Ltd.<br></strong>
 * @author peng.shi peng.shi@ecointel.com.cn<br>
 * @version <strong>ecointel-epp v1.0.0</strong><br>
 */
public interface BaseMapper<T extends AbstractDO, PK extends java.io.Serializable> {

	PK insert(T model);
	
	void delete(PK modelPK);
	
	T load(PK modelPK);
	
	void update(T model);

	void updateSelective(T model);
	
	int countAll();
	
	int countAll(Map<String,Object> where);
	
	List<T> findAll();
	
	List<T> findAll(Map<String,Object> where);
	
}
