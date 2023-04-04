package com.example.clonedivesave.service;

import com.example.clonedivesave.entity.CloneModel;
import com.example.clonedivesave.repository.CloneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CloneService {

  @Autowired
  CloneRepository cloneRepository;

  public void saveAllClone(CloneModel model){
    cloneRepository.save(model);
  }

}
