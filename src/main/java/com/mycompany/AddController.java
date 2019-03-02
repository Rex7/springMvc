

package com.mycompany;

import com.mycompany.doa.UserDoa;
import com.mycompany.model.User;
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
   UserDoa userDoa;
    @RequestMapping("/add")
    public String add(@RequestParam String username,@RequestParam String password,ModelMap map){
        User user =new User();
        
       user.setUsername(username);
       user.setPassword(password);
        userDoa.save(user);
        boolean check=true;
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
