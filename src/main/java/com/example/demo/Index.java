package com.example.demo;

import com.example.demo.model.TestModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class Index {

    @GetMapping("/index")
    public String index(Model view, String name, String mobile) {
        TestModel model = new TestModel();
        model.setEmail(mobile);
        model.setName(name);
        view.addAttribute("test", model);
        return "Index/index";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    @ResponseBody
    public String post() {
        return "测试";
    }
}
