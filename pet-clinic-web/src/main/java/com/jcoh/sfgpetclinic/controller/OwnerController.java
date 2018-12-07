package com.jcoh.sfgpetclinic.controller;

import com.jcoh.sfgpetclinic.service.map.OwnerMapService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerMapService ownerMapService;

    public OwnerController(OwnerMapService ownerMapService) {
        this.ownerMapService = ownerMapService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String showVetList(Model model){
        model.addAttribute("owners", ownerMapService.findAll());

        return "owners/index";
    }
}
