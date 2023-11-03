package com.example.secondproject.controller;

import com.example.secondproject.dto.ArticleForm;
import com.example.secondproject.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SecondController {
    @GetMapping("/hi")
    public String niceToMeetU(Model model) {
        model.addAttribute("username", "수현");
        return "greetings";
    }

    @GetMapping("/bye")
    public String SeeU(Model model) {
        model.addAttribute("nickname","홍길동");
        return "goodbye";
    }


}
