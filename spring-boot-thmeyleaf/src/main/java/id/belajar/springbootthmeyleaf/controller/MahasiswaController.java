package id.belajar.springbootthmeyleaf.controller;

import id.belajar.springbootthmeyleaf.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MahasiswaController {
    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    @GetMapping("/index")
    public ModelMap getAll(Pageable pageable){
        return new ModelMap().addAttribute("veve",
                mahasiswaRepository.findAll(pageable));
    }

    @GetMapping("/")
    public String index(){
        return "redirect:/index";
    }
}
