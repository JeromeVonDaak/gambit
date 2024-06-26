package com.gambit.Gambit.controllers;

import com.gambit.Gambit.services.AuthService;
import com.gambit.Gambit.config.auth.TokenProvider;
import com.gambit.Gambit.dtos.JwtDto;
import com.gambit.Gambit.dtos.SignInDto;
import com.gambit.Gambit.dtos.SignUpDto;
import com.gambit.Gambit.models.User;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

// controllers/AuthController.java
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
  @Autowired
  private AuthenticationManager authenticationManager;
  @Autowired
  private AuthService service;
  @Autowired
  private TokenProvider tokenService;

  @PostMapping("/signup")
  public ResponseEntity<?> signUp(@RequestBody SignUpDto data) {
    try {
      service.signUp(data);
    }catch (Exception e){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

  @PostMapping("/signin")
  public ResponseEntity<JwtDto> signIn(@RequestBody SignInDto data) {
    try {
      var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
      var authUser = authenticationManager.authenticate(usernamePassword);
      var accessToken = tokenService.generateAccessToken((User) authUser.getPrincipal());
      return ResponseEntity.ok(new JwtDto(accessToken));
    }catch (Exception e){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
  }

  @PostMapping("/signinhtml")
  public RedirectView signInHtml( HttpServletResponse response, @RequestParam("username") String username, @RequestParam("password") String password){
    SignInDto data = new SignInDto(username, password);

    try {
      String jwtaccess = signIn(data).getBody().accessToken();
      Cookie cookie = new Cookie("accessToken", jwtaccess);
      cookie.setPath("/");
      cookie.setMaxAge(2 * 60 * 60);
      response.addCookie(cookie);
      return new RedirectView("/home");
    }catch (Exception e){
      return new RedirectView("/login");
    }
  }

  @PostMapping("/signuphtml")
  public RedirectView signUpHtml( @RequestParam("username") String username, @RequestParam("password") String password){
    SignUpDto data = new SignUpDto(username, password);
    signUp(data);
    return new RedirectView("/login");
  }
}
