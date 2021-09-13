/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devsuperior.dsvendas;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.service.SellerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author F5078775
 */

@RestController
@RequestMapping(value= "/sellers")
public class SellerRestController {
    
    
    @Autowired
    private SellerService  sellerService;
    
    
    
    @GetMapping
    public ResponseEntity<List<SellerDTO>> listaTodosSeller(){
        
       List<SellerDTO> listaSellerDTO = sellerService.listarTodos();
       
       return ResponseEntity.ok(listaSellerDTO);
        
    }
    
    
    
    
}
