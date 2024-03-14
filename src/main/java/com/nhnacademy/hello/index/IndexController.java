package com.nhnacademy.hello.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping(value = {"/index.html","/"})
    public String index(){
        System.out.println("변경사항 추가");
        return "index/index";
    }
}
