package org.gaval.actuator.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String goIndexPage(Model model){
        model.addAttribute("msg", "Hello, World, Tiger");
        return "index";
    }
}
