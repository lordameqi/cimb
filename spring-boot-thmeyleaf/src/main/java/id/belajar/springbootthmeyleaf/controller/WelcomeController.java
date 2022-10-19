package id.belajar.springbootthmeyleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

//@Controller
public class WelcomeController {
    private String message = "Hello from Spring Web";
    private List<String> tasks = Arrays.asList("a","b","c","d","e","f","g");

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("Message",message);
        model.addAttribute("tasks",tasks);
        return "welcome";//view
    }

    //hello?name=Jhon
    @GetMapping("hello")
    public String mainWIthParam(@RequestParam(name = "name",required = false,defaultValue = "")
                                String name, String tasks,Model model){
        model.addAttribute("meSsage",name);
        model.addAttribute("tasks",tasks);
        return "welcome";
    }
}
