package com.kedaya.seller.common.utils;

import com.kedaya.entity.app.user.EqUserEntity;

/**
 * local login store
 *
 * @author xuxueli 2018-04-02 20:03:11
 */
public class SsoLoginStore {

    /**
     * get
     *
     * @param sessionId
     * @return
     */
    public static EqUserEntity get(String sessionId) {

        //String redisKey = redisKey(sessionId);
        Object objectValue = JedisUtil.getObjectValue(sessionId);
        if (objectValue != null) {
            EqUserEntity xxlUser = (EqUserEntity) objectValue;
            return xxlUser;
        }
        return null;
    }

    /**
     * remove
     *
     * @param sessionId
     */
    public static void remove(String sessionId) {
       // String redisKey = redisKey(sessionId);
        JedisUtil.del(sessionId);
    }

    /**
     * put
     *
     * @param sessionId
     * @param xxlUser
     */
    public static void put(String sessionId, EqUserEntity xxlUser) {
        //String redisKey = redisKey(String.valueOf(xxlUser.getUserid()));
        JedisUtil.setObjectValue(sessionId, xxlUser);
        JedisUtil.expire(sessionId, 120);

    }

    private static String redisKey(String userId){
        return Conf.SSO_SESSIONID.concat("#").concat(userId);
    }

}
