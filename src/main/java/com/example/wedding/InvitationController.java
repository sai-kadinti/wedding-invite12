package com.example.wedding;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvitationController {

    @GetMapping("/")
    public String showInvitation() {
        return "index";  // Loads templates/index.html
    }
}
