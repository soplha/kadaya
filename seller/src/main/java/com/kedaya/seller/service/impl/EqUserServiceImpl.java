package com.kedaya.seller.service.impl;

import com.kedaya.entity.app.user.EqUserEntity;
import com.kedaya.seller.dao.EqUserDao;
import com.kedaya.seller.service.EqUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service("eqUserService")
public class EqUserServiceImpl implements EqUserService {
	@Autowired
	private EqUserDao eqUserDao;
	
	@Override
	public EqUserEntity queryObject(Integer id){
		return eqUserDao.queryObject(id);
	}
	
	@Override
	public List<EqUserEntity> queryList(Map<String, Object> map){
		return eqUserDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return eqUserDao.queryTotal(map);
	}
	
	@Override
	public void save(EqUserEntity eqUser){
		eqUserDao.save(eqUser);
	}
	
	@Override
	public void update(EqUserEntity eqUser){
		eqUserDao.update(eqUser);
	}
	
	@Override
	public void delete(Integer id){
		eqUserDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		eqUserDao.deleteBatch(ids);
	}

	@Override
	public EqUserEntity findByUserName(String username) {
		return eqUserDao.findByUserName(username);
	}

}
