package com.example.clonedivesave.repository;

import com.example.clonedivesave.entity.CloneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloneRepository extends JpaRepository<CloneModel, Long> {

}
