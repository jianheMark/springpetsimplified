package jian.he.springpetsimplified.service;

import jian.he.springpetsimplified.model.Owner;
import jian.he.springpetsimplified.repositories.OwnerRepository;
import jian.he.springpetsimplified.repositories.PetRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public  class OwnerService  {
    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;

    public OwnerService(OwnerRepository ownerRepository, PetRepository petRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
    }

    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

    public void delete(Owner owner){
        ownerRepository.delete(owner);
    }
    public List<Owner> getOwners(){
        return ownerRepository.findAll();
    }

    public Owner findById(Long ownerId) {
        return ownerRepository.findById(ownerId).get();
    }


}
