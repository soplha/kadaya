package com.kedaya.seller.dao;


import com.kedaya.entity.app.user.EqUserEntity;
import com.kedaya.seller.common.dao.BaseDao;

/**
 *
 *
 * @author qiyurong
 * @email qiyurongde@gmail.com
 * @date 2019-01-23 14:52:54
 */
public interface EqUserDao extends BaseDao<EqUserEntity> {

    EqUserEntity findByUserName(String username);
}
