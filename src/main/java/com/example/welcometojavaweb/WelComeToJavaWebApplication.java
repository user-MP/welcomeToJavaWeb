package com.example.welcometojavaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@Controller
public class WelComeToJavaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WelComeToJavaWebApplication.class, args);
    }


    @GetMapping({"", "/welcome"})
    public String welcome(@RequestParam(value = "name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "welcome";
    }


}
