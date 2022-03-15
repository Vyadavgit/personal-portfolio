package com.vivekkumaryadav.personalportfolio.controller;

import com.vivekkumaryadav.personalportfolio.model.PersonalInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class WebController {
    @GetMapping(value = "/")
    public String index(Model model){
        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setFullName("Vivek Kumar Ydav");
        personalInfo.setAddress("Arlington, Texas");
        personalInfo.setAge(23);
        personalInfo.setEmail("abc@gmail.com");
        personalInfo.setCvURL("https://www.google.com");
        personalInfo.setDescription("This is test description");
        personalInfo.setGitURL("https://github.com/Vyadavgit");

        model.addAttribute("personalInfo", personalInfo);
        return "index";
    }
}
