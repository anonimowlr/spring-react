/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devsuperior.dsvendas.service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author F5078775
 */
@Service
public class SellerService {
    
 
    @Autowired
    private SellerRepository sellerRepository;
    
    
    
    public List<SellerDTO> listarTodos(){
        
        List<Seller> listSeller =  sellerRepository.findAll();
        
        return listSeller.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
        
    }
    
    
}
