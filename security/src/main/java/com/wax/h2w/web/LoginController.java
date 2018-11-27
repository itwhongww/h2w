package com.wax.h2w.web;

import com.wax.h2w.config.vo.Constants;
import com.wax.h2w.config.vo.ReturnInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private static Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Value("${foo}")
    private String foo;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public ReturnInfo<String> login() {
        return new ReturnInfo<>(Constants.Code.OK,foo);
    }
}
