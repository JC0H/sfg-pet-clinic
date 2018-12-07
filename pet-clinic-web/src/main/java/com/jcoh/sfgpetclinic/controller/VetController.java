package com.jcoh.sfgpetclinic.controller;

import com.jcoh.sfgpetclinic.service.map.VetMapService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetMapService vetMapService;

    public VetController(VetMapService vetMapService) {
        this.vetMapService = vetMapService;
    }

    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String showVetList(Model model){
        model.addAttribute("vets", vetMapService.findAll());

        return "vets/index";
    }
}
