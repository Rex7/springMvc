/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Regis charles
 */
@Controller
public class HomeController {
    @RequestMapping("/homepage")
public String home(){
return "viewpage";
}
    
}
