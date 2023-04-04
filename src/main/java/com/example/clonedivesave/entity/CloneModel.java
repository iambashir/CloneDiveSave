package com.example.clonedivesave.entity;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "clone_div")
public class CloneModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(unique = true)
  @NotNull
  private long id;
  private String testName;
  private String result;
  private String range;

}
