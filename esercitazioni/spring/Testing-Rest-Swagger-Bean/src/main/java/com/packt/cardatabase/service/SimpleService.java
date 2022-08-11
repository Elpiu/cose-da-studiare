package com.packt.cardatabase.service;


import com.packt.cardatabase.exception.NotFoundException;
import com.packt.cardatabase.model.entity.Owner;
import com.packt.cardatabase.model.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SimpleService {

    @Autowired
    private OwnerRepository ownerRepository;

    /**
     * Da il nome e cognome concatenato dell'owner
     * @param id owner
     * @return nome + cognome
     */
    public String transformFullName(long id) throws NotFoundException{
        Optional<Owner> owner = ownerRepository.findById(id);
        if (!owner.isPresent())
            throw new NotFoundException("Owner con id:"+id+" non è presente!");
        return owner.get().getFirstname() + " " + owner.get().getLastname();
    }

}
