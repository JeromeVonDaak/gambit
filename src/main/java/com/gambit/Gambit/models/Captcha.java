package com.gambit.Gambit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Captcha {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  // Was die richtige Anwort auf den Captcha ist
  private String valid;

  /*
   * Getter und Setter
   */

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getValid() {
    return valid;
  }

  public void setValid(String valid) {
    this.valid = valid;
  }
}
