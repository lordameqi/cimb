package id.belajar.springrestbanget.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping(value = "/belajar-api/v1")
public class BelajarApiController {
    @GetMapping(value = "/get")
    public String belajarApi(){
        return "mari belajar api";
    }
}
