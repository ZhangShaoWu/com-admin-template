package com.admin.template.core.controller;

import com.admin.framework.component.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author ZSW
 * @date 2019/3/28
 */
@Controller
public class BaseController {

    @Autowired
    private HttpServletRequest request;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(String view){
        if(StringUtil.isEmpty(view)){
            return "index";
        }
        return view;
    }
}
