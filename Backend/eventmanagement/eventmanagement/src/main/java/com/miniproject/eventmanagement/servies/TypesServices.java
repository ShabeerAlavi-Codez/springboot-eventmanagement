package com.miniproject.eventmanagement.servies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miniproject.eventmanagement.model.*;
import java.util.*;
import com.miniproject.eventmanagement.repository.*;

@Service

public class TypesServices {
    private final TypesRepository typesRepository;
    @Autowired
    
    public TypesServices(TypesRepository typesRepository) {
        this.typesRepository = typesRepository;
    }
    public List<Types> getAllTypes(){
        return typesRepository.findAll();
    }
    public Types createTypes(Types types) {
        // Add any business logic or validation here before saving the user.
        return typesRepository.save(types);
    }
	public java.sql.Types createTypes(java.sql.Types types) {
		return null;
	}
}
