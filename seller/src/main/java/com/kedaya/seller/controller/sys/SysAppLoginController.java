package com.kedaya.seller.controller.sys;

import com.kedaya.entity.app.user.EqUserEntity;
import com.kedaya.seller.common.utils.MD5;
import com.kedaya.seller.common.utils.R;
import com.kedaya.seller.common.utils.RSAUtils;
import com.kedaya.seller.common.utils.SsoLoginHelper;
import com.kedaya.seller.service.EqUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("app")
public class SysAppLoginController {

    @Autowired
    private EqUserService eqUserService;
    /**
     * 登录
     */
    @RequestMapping(value = "/sys/login", method = RequestMethod.POST)
    public R login(String username, String password,String client) {

        if (StringUtils.isBlank(client)) {
            return R.error(500, "Please input client.");
        }

        if (StringUtils.isBlank(username)) {
            return R.error(500, "Please input username.");
        }
        if (StringUtils.isBlank(password)) {
            return R.error(500,"Please input password.");
        }
        try {

            EqUserEntity existUser = eqUserService.findByUserName(username);
            if (existUser == null) {
                return R.error(500, "username is invalid.");
            }
            if (!existUser.getPassword().equals(password)) {
                return R.error(500, "password is invalid.");
            }

            String sessionId = RSAUtils.privateEncrypt(existUser.getId() + "," + new Date().getTime() + "," + client,
                    RSAUtils.getPrivateKey(RSAUtils.privateKey));

            SsoLoginHelper.login(sessionId,existUser);
            return R.ok().put("sessionId", sessionId);
        }catch (Exception e){
             e.printStackTrace();
             return R.error(500,"系统异常");
        }
    }

}
