package com.hub.hubblank.service.impl;

import com.hub.hubblank.eumn.ClassTypeEnum;
import com.hub.hubblank.service.RegisterService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @description
 * @author: fuyb
 * @create: 2020-04-18 23:44
 **/
@Component
public class RegisterServiceImpl implements ApplicationContextAware {

    ApplicationContext applicationContext;


    public  <T>  RegisterService getBean(String type) {
        return (RegisterService) applicationContext.getBean(ClassTypeEnum.getClazzByType(type));
    }

    public <T> Map<String, T> getBeansOfType(Class<T> clazz) {
        return applicationContext.getBeansOfType(clazz);
    }

//    public RegisterServiceImpl() {
//    }
//
//    public Map<String,RegisterService> registerServiceMap;
//
//    public RegisterServiceImpl(List<RegisterService> registerServices) {
//        registerServices.forEach(r->{
//            registerServiceMap.put(r.getType(),r);
//        });
//    }
//
    public String executeRegister(String type){
        RegisterService registerService = this.getBean(type);
        return registerService.doRegister();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
