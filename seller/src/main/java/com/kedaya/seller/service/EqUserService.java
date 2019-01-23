package com.kedaya.seller.service;


import com.kedaya.entity.app.user.EqUserEntity;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author qiyurong
 * @email qiyurongde@gmail.com
 * @date 2019-01-23 14:52:54
 */
public interface EqUserService {
	
	EqUserEntity queryObject(Integer id);
	
	List<EqUserEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(EqUserEntity eqUser);
	
	void update(EqUserEntity eqUser);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);

	EqUserEntity findByUserName(String username);
}
