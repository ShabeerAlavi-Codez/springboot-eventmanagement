package com.miniproject.eventmanagement.conrtoller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.miniproject.eventmanagement.servies.TypesServices;
import com.miniproject.eventmanagement.model.Types;

@RestController
@RequestMapping("/types")
   
public class TypesController{
    
   
    final TypesServices typesServices;

    @Autowired
     public TypesController(TypesServices typesServices) {
        this.typesServices = typesServices;
    }
    
    @CrossOrigin
    @GetMapping()
    public List<Types> getAllTypes() {
        System.out.println("*********************get typesss******************************");
        return typesServices.getAllTypes();
    }
     @CrossOrigin
      @PostMapping()
    public ResponseEntity<Types> createTypes(@RequestBody Types types) {
           
        Types savedTypes = typesServices.createTypes(types);
            // System.out.println(new ResponseEntity<>(savedTypes, HttpStatus.CREATED));
        return new ResponseEntity<>(savedTypes, HttpStatus.CREATED);
    
    }

}
