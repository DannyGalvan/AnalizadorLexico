package com.translate.lexer.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReactAppController {

    @RequestMapping(value = {
            "/",
    }, method = RequestMethod.GET)
    public String getReactApp() {
        return "forward:/index.html";
    }
}
