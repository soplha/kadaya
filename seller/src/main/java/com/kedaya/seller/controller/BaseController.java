package com.kedaya.seller.controller;

import com.kedaya.seller.common.utils.RSAUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class BaseController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    protected Integer getUserId(String sessionId) {
        try {
            String str = RSAUtils.publicDecrypt(sessionId,RSAUtils.getPublicKey(RSAUtils.publicKey));
            String[] s = str.split(",");
            if (s.length != 3){
               return null;
            }
            return Integer.parseInt(s[0]);
        }catch (NoSuchAlgorithmException nos){
            return null;
        }catch (InvalidKeySpecException in){
            return null;
        }
    }

}
