package jian.he.springpetsimplified.service;

import jian.he.springpetsimplified.model.Owner;
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
        Owner owner = ownerRepository.findById(pet.getId()).get();
        Pet savedPet = new Pet();
        savedPet.setOwner(owner);
        savedPet.setName(pet.getName());
        savedPet.setBirthDate(pet.getBirthDate());
        return petRepository.save(savedPet);
    }
}
