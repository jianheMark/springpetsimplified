package jian.he.springpetsimplified.bootstrap;

import jian.he.springpetsimplified.model.Owner;
import jian.he.springpetsimplified.model.Pet;
import jian.he.springpetsimplified.service.OwnerService;
import jian.he.springpetsimplified.service.PetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private OwnerService ownerService;
    private PetService petService;

    public DataLoader(OwnerService ownerService, PetService petService) {
        this.ownerService = ownerService;
        this.petService = petService;
    }


    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData() {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1231231234");

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("1231231234");

        Pet mikesPet = new Pet();
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        owner2.getPets().add(fionasCat);

        ownerService.save(owner1);
        ownerService.save(owner2);

    }
}
