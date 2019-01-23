package com.kedaya.seller.common.dao;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author qiyurong
 * @email qiyurongde@gmail.com
 * @date 2019-01-23 14:52:54
 */
public interface BaseDao<T> {
	
	void save(T t);
	
	void save(Map<String, Object> map);
	
	void saveBatch(List<T> list);
	
	int update(T t);
	
	int update(Map<String, Object> map);
	
	int delete(Object id);
	
	int delete(Map<String, Object> map);
	
	int deleteBatch(Object[] id);

	T queryObject(Object id);
	
	List<T> queryList(Map<String, Object> map);
	
	List<T> queryList(Object id);
	
	int queryTotal(Map<String, Object> map);

	int queryTotal();
}
