

package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Regis charles
 */
@Controller
public class AddController {
   @Autowired
   ValidationService validate;
    @RequestMapping("/add")
    public String add(@RequestParam String username,@RequestParam String password,ModelMap map){
        boolean check=validate.validateUser(username, password);
        if(check){
            map.put("user", username);
        return "display.jsp";
        }
        
        else{
            map.put("error", "Invalid User login details");
            return "index.jsp";
        }
    }
}
