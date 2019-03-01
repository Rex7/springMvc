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
import com.mycompany.model.User;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
public class DataAccessLayer implements doaInterface  {
    private JdbcTemplate template;
    public void setTemplate(JdbcTemplate template ){
    this.template=template;
    }
    public void save(User user){
    String sql="inser into user values("+ user.getUsername() + " , "+user.getPassword()+")";
    template.execute(sql);
    }

  

    public void delete(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<User> getAllRecords() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
