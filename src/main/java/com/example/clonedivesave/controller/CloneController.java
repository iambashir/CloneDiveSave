package com.example.clonedivesave.controller;


import com.example.clonedivesave.entity.CloneModel;
import com.example.clonedivesave.service.CloneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CloneController {

  @Autowired
  CloneService cloneService;

  @RequestMapping("/save-clone")
  public String SaveAllClone(@ModelAttribute("clone") CloneModel clone){
    cloneService.saveAllClone(clone);
    return "Home.html";
  }


}
