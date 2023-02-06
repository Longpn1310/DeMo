package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc

public class HomePage {

    @GetMapping(value="home")

    public ModelAndView homePage(){
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }
}
