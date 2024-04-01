package com.gambit.Gambit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * Das Videos Model speicher Metadaten sowie Speicherort und Url des Viedeos das abgefragt werden soll
 *
 * @since 1.0
 * @author Jerome von Daak
 */
@Entity
public class Videos {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String savepath;
  // wollen wir die pro user limiten ?
  private Integer views;
  private Integer likes;
  private Integer dislikes;

  private String url;

  /*
   * Getter und Setter
   */

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getSavepath() {
    return savepath;
  }

  public void setSavepath(String savepath) {
    this.savepath = savepath;
  }

  public Integer getViews() {
    return views;
  }

  public void setViews(Integer views) {
    this.views = views;
  }

  public Integer getLikes() {
    return likes;
  }

  public void setLikes(Integer likes) {
    this.likes = likes;
  }

  public Integer getDislikes() {
    return dislikes;
  }

  public void setDislikes(Integer dislikes) {
    this.dislikes = dislikes;
  }

  public String getUrl(){ return url;}

  public void setUrl(String url){this.url = url;}
}
