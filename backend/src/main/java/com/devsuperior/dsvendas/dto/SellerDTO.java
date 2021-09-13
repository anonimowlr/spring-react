/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;
import java.io.Serializable;

/**
 *
 * @author F5078775
 */
public class SellerDTO implements Serializable{
    
    
    private Long id;
    private String name;

    public SellerDTO() {
    }

    public SellerDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
      public SellerDTO(Seller seller) {
        this.id = seller.getId();
        this.name = seller.getName();
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
}
