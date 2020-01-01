package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


@RestController
public class Hello {

    int[] list = {1, 3, 5};
    int[] nums = new int[7];

    @GetMapping("/hello") // getMapping GET方便
    public String hello() {
        SimpleDateFormat df = new SimpleDateFormat("Y-M-d HH:mm:ss");
        return "Java: Hello word!\n" + df.format(new Date()) + Arrays.toString(list);
    }

    @RequestMapping("/demo") // POST, GET都可以吧
    public String demo() {
        return "Demo";
    }
}
