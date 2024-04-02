package com.gambit.Gambit.controllers;

import com.gambit.Gambit.repos.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 * Der Webseiten Controller ist zuständig für alle Normalen Html Webseiten die Gambit hat. Also:
 *  - Login
 *  - Register
 *  - Logout
 *  - Home
 *  - SingleVideo
 *  - Upload
 *
 * @since 1.0
 * @author Jerome von Daak
 */
@Controller
@RequestMapping(path = "/")
public class WebsiteController {
    /**
     * Damit man auf alle Daten zugreifen kann
     */
    @Autowired
    private UserRep userRepository;
    @Autowired
    private CaptchaRep captchaRepository;
    @Autowired
    private CommentsRep commentsRepository;
    @Autowired
    private VerifyRep verifyRepository;
    @Autowired
    private VideosRep videosRepository;

    @GetMapping("/login")
    public String login(){
        return "loginSite";
    }

    @GetMapping("/register")
    public String register(){return "registerSite";}

    @GetMapping("/home")
    public String home(){return "homeSite";}
}