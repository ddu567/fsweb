package jpaboot.jpashop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
public class HomeController {
    @RequestMapping("/")
    public String home() {
        log.info("home controller");
        return "home";
    }

    // @RequestMapping - 모든 요청 처리 가능
    // @RequestMapping(value = "/", method = RequestMethod.GET)
}
