package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping(value = "/")
    public String mainPageRedirectUsers(ModelMap model) {
        return "redirect:users";
    }

}