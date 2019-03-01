/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import org.springframework.stereotype.Service;

/**
 *
 * @author Regis charles
 */
@Service
public class ValidationService {
    public boolean validateUser(String username,String password){
        return username.contains("regis")&&password.contains("charles");
    }
    
}
