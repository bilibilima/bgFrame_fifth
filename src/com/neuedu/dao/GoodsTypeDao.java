package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.model.GoodsType;
import com.neuedu.model.Storage;

public interface GoodsTypeDao {

	public int countGoodsType();
	
	public List<GoodsType> findAll(Map<String, Object> map);
	
	public int addGoodsType(GoodsType u);
	
	public int updateGoodsType(GoodsType u);
	
	public int deleteGoodsType(int id);	
	
	
}
