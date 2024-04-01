package com.gambit.Gambit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * Das Comments Model handelt alle Kommentare die ein Video haben kann.
 *
 * @since 1.0
 * @author Jerome von Daak
 */
@Entity
public class Comments {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  // Video ID die die Comments mit dem Viedo verknüpfen
  private Integer videoId;
  // User ID für den Ersteller des Comments
  private Integer userId;

  // der eigentliche comment text
  private String body;

  /*
   * Getter und Setter
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getVideoId() {
    return videoId;
  }

  public void setVideoId(Integer videoId) {
    this.videoId = videoId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }
}
