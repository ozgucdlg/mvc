package com.ozguc.mvc.controller;


import com.ozguc.mvc.dto.ClubDto;
import com.ozguc.mvc.service.abstracts.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class ClubController {

    public ClubService clubService;

    @Autowired

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    @GetMapping("/clubs")
    public String listClubs(Model model){
        List<ClubDto> clubs= clubService.findAllClubs();

        model.addAttribute("clubs", clubs);
        return "clubs-list";
    }
}
