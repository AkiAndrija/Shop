package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public ModelAndView printHello(){
        ModelAndView mv = new ModelAndView();

        mv.addObject("message","Hello from Spring MVC");
        mv.setViewName("hello");
        return mv;
    }

}