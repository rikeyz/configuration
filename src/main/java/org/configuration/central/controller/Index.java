/*
 * Project: configuration
 * 
 * File Created at 2017/3/31
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package org.configuration.central.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zhongrui
 * @Type Index.java
 * @Desc
 * @date 2017/3/31 23:24
 */
@Controller
public class Index {
    @RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("projectName", "我的项目");
        Map<String, String> properties = new LinkedHashMap<String, String>();
        properties.put("name", "abc");
        properties.put("age", "12");
        model.addAttribute("properties", properties);
        return "index";
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 *
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017/3/31 zhongrui creat
 */