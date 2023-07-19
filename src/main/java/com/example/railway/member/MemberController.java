package com.example.railway.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping(path = "/")
    public String member() {
        System.out.println("hello");
        return "";
    }
}
