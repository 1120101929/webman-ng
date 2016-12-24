package cn.csbit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by liuyimin on 2016/12/24.
 */
@Controller
@RequestMapping("/")
public class BaseController {
    @RequestMapping(value = "/{module}", method = RequestMethod.GET)
    public String module(@PathVariable("module") String module, Model model) {
        model.addAttribute("title", "index page");
        model.addAttribute("page", "main");
        return "user";
    }

    @RequestMapping(value = "/{module}/{page}", method = RequestMethod.GET)
    public String page(@PathVariable("module") String module, @PathVariable("page") String page) {
        return module + "/" + page;
    }
}
