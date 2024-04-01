package com.gambit.Gambit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * Das Verify Model prüft ob der User seine E-mail bereits bestätigt hat
 *
 * @since 1.0
 * @author Jerome von Daak
 */
@Entity
public class Verify {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  // Die userid dem der Link geschickt wurde.
  private Integer userid;
  // Was die richtige Anwort auf den Verify.
  // Senden wir dann über Email
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

  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }

  public String getValid() {
    return valid;
  }

  public void setValid(String valid) {
    this.valid = valid;
  }
}
