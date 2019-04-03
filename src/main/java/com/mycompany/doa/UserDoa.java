/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.doa;


/**
 *
 * @author Regis charles
 */
import com.mycompany.model.Inventory;
import com.mycompany.model.User;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
public class UserDoa implements doaInterface  {
    private JdbcTemplate template;
    public void setTemplate(JdbcTemplate template ){
    this.template=template;
    }
    public void save(User user){
    String sql="insert into user values('"+ user.getUsername() + "' , "+user.getPassword()+")";
    template.execute(sql);
    }
       public void invest(Inventory inventory) {
     String sql="insert into inventory (productName,price,quantity) values('"+inventory.getProductName()+"',"+inventory.getPrice()+","+inventory.getQuantity()+")";
     template.execute(sql);
    }

    public int update(Inventory inventory) {
return 0;
    }

  

    public void delete(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<User> getAllRecords() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
