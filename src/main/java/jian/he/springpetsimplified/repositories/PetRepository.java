package jian.he.springpetsimplified.repositories;

import jian.he.springpetsimplified.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
