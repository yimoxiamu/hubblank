package com.hub.hubblank.eumn;

import com.hub.hubblank.service.impl.EmailRegisterServiceImpl;
import com.hub.hubblank.service.impl.MobileRegisterServiceImpl;

import java.util.List;

/**
 * @description
 * @author: fuyb
 * @create: 2020-04-19 10:04
 **/
public enum ClassTypeEnum {
    /**
     * 邮箱注册
     */
    EMAIL_TYPE("email",EmailRegisterServiceImpl.class),
    /**
     * 手机注册
     */
    MOBILE_TYPE("mobile", MobileRegisterServiceImpl.class);

    private String type;
    private Class clazz;

    ClassTypeEnum(String type, Class clazz) {
        this.type = type;
        this.clazz = clazz;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public static Class getClazzByType(String type){
        ClassTypeEnum[] classTypeEnums = values();
        for (int i = 0; i < classTypeEnums.length; i++) {
            if(classTypeEnums[i].getType().equals(type)){
                return classTypeEnums[i].getClazz();
            }
        }
        return null;
    }
}
