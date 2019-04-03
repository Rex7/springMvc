

package com.mycompany;


import com.mycompany.doa.UserDoa;
import com.mycompany.model.Inventory;
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
        return "display";
        }
        
        else{
            map.put("error", "Invalid User login details");
            return "index";
        }
    }
    @RequestMapping("/mypage")
    public String mypage(@RequestParam String productName,@RequestParam float price,@RequestParam int quantity,ModelMap map){
   
      if(productName.length()!=0){
          Inventory inventory=new Inventory();
          inventory.setProductName(productName);
         inventory.setPrice(price);
          inventory.setQuantity(quantity);
         userDoa.invest(inventory);
          System.out.println("be here");    
          map.put("message", "successfully submitted");
         return "display";
      }
      else{
          System.out.println("I am in else");
      return "mypage";
      }
    
    }
        @RequestMapping("/homepage")
public String home(){
return "viewpage";
}
   




}
