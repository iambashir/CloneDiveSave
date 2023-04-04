package com.example.clonedivesave.controller;


import com.example.clonedivesave.entity.CloneModel;
import com.example.clonedivesave.service.CloneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CloneController {

  @Autowired
  CloneService cloneService;

  @GetMapping("/all-data")
  public String allData(Model model){
    return "Home.html";
  }

  @PostMapping("/save-clone")
  public String SaveAllClone(@ModelAttribute("clone") CloneModel clone){
    cloneService.saveAllClone(clone);
    System.out.println(clone.getTestName());
    return "redirect:/all-data";
  }


}
