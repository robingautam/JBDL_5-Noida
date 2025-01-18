package org.gfg.JBDL5_Security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/get/home")
    public String getHome(){
        return "Inside the get home method";
    }

    @GetMapping("/get/private")
    public String getPrivate(){
        return "Inside the get Private method";
    }

    @GetMapping("/get/admin")
    public String getAdmin(){
        return "Inside the get getAdmin() method";
    }

    @GetMapping("/get/csrf")
    public CsrfToken getCSRFToken(HttpServletRequest httpServletRequest){
        return (CsrfToken) httpServletRequest.getAttribute("_csrf");
    }
}
