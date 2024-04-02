package com.gambit.Gambit.dtos;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.ModelAttribute;

// dtos/SignInDto.java

/**
 *
 *
 * public class SignInDto {
 *     String password;
 *     String login;
 *     public SignInDto(String password, String login){
 *         this.password = password;
 *         this.login = login;
 *     }
 *
 *     public void setPassword(String password){
 *         this.password = password;
 *     }
 *
 *     public void setLogin(String login){
 *         this.login = login;
 *     }
 *
 *     public String getLogin(){
 *         return this.login;
 *     }
 *
 *     public String getPassword(){
 *         return this.password;
 *     }
 *
 *
 * }
 */
public record SignInDto(
    String login,
    String password) {
}
