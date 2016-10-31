package com.smartphire.webapp.controller;

import com.smartphire.webapp.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by avoinovan on 10/28/16
 */
@Controller
@RequestMapping({"/","/login"})
public class LoginController {

    @GetMapping
    public String welcome(Map<String, Object> model) {

        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("loginForm") LoginForm loginForm) {

        ModelAndView response = new ModelAndView("welcome");
        response.getModel().put("username", loginForm.getUsername());
        return  response;
    }
}
