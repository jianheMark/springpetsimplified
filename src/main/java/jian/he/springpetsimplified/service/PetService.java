package jian.he.springpetsimplified.service;

import jian.he.springpetsimplified.model.Pet;
import jian.he.springpetsimplified.repositories.OwnerRepository;
import jian.he.springpetsimplified.repositories.PetRepository;
import org.springframework.stereotype.Service;

@Service
public class PetService {
    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;

    public PetService(OwnerRepository ownerRepository, PetRepository petRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
    }

    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }
}
