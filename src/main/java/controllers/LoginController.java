package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class LoginController {
    @GetMapping(value="login")

    public ModelAndView loginPage(){
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }
}
