package com.ebookMailer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {

    @RequestMapping("/")
    public String index() {
        return "login";
    }

    @RequestMapping("/main")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="Team eBookMailer") String name, Model model) {
        model.addAttribute("name", name);
        return "main";
    }
}